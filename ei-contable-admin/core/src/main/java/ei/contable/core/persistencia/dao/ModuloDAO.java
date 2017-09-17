package ei.contable.core.persistencia.dao;

import ei.contable.cliente.mdl.dto.MenuDTO;
import ei.contable.cliente.mdl.dto.ModuloDTO;
import ei.contable.cliente.persistencia.dao.IModuloDAO;
import org.hibernate.Criteria;
import org.hibernate.Session;

import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

@Repository
public class ModuloDAO extends GenericDAO<ModuloDTO> implements IModuloDAO {

    @Override
    public ModuloDTO findModuloMenuById(Integer Id) {
        Session session = getCurrentSession();
        Criteria c = session.createCriteria(MenuDTO.class, "MENU")
        .createAlias("MENU.moduloDTOCol", "MODU")
        /*.setProjection(Projections.projectionList()
        //.add(Projections.property("MOD.codigoModulo").as("codigoModulo"))
        .add(Projections.property("MENU.codigoMenu").as("codigoMenu"))
        )*/.add(Restrictions.eq("MODU.codigoModulo", 2))
               ;


        return (ModuloDTO) c.uniqueResult();


    }
}
