package ei.contable.cliente.persistencia.dao;

import ei.contable.cliente.mdl.dto.ModuloDTO;

import java.util.List;
/**
 * @author Lenin-PC
 */

public interface IModuloDAO extends IGenericDAO<ModuloDTO>  {

    List<ModuloDTO> findModuloMenuById(Integer id);
}
