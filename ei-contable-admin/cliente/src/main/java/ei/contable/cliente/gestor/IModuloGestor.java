package ei.contable.cliente.gestor;

import ei.contable.cliente.mdl.dto.ModuloDTO;
import ei.contable.cliente.vo.ModuloVO;

public interface IModuloGestor {
    void guardarModulo(ModuloVO modulo);
    ModuloDTO buscarModuloPorId(Integer id);
    void editarModulo(ModuloVO modulo);
    void eliminarModulo(Integer id);
}
