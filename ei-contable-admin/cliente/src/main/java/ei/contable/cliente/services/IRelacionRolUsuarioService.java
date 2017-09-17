package ei.contable.cliente.services;

import ei.contable.cliente.mdl.dto.RelacionRolUsuarioDTO;
import ei.contable.cliente.vo.RelacionRolUsuarioVO;

import java.util.List;

/**
 * @author Lenin-PC
 */
public interface IRelacionRolUsuarioService {
    void save(RelacionRolUsuarioVO modulo);
    RelacionRolUsuarioDTO getById(Integer id);
    void update(RelacionRolUsuarioVO modulo);
    List<RelacionRolUsuarioDTO> getAll();
}
