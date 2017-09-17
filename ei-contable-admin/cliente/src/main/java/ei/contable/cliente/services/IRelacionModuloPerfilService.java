package ei.contable.cliente.services;

import ei.contable.cliente.mdl.dto.RelacionModuloPerfilDTO;
import ei.contable.cliente.vo.RelacionModuloPerfilVO;

import java.util.List;

/**
 * @author Lenin-PC
 */
public interface IRelacionModuloPerfilService {
    void save(RelacionModuloPerfilVO modulo);
    RelacionModuloPerfilDTO getById(Integer id);
    void update(RelacionModuloPerfilVO modulo);
    List<RelacionModuloPerfilDTO> getAll();
}
