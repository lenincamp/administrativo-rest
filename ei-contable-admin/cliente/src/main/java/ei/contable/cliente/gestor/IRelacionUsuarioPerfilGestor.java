package ei.contable.cliente.gestor;

import ei.contable.cliente.mdl.dto.RelacionUsuarioPerfilDTO;
import ei.contable.cliente.vo.RelacionUsuarioPerfilVO;

import java.util.List;

/**
 *@author Lenin-PC
 */
public interface IRelacionUsuarioPerfilGestor {
    /**
     *
     * @param sisFtePar
     */
    void save(RelacionUsuarioPerfilVO sisFtePar);

    /**
     *
     * @param id
     * @return
     */
    RelacionUsuarioPerfilDTO getById(Integer id);

    /**
     *
     * @param sisFtePar
     */
    void update(RelacionUsuarioPerfilVO sisFtePar);

    /**
     *
     * @return
     */
    List<RelacionUsuarioPerfilDTO> getAll();
}
