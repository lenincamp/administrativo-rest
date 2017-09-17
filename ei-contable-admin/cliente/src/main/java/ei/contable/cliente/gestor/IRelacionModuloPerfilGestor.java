package ei.contable.cliente.gestor;

import ei.contable.cliente.mdl.dto.RelacionModuloPerfilDTO;
import ei.contable.cliente.vo.RelacionModuloPerfilVO;

import java.util.List;

/**
 *@author Lenin-PC
 */
public interface IRelacionModuloPerfilGestor {
    /**
     *
     * @param modPer
     */
    void save(RelacionModuloPerfilVO modPer);

    /**
     *
     * @param id
     * @return
     */
    RelacionModuloPerfilDTO getById(Integer id);

    /**
     *
     * @param modPer
     */
    void update(RelacionModuloPerfilVO modPer);

    /**
     *
     * @return
     */
    List<RelacionModuloPerfilDTO> getAll();
}
