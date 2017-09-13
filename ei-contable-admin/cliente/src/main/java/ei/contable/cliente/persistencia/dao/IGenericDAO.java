package ei.contable.cliente.persistencia.dao;

import java.io.Serializable;
import java.util.List;

public interface IGenericDAO<T>
{

    T save(T tClass);

    void delete(T t);

    void update(T t);

    T findById(Serializable id,String campo,String... join);

    T findByGetId(Serializable id);

    List<T> findAll();



}
