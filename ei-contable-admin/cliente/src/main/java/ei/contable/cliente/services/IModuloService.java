package ei.contable.cliente.services;
import ei.contable.cliente.mdl.dto.ModuloDTO;
import ei.contable.cliente.vo.ModuloVO;

import java.util.Collection;
import java.util.List;
import java.util.Set;

public interface IModuloService {
    void guardarModulo(ModuloVO modulo);
    ModuloDTO buscarModuloPorId(Integer id);
    void editarModulo(ModuloVO modulo);
    List<ModuloDTO> getAll();
    ModuloDTO findModuloMenuById(Integer Id);
}
