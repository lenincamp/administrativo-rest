package ei.contable.core.persistencia.dao;

import ei.contable.cliente.persistencia.dao.IGenericDAO;
import org.hibernate.*;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.core.GenericTypeResolver;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.io.Serializable;
import java.util.List;
import java.util.StringTokenizer;


/**
 *
 */
@SuppressWarnings("unchecked")
@Repository
public class GenericDAO<T> implements IGenericDAO<T> {
    @Autowired
    SessionFactory sessionFactory;
    protected final Class<T> genericType;

    @PersistenceContext
    EntityManager entityManager;

    public GenericDAO() {
        this.genericType = (Class<T>) GenericTypeResolver.resolveTypeArgument(getClass(), GenericDAO.class);
    }

    /**
     * genericType
     */

    @Override
    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_UNCOMMITTED)
    public T save(T tClass){

        entityManager.persist(tClass);

        return (T)tClass;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_UNCOMMITTED)
    public void update(T t)
    {
        entityManager.merge(t);
    }


    @Override
    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_UNCOMMITTED)
    public void delete(T t)
    {
        Transaction transaction= getCurrentSession().beginTransaction();
        try
        {
            entityManager.remove(entityManager.merge(t));
        }
        catch (HibernateException exception)
        {
            throw exception;
        }
        finally {
            if(getCurrentSession().isOpen())
            {
                getCurrentSession().close();
            }
        }


    }

    /**
     * <p>
     * Devuelve la seccion actual y activa el filtro estado en la session
     * </p>
     *
     * @return a {@link org.hibernate.Session} object.
     */
    protected Session getCurrentSession() {

        return getSessionFactory().openSession();
    }

    /**
     * <p>
     * Getter for the field <code>sessionFactory</code>.
     * </p>
     *
     * @return a {@link org.hibernate.SessionFactory} object.
     */
    protected SessionFactory getSessionFactory() {
        return sessionFactory;
    }



    /**
     * Crea los fetchMode Join anidados segun los . especificados
     *
     * @param criteria
     *            a {@link org.hibernate.Criteria} object.
     * @param path
     *            a {@link java.lang.String} object.
     */
    protected static final void setMultiFetchModeJoin(Criteria criteria, String path) {
        StringTokenizer pathTokenizer = new StringTokenizer(path, ".");
        while (pathTokenizer.hasMoreTokens()) {
            final String nextPath = pathTokenizer.nextToken();
            final String startToCurrentPath = path.substring(0, path.lastIndexOf(nextPath) + nextPath.length());
            criteria.setFetchMode(startToCurrentPath, FetchMode.JOIN);
        }
    }

    /**
     * <p>
     * Realiza fetch join sobre las propiedades especificadas.
     * </p>
     *
     * @param criteria
     *            a {@link org.hibernate.Criteria} object.
     * @param join
     *            a {@link java.lang.String} object.
     */
    protected void fetchJoin(Criteria criteria, String... join) {
        if (join != null) {
            for (String path : join) {
                if (path.contains(".")) {
                    setMultiFetchModeJoin(criteria, path);
                } else {
                    criteria.setFetchMode(path, FetchMode.JOIN);
                }

            }
        }
    }



    /**
     * <p>
     * Crea un criteria activando el filtro estado sobre la clase parametrizada
     * y realiza joins a los atriburos especificados.
     * </p>
     *
     * @param <Q>
     *            El tipo de clase sobre la que se desea realizar el criteria
     *
     * @param clazz
     *            a {@link java.lang.Class} object.
     * @return a {@link org.hibernate.Criteria} object.
     * @param join
     *            a {@link java.lang.String} object.
     */
    protected <Q> Criteria createCriteria(Class<Q> clazz, String... join) {
        Criteria criteria = getCurrentSession().createCriteria(clazz);
        fetchJoin(criteria, join);
        return criteria;
    }


    @Override
    public List<T> findAll()
    {
        Criteria criteria = createCriteria(genericType);
        return criteria.list();
    }


    @Override
    public T findById(Serializable id,String campo, String... join) {
        Criteria criteria = createCriteria(genericType, join);
        criteria.add(Restrictions.eq(campo, id));
        return (T) criteria.uniqueResult();
    }

    @Override
    public T findByGetId(Serializable id)
    {
        Transaction tra= getCurrentSession().beginTransaction();
        try
        {
            T entity= getCurrentSession().get(genericType, id);
            tra.commit();
            return entity;
        }
        catch (HibernateException he)
        {
            throw  he;
        }
        finally {
            getCurrentSession().close();
        }

    }





}
