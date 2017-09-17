package ei.contable.cliente.gestor;

import ei.contable.cliente.mdl.dto.PerfilDTO;
import ei.contable.cliente.vo.PerfilVO;

import java.util.List;

/**
 *@author Lenin-PC
 */
public interface IPerfilGestor {
    /**
     *
     * @param perfil
     */
    void save(PerfilVO perfil);

    /**
     *
     * @param id
     * @return
     */
    PerfilDTO getById(Integer id);

    /**
     *
     * @param perfil
     */
    void update(PerfilVO perfil);

    /**
     *
     * @return
     */
    List<PerfilDTO> getAll();

}
