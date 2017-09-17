package ei.contable.cliente.gestor;

import ei.contable.cliente.mdl.dto.UsuarioDTO;
import ei.contable.cliente.vo.UsuarioVO;

import java.util.List;

/**
 *@author Lenin-PC
 */
public interface IUsuarioGestor {
    /**
     *
     * @param usuario
     */
    void save(UsuarioVO usuario);

    /**
     *
     * @param id
     * @return
     */
    UsuarioDTO getById(Integer id);

    /**
     *
     * @param usuario
     */
    void update(UsuarioVO usuario);

    /**
     *
     * @return
     */
    List<UsuarioDTO> getAll();
}
