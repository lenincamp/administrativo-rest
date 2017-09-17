package ei.contable.cliente.persistencia.dao;

import ei.contable.cliente.mdl.dto.ModuloDTO;

import java.util.List;


public interface IModuloDAO extends IGenericDAO<ModuloDTO>  {

    List<ModuloDTO> findModuloMenuById(Integer id);
}
