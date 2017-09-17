package ei.contable.cliente.services;

import ei.contable.cliente.mdl.dto.UsuarioDTO;
import ei.contable.cliente.vo.UsuarioVO;

import java.util.List;

/**
 * @author Lenin-PC
 */
public interface IUsuarioService {
    void save(UsuarioVO modulo);
    UsuarioDTO getById(Integer id);
    void update(UsuarioVO modulo);
    List<UsuarioDTO> getAll();
}
