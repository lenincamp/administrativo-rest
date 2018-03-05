package ei.contable.cliente.persistencia.dao;

import ei.contable.cliente.mdl.dto.ModuloDTO;
import ei.contable.cliente.vo.MenuVO;
import ei.contable.cliente.vo.ModuloVO;

import java.util.Collection;
import java.util.List;
/**
 * @author Lenin-PC
 */

public interface IModuloDAO extends IGenericDAO<ModuloDTO>  {

    List<ModuloDTO> findModuloMenuById(Integer id);
    void guardarModuloMenu(ModuloVO modulo, Collection<MenuVO> menu);
}
