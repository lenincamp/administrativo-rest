package ei.contable.core.persistencia.dao;

import ei.contable.cliente.mdl.dto.ModuloDTO;
import ei.contable.cliente.persistencia.dao.IModuloDAO;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.transform.Transformers;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ModuloDAO extends GenericDAO<ModuloDTO> implements IModuloDAO {

    @Override
    public List<ModuloDTO> findModuloMenuById(Integer id) {
        Session session = getCurrentSession();

        /*ProjectionList proList = Projections.projectionList();

        proList.add(Projections.property("MODU.codigoModulo").as("codigoModulo")) ;
        proList.add(Projections.property("MODU.codigo").as("codigo"));
        proList.add(Projections.property("MODU.nombre").as("nombre"));
        proList.add(Projections.property("MODU.descripcion").as("descripcion"));
        proList.add(Projections.property("MODU.codigoUsuarioRegistro").as("codigoUsuarioRegistro"));
        proList.add(Projections.property("MODU.fechaRegistro").as("fechaRegistro"));
        proList.add(Projections.property("MODU.fechaFin").as("fechaFin"));*/

        Criteria c = session.createCriteria(ModuloDTO.class, "MODU")
        //.createAlias("MODU.menuDTOCol", "MENU")
        .setProjection(Projections.projectionList()
        .add(Projections.property("MODU.codigoModulo").as("codigoModulo"))
        .add(Projections.property("MODU.codigo").as("codigo"))
        .add(Projections.property("MODU.nombre").as("nombre"))
        .add(Projections.property("MODU.descripcion").as("descripcion"))
        .add(Projections.property("MODU.codigoUsuarioRegistro").as("codigoUsuarioRegistro"))
        .add(Projections.property("MODU.fechaRegistro").as("fechaRegistro"))
        .add(Projections.property("MODU.fechaFin").as("fechaFin"))
        //.add(Projections.property("MENU.codigoMenu").as("codigoMenu"))
        );
        if(id!=null){
            c.add(Restrictions.eq("MODU.codigoModulo", id));
        }

        c.setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP/*Transformers.aliasToBean(ModuloDTO.class)*/);
        return c.list();
    }

}
