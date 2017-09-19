package ei.contable.core.gestor;

import ei.contable.cliente.gestor.IRolGestor;
import ei.contable.cliente.mdl.dto.PerfilDTO;
import ei.contable.cliente.mdl.dto.RolDTO;
import ei.contable.cliente.persistencia.dao.IRolDAO;
import ei.contable.cliente.vo.RolVO;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class RolGestor implements IRolGestor {
    @Autowired
    IRolDAO rolDAO;

    @Override
    public void save(RolVO rol) {
        RolDTO rolSave = new RolDTO();
        rolSave.setCodigo(rol.getCodigo());
        rolSave.setDescripcion(rol.getDescripcion());
        rolSave.setNombre(rol.getNombre());
        rolSave.setCodigoUsuarioRegistro(rol.getCodigoUsuarioRegistro());
        rolDAO.save(rolSave);
    }

    @Override
    public RolDTO getById(Integer id) {
        return (RolDTO)rolDAO.findByGetId(id);
    }

    @Override
    public void update(RolVO rol) {
        RolDTO rolUpdate = new RolDTO();
        rolUpdate.setCodigoRol(rol.getCodigoRol());
        rolUpdate.setCodigo(rol.getCodigo());
        rolUpdate.setDescripcion(rol.getDescripcion());
        rolUpdate.setNombre(rol.getNombre());
        rolUpdate.setCodigoUsuarioRegistro(rol.getCodigoUsuarioRegistro());
        rolUpdate.setFechaFin(rol.getFechaFin());
        rolDAO.save(rolUpdate);
    }

    @Override
    public List<RolDTO> getAll() {
        return rolDAO.findAll();
    }
}
