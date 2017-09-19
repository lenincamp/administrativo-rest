package ei.contable.core.gestor;

import ei.contable.cliente.gestor.IUsuarioGestor;
import ei.contable.cliente.mdl.dto.UsuarioDTO;
import ei.contable.cliente.persistencia.dao.IUsuarioDAO;
import ei.contable.cliente.vo.UsuarioVO;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UsuarioGestor implements IUsuarioGestor {
    @Autowired
    IUsuarioDAO usuarioDAO;

    @Override
    public void save(UsuarioVO usuario) {
        UsuarioDTO usu = new UsuarioDTO();
        usu.setCodigoSistema(usuario.getCodigoSistema());
        usu.setNombreLogin(usuario.getNombreLogin());
        usu.setPassword(usuario.getPassword());
        usu.setCodigoUsuarioRegistro(usuario.getCodigoUsuarioRegistro());
        usuarioDAO.save(usu);
    }

    @Override
    public UsuarioDTO getById(Integer id) {
        return usuarioDAO.findByGetId(id);
    }

    @Override
    public void update(UsuarioVO usuario) {
        UsuarioDTO usu = new UsuarioDTO();
        usu.setCodigoUsuario(usuario.getCodigoUsuario());
        usu.setCodigoSistema(usuario.getCodigoSistema());
        usu.setNombreLogin(usuario.getNombreLogin());
        usu.setPassword(usuario.getPassword());
        usu.setCodigoUsuarioRegistro(usuario.getCodigoUsuarioRegistro());
        usu.setFechaFin(usuario.getFechaFin());
        usuarioDAO.update(usu);
    }

    @Override
    public List<UsuarioDTO> getAll() {
        return usuarioDAO.findAll();
    }
}
