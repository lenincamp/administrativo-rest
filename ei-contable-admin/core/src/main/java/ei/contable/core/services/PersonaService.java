package ei.contable.core.services;

import ei.contable.cliente.gestor.IPersonaGestor;
import ei.contable.cliente.mdl.dto.PersonaDTO;
import ei.contable.cliente.vo.PersonaVO;
import org.springframework.stereotype.Service;
import ei.contable.cliente.services.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class PersonaService implements IPersonaService {

    @Autowired
    private IPersonaGestor personGest;


    @Override
    public void guardar(PersonaVO persona)
    {
        personGest.guardar(persona);
    }
    @Override
    public void guardar2(PersonaVO persona)
    {
        personGest.guardar2(persona);
    }

    @Override
    public PersonaDTO buscarPersona(Integer id) {
        return personGest.buscarPersona(id);
    }


    @Override
    public void editarPersona(PersonaVO person) {
        personGest.editar(person);
    }

    @Override
    public void eliminarPersona(Integer id) {
        personGest.eliminarPersona(id);
    }

}
