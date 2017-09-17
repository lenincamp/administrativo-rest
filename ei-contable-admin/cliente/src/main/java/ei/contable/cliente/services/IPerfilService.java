package ei.contable.cliente.services;

import ei.contable.cliente.mdl.dto.PerfilDTO;
import ei.contable.cliente.vo.PerfilVO;

import java.util.List;

/**
 * @author Lenin-PC
 */
public interface IPerfilService {
    void save(PerfilVO modulo);
    PerfilDTO getById(Integer id);
    void update(PerfilVO modulo);
    List<PerfilDTO> getAll();

}
