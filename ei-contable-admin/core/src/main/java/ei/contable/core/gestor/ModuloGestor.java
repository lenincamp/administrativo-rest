package ei.contable.core.gestor;

import ei.contable.cliente.gestor.IModuloGestor;
import ei.contable.cliente.mdl.dto.ModuloDTO;
import ei.contable.cliente.vo.ModuloVO;
import ei.contable.core.persistencia.dao.ModuloDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ModuloGestor implements IModuloGestor{
    @Autowired
    ModuloDAO moduloDAO;
    //ModuloDTO mod = new ModuloDTO();
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
        mod.setId(modulo.getId());
        mod.setCodigo(modulo.getCodigo());
        mod.setNombre(modulo.getNombre());
        mod.setDescripcion(modulo.getDescripcion());
        mod.setCodigoUsuarioRegistro(modulo.getCodigoUsuarioRegistro());
        mod.setFechaFin(modulo.getFechaFin());
        moduloDAO.update(mod);
    }

    @Override
    public void eliminarModulo(Integer id) {
        ModuloDTO mod = new ModuloDTO();
        mod.setId(id);
        moduloDAO.delete(mod);
    }
}
