package ei.contable.cliente.mdl.dto;

import org.hibernate.annotations.Filter;
import org.hibernate.annotations.FilterDef;
import org.hibernate.annotations.Filters;
import org.hibernate.annotations.ParamDef;
import org.hibernate.annotations.Where;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


/**
 * @author Lenin-PC
 */
@Entity
@Table(name="`SISCONTBLMENU`")
@Where( clause = "`FECHAFIN` IS NULL" )

@FilterDef(name="activeMenu", parameters=@ParamDef( name="fechaFin", type="Date" ) )
@Filter(name="activeMenu", condition="active = :active")
public class MenuDTO extends  BaseEntity{

    /**
     *
     */
    @Id
    @Column(name = "`CODIGOMENU`")
    @SequenceGenerator(name = "`SINCONTBLMENU_CODIGOMENU_seq`", sequenceName = "`SINCONTBLMENU_CODIGOMENU_seq`", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "`SINCONTBLMENU_CODIGOMENU_seq`")
    private Integer codigoMenu;

    /**
     * Relacion de menu modulos
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "`CODIGOMODULO`", insertable = false, updatable = false)
    private ModuloDTO moduloDTOCol;

    /**
     *
     */
    @Column(name = "`NOMBRE`")
    private String nombre;

    /**
     *
     */
    @Column(name = "`URL`")
    private String url;

    /**
     *
     */
    @Column(name = "`DESCRIPCION`")
    private String descripcion;


    /**
     *
     * @return
     */
    public Integer getCodigoMenu() {
        return codigoMenu;
    }

    /**
     *
     * @param codigoMenu
     */
    public void setCodigoMenu(Integer codigoMenu) {
        this.codigoMenu = codigoMenu;
    }

    /**
     *
     * @return
     */
    public ModuloDTO getCodigoModuloDTO() {
        return moduloDTOCol;
    }

    /**
     *
     * @param moduloDTOCol
     */
    public void setCodigoModuloDTO(ModuloDTO moduloDTOCol) {
        this.moduloDTOCol = moduloDTOCol;
    }

    /**
     *
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * @return
     */
    public String getUrl() {
        return url;
    }

    /**
     *
     * @param url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     *
     * @return
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     *
     * @param descripcion
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
