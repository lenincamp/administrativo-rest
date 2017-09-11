package ei.contable.cliente.services;
import ei.contable.cliente.mdl.dto.ModuloDTO;
import ei.contable.cliente.vo.ModuloVO;
public interface IModuloService {
    void guardarModulo(ModuloVO modulo);
    ModuloDTO buscarModuloPorId(Integer id);
    void editarModulo(ModuloVO modulo);
    void eliminarModulo(Integer id);
}
