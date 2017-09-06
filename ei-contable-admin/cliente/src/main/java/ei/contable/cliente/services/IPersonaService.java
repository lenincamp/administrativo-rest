package ei.contable.cliente.services;

import ei.contable.cliente.mdl.dto.PersonaDTO;
import ei.contable.cliente.vo.PersonaVO;

public interface IPersonaService {

    void guardar(PersonaVO persona);
    void guardar2(PersonaVO person);
    PersonaDTO buscarPersona(Integer id);
}
