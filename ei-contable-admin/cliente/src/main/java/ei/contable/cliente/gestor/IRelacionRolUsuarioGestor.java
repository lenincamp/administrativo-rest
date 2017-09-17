package ei.contable.cliente.gestor;

import ei.contable.cliente.mdl.dto.RelacionRolUsuarioDTO;
import ei.contable.cliente.vo.RelacionRolUsuarioVO;

import java.util.List;

/**
 *@author Lenin-PC
 */
public interface IRelacionRolUsuarioGestor {
    /**
     *
     * @param rolUsu
     */
    void save(RelacionRolUsuarioVO rolUsu);

    /**
     *
     * @param id
     * @return
     */
    RelacionRolUsuarioDTO getById(Integer id);

    /**
     *
     * @param rolUsu
     */
    void update(RelacionRolUsuarioVO rolUsu);

    /**
     *
     * @return
     */
    List<RelacionRolUsuarioDTO> getAll();
}
