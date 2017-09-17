package ei.contable.core.gestor;

import ei.contable.cliente.gestor.IMenuGestor;
import ei.contable.cliente.mdl.dto.MenuDTO;
import ei.contable.cliente.persistencia.dao.IMenuDAO;
import ei.contable.cliente.vo.MenuVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MenuGestor implements IMenuGestor {
    @Autowired
    IMenuDAO menuDAO;
    MenuDTO menuDTO = new MenuDTO();
    @Override
    public void guardarMenu(MenuVO menu) {
        menuDTO = null;
        menuDTO.setCodigoUsuarioRegistro(menu.getCodigoUsuarioRegistro());
        menuDTO.setDescripcion(menu.getDescripcion());
        menuDTO.setNombre(menu.getNombre());
        menuDTO.setUrl(menu.getUrl());
        menuDAO.save(menuDTO);
    }

    @Override
    public MenuDTO buscarMenu(Integer id) {
        return menuDAO.findByGetId(id);
    }

    @Override
    public void editarMenu(MenuVO menu) {
        menuDTO = null;
        menuDTO.setCodigoMenu(menu.getCodigoMenu());
        menuDTO.setCodigoUsuarioRegistro(menu.getCodigoUsuarioRegistro());
        menuDTO.setDescripcion(menu.getDescripcion());
        menuDTO.setNombre(menu.getNombre());
        menuDTO.setUrl(menu.getUrl());
        menuDTO.setFechaFin(menu.getFechaFin());
        menuDAO.update(menuDTO);
    }
}
