package ei.contable.core.services;

import ei.contable.cliente.gestor.IMenuGestor;
import ei.contable.cliente.mdl.dto.MenuDTO;
import ei.contable.cliente.services.IMenuService;
import ei.contable.cliente.vo.MenuVO;
import org.springframework.beans.factory.annotation.Autowired;

public class MenuService implements IMenuService {
    @Autowired
    IMenuGestor menuGestor;

    @Override
    public void guardarMenu(MenuVO menu) {
        menuGestor.guardarMenu(menu);
    }

    @Override
    public MenuDTO buscarMenuPorId(Integer id) {
        return menuGestor.buscarMenu(id);
    }

    @Override
    public void editarMenu(MenuVO menu) {
        menuGestor.editarMenu(menu);
    }
}
