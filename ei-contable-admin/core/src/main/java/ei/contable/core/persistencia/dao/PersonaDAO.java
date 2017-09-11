package ei.contable.core.persistencia.dao;

import ei.contable.cliente.mdl.dto.PersonaDTO;
import ei.contable.cliente.persistencia.dao.IPersonaDAO;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;


@Repository
public class PersonaDAO extends GenericDAO<PersonaDTO>  implements IPersonaDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_UNCOMMITTED)
    public void guardar(PersonaDTO persona)
    {
        entityManager.persist(persona);
    }

}
