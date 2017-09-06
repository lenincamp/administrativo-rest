package ei.contable.core.persistencia.dao;

import ei.contable.cliente.mdl.dto.PersonaDTO;
import ei.contable.cliente.persistencia.dao.IPersonaDAO;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Transactional
@Repository
public class PersonaDAO extends GenericDAO<PersonaDTO>  implements IPersonaDAO {

    @PersistenceContext
    private EntityManager entityManager;

    public void guardar(PersonaDTO persona)
    {
        entityManager.persist(persona);
    }






}
