package ei.contable.cliente.gestor;

import ei.contable.cliente.mdl.dto.ModuloDTO;
import ei.contable.cliente.vo.ModuloVO;

import java.util.Collection;
import java.util.List;
import java.util.Set;

/**
 *@author Lenin-PC
 */
public interface IModuloGestor {
    /**
     *
     * @param modulo
     */
    void guardarModulo(ModuloVO modulo);

    /**
     *
     * @param id
     * @return
     */
    ModuloDTO buscarModuloPorId(Integer id);

    /**
     *
     * @param modulo
     */
    void editarModulo(ModuloVO modulo);

    /**
     *
     * @return
     */
    List<ModuloDTO> getAll();

    /**
     *
     * @param Id
     * @return
     */
    ModuloDTO findModuloMenuById(Integer Id);


}
