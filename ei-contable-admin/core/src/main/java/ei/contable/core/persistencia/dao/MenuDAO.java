package ei.contable.core.persistencia.dao;
import ei.contable.cliente.mdl.dto.MenuDTO;
import ei.contable.cliente.persistencia.dao.IMenuDAO;
import org.springframework.stereotype.Repository;

@Repository
public class MenuDAO extends GenericDAO<MenuDTO> implements IMenuDAO {
}
