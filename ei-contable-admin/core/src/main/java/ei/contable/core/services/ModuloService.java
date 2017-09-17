package ei.contable.core.services;

import ei.contable.cliente.mdl.dto.ModuloDTO;
import ei.contable.cliente.services.IModuloService;
import ei.contable.cliente.vo.ModuloVO;
import ei.contable.cliente.gestor.IModuloGestor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Set;

/**
 * @author Lenin-PC
 */

@Service
public class ModuloService implements IModuloService {
    @Autowired
    private IModuloGestor moduloGestor;

    @Override
    public void guardarModulo(ModuloVO modulo) {
        moduloGestor.guardarModulo(modulo);
    }

    @Override
    public ModuloDTO buscarModuloPorId(Integer id) {
        return moduloGestor.buscarModuloPorId(id);
    }

    @Override
    public void editarModulo(ModuloVO modulo) {
        moduloGestor.editarModulo(modulo);
    }

    @Override
    public List<ModuloDTO> getAll() {
        return moduloGestor.getAll();
    }

    @Override
    public ModuloDTO findModuloMenuById(Integer Id) {

        return  moduloGestor.findModuloMenuById(Id);
    }
}
