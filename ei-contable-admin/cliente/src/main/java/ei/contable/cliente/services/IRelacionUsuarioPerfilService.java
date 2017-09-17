package ei.contable.cliente.services;

import ei.contable.cliente.mdl.dto.RelacionUsuarioPerfilDTO;
import ei.contable.cliente.vo.RelacionUsuarioPerfilVO;

import java.util.List;

/**
 * @author Lenin-PC
 */
public interface IRelacionUsuarioPerfilService {
    void save(RelacionUsuarioPerfilVO modulo);
    RelacionUsuarioPerfilDTO getById(Integer id);
    void update(RelacionUsuarioPerfilVO modulo);
    List<RelacionUsuarioPerfilDTO> getAll();
}
