package ei.contable.core.gestor;

import ei.contable.cliente.gestor.IPerfilGestor;
import ei.contable.cliente.mdl.dto.PerfilDTO;
import ei.contable.cliente.persistencia.dao.IPerfilDAO;
import ei.contable.cliente.vo.PerfilVO;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author Lenin-PC
 */
public class PerfilGestor implements IPerfilGestor {
    @Autowired
    IPerfilDAO perfilDAO;

    @Override
    public void save(PerfilVO perfil) {
        PerfilDTO per = new PerfilDTO();
        per.setCodigo(perfil.getCodigo());
        per.setDescripcion(perfil.getDescripcion());
        per.setNombre(perfil.getNombre());
        per.setCodigoUsuarioRegistro(perfil.getCodigoUsuarioRegistro());
        perfilDAO.save(per);
    }

    @Override
    public PerfilDTO getById(Integer id) {
        return (PerfilDTO) perfilDAO.findByGetId(id);
    }

    @Override
    public void update(PerfilVO perfil) {
        PerfilDTO per = new PerfilDTO();
        per.setCodigo(perfil.getCodigo());
        per.setDescripcion(perfil.getDescripcion());
        per.setNombre(perfil.getNombre());
        per.setCodigoUsuarioRegistro(perfil.getCodigoUsuarioRegistro());
        per.setFechaFin(perfil.getFechaFin());
        perfilDAO.update(per);
    }

    @Override
    public List<PerfilDTO> getAll() {
        return perfilDAO.findAll();
    }

}
