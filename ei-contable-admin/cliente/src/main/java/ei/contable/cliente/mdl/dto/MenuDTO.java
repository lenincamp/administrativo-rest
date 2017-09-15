package ei.contable.cliente.mdl.dto;

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



    public Integer getCodigoMenu() {
        return codigoMenu;
    }

    public void setCodigoMenu(Integer codigoMenu) {
        this.codigoMenu = codigoMenu;
    }

    public ModuloDTO getCodigoModuloDTO() {
        return moduloDTOCol;
    }

    public void setCodigoModuloDTO(ModuloDTO moduloDTOCol) {
        this.moduloDTOCol = moduloDTOCol;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
