package ei.contable.core.persistencia.dao;

import ei.contable.cliente.mdl.dto.ModuloDTO;
import ei.contable.cliente.persistencia.dao.IModuloDAO;
import org.springframework.stereotype.Repository;

@Repository
public class ModuloDAO extends GenericDAO<ModuloDTO> implements IModuloDAO {

}
