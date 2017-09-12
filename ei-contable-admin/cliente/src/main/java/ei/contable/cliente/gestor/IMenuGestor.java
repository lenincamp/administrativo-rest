package ei.contable.cliente.gestor;

import ei.contable.cliente.mdl.dto.MenuDTO;
import ei.contable.cliente.vo.MenuVO;

/**
 * @author Lenin-PC
 */
public interface IMenuGestor {
    void guardarMenu(MenuVO menu);
    MenuDTO buscarMenu(Integer id);
    void editarMenu(MenuVO menu);
}
