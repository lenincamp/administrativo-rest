package ei.contable.core.gestor;

import ei.contable.cliente.gestor.IPersonaGestor;
import ei.contable.cliente.mdl.dto.PersonaDTO;
import ei.contable.cliente.persistencia.dao.IPersonaDAO;
import ei.contable.cliente.vo.PersonaVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PersonaGestor implements IPersonaGestor {

    @Autowired
    IPersonaDAO personaDao;

    public void guardar(PersonaVO persona)
    {
        PersonaDTO personita= new PersonaDTO();
        personita.setNombre(persona.getNombre());
        personita.setApellido(persona.getApellido());
        personaDao.guardar(personita);
    }

    public void guardar2(PersonaVO person)
    {
        PersonaDTO personita= new PersonaDTO();
        personita.setNombre(person.getNombre());
        personita.setApellido(person.getApellido());
        personaDao.save(personita);
    }


    @Override
    public PersonaDTO buscarPersona(Integer id) {
        return (PersonaDTO)personaDao.findById(id,"id", "persona");
    }




}
