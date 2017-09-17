package ei.contable.core.gestor;

import ei.contable.cliente.gestor.IModuloGestor;
import ei.contable.cliente.mdl.dto.ModuloDTO;
import ei.contable.cliente.persistencia.dao.IModuloDAO;
import ei.contable.cliente.vo.ModuloVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ModuloGestor implements IModuloGestor{
    @Autowired
    IModuloDAO moduloDAO;

    @Override
    public void guardarModulo(ModuloVO modulo) {
        ModuloDTO mod = new ModuloDTO();
        mod.setCodigo(modulo.getCodigo());
        mod.setNombre(modulo.getNombre());
        mod.setDescripcion(modulo.getDescripcion());
        mod.setCodigoUsuarioRegistro(modulo.getCodigoUsuarioRegistro());
        moduloDAO.save(mod);
    }

    @Override
    public ModuloDTO buscarModuloPorId(Integer id) {
        return (ModuloDTO) moduloDAO.findByGetId(id);
    }

    @Override
    public void editarModulo(ModuloVO modulo) {
        ModuloDTO mod = new ModuloDTO();
        mod.setCodigoModulo(modulo.getCodigoModulo());
        mod.setCodigo(modulo.getCodigo());
        mod.setNombre(modulo.getNombre());
        mod.setDescripcion(modulo.getDescripcion());
        mod.setCodigoUsuarioRegistro(modulo.getCodigoUsuarioRegistro());
        mod.setFechaFin(modulo.getFechaFin());
        moduloDAO.update(mod);
    }

    @Override
    public List<ModuloDTO> getAll() {
        return moduloDAO.findAll();
    }

    @Override
    public List<ModuloDTO> findModuloMenuById(Integer Id) {
        return moduloDAO.findModuloMenuById(Id);
    }
}
