package ei.contable.cliente.mdl.dto;

import org.hibernate.annotations.Filter;
import org.hibernate.annotations.FilterDef;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import java.util.Set;

/**
 * @author Lenin
 */
@Entity
@Table(name="`SISCONTBLMODULO`")
@FilterDef(name = "fechaFin", defaultCondition = " fechaFin is not null")
@Filter(name = "fechaFin")
public class ModuloDTO extends BaseEntity{
    /**
     *
     */
    @Id
    @Column(name = "`CODIGOMODULO`")
    @SequenceGenerator(name = "`SISCONTBLMODULO_CODIGOMODULO_seq`", sequenceName = "`SISCONTBLMODULO_CODIGOMODULO_seq`", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "`SISCONTBLMODULO_CODIGOMODULO_seq`")
    private Integer codigoModulo;
    /**
     *
     */
    @Column(name = "`CODIGO`")
    private String codigo;
    /**
     *
     */
    @Column(name = "`NOMBRE`")
    private String nombre;
    /**
     *
     */
    @Column(name = "`DESCRIPCION`")
    private String descripcion;
    /**
     *
     */
    @OneToMany(mappedBy = "moduloDTOCol")
    private Set<MenuDTO> menuDTOCol;
    /**
     *
     */
    @OneToMany(mappedBy = "moduloDTOCol")
    private Set<RelModPerDTO> relModPerDTOCol;
    /**
     *
     */
    @OneToMany(mappedBy = "moduloDTOCol")
    private Set<RolDTO> rolDTOCol;


    


    /**
     *
     * @return
     */
    public Integer getCodigoModulo() {
        return codigoModulo;
    }

    /**
     *
     * @param codigoModulo
     */
    public void setCodigoModulo(Integer codigoModulo) {
        this.codigoModulo = codigoModulo;
    }

    /**
     *
     * @return
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     *
     * @param codigo
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
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

    /**
     *
     * @return
     */
    public Set<MenuDTO> getmenuDTOCol() {
        return menuDTOCol;
    }

    /**
     *
     * @param menuDTOCol
     */
    public void setmenuDTOCol(Set<MenuDTO> menuDTOCol) {
        this.menuDTOCol = menuDTOCol;
    }

    /**
     * 
     * @return
     */
    public Set<RelModPerDTO> getrelModPerfilDTOCol() {
        return relModPerDTOCol;
    }

    /**
     *
     * @param relModPerDTOCol
     */
    public void setrelModPerfilDTOCol(Set<RelModPerDTO> relModPerDTOCol) {
        this.relModPerDTOCol = relModPerDTOCol;
    }

    /**
     *
     * @return
     */
    public Set<RolDTO> getrolDTOCol() {
        return rolDTOCol;
    }

    /**
     *
     * @param rolDTOCol
     */
    public void setrolDTOCol(Set<RolDTO> rolDTOCol) {
        this.rolDTOCol = rolDTOCol;
    }


}
