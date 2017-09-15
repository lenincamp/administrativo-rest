package ei.contable.core.persistencia.dao;

import ei.contable.cliente.mdl.dto.MenuDTO;
import ei.contable.cliente.mdl.dto.ModuloDTO;
import ei.contable.cliente.persistencia.dao.IModuloDAO;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Join;
import javax.persistence.criteria.JoinType;
import javax.persistence.criteria.Path;
import javax.persistence.criteria.Root;

@Repository
public class ModuloDAO extends GenericDAO<ModuloDTO> implements IModuloDAO {

    @Override
    public ModuloDTO findModuloMenuById(Integer Id) {

        CriteriaBuilder builder = entityManager.getCriteriaBuilder();

        CriteriaQuery<ModuloDTO> criteria = builder.createQuery( ModuloDTO.class );
        Root<ModuloDTO> root = criteria.from( ModuloDTO.class );

// Phone.person is a @ManyToOne
        Join<ModuloDTO, MenuDTO> personJoin = root.join("menuDTOCol",JoinType.INNER);
// Person.addresses is an @ElementCollection

        criteria.where( builder.and(
                builder.equal(root.get("codigoModulo"), 2)//,
                // builder.equal(root.get("password"), password)
        ) );

        ModuloDTO phones = entityManager.createQuery( criteria ).getSingleResult();

        return phones;
        /*CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        CriteriaQuery<ModuloDTO> query = builder.createQuery( ModuloDTO.class );
        Root<ModuloDTO> root = query.from( ModuloDTO.class );
        root.fetch( "menuDTOCol", JoinType.INNER);
        query.select(root).where(
                builder.and(
                        builder.equal(root.get("codigoModulo"), 2)//,
                       // builder.equal(root.get("password"), password)
                )
        );

        ModuloDTO employee = entityManager.createQuery( query ).getSingleResult();
        return employee;*/
    }
}
