package ei.contable.cliente.gestor;

import ei.contable.cliente.mdl.dto.PersonaDTO;
import ei.contable.cliente.vo.PersonaVO;

/**
 * 
 */
public interface IPersonaGestor {

    void guardar(PersonaVO persona);
    void guardar2(PersonaVO person);

    PersonaDTO buscarPersona(Integer id);
    void eliminarPersona(Integer id);

    void editar(PersonaVO person);


}
