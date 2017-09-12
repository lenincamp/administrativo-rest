package ei.contable.cliente.services;

import ei.contable.cliente.mdl.dto.MenuDTO;
import ei.contable.cliente.vo.MenuVO;

/**
 * @author Lenin-PC
 */
public interface IMenuService {
    void guardarMenu(MenuVO menu);
    MenuDTO buscarMenuPorId(Integer id);
    void editarMenu(MenuVO menu);
}
