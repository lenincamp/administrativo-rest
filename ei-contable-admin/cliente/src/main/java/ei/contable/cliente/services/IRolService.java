package ei.contable.cliente.services;

import ei.contable.cliente.mdl.dto.RolDTO;
import ei.contable.cliente.vo.RolVO;

import java.util.List;

/**
 * @author Lenin-PC
 */
public interface IRolService {
    void save(RolVO modulo);
   RolDTO getById(Integer id);
    void update(RolVO modulo);
    List<RolDTO> getAll();
}
