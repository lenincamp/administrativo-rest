package ei.contable.cliente.gestor;

import ei.contable.cliente.mdl.dto.RolDTO;
import ei.contable.cliente.vo.RolVO;

import java.util.List;

/**
 *@author Lenin-PC
 */
public interface IRolGestor {
    /**
     *
     * @param rol
     */
    void save(RolVO rol);

    /**
     *
     * @param id
     * @return
     */
    RolDTO getById(Integer id);

    /**
     *
     * @param rol
     */
    void update(RolVO rol);

    /**
     *
     * @return
     */
    List<RolDTO> getAll();
}
