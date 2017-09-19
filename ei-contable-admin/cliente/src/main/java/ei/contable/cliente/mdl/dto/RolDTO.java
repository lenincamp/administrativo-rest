package ei.contable.cliente.mdl.dto;

import org.hibernate.annotations.Where;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import java.util.Set;

/**
 * @author Lenin
 */
@Entity
@Table(name="`SISCONTBLROL`")
@Where( clause = "`FECHAFIN` IS NULL" )
public class  RolDTO extends BaseEntity{
    /**
     *
     */
    @Id
    @Column(name = "`CODIGOROL`")
    @SequenceGenerator(name = "`SISCONTBLROL_CODIGOROL_seq`", sequenceName = "`SISCONTBLROL_CODIGOROL_seq`", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "`SISCONTBLROL_CODIGOROL_seq`")
    private Integer codigoRol;

    /**
     * 
     */
    //@Column(name = "`CODIGOMODULO`", nullable = false)
    /*@JoinColumn(name = "`CODIGOMODULO`", referencedColumnName = "`CODIGOMODULO`", insertable = false, updatable = false)
    private Integer codigoModulo;*/
    /**
     * 
     */
    @Column(name = "`CODIGO`", nullable = false, length = 10)
    private String codigo;
    /**
     * 
     */
    @Column(name = "`NOMBRE`", nullable = false, length = 25)
    private String nombre;
    /**
     * 
     */
    @Column(name = "`DESCRIPCION`", nullable = false, length = 100)
    private String descripcion;
    /**
     * 
     */
    @OneToMany(mappedBy = "rolDTOCol")
    private Set<RelacionRolUsuarioDTO> relRolUsuarioDTOCol;
    /**
     * 
     */
    @ManyToOne
    @JoinColumn(name = "`CODIGOMODULO`", referencedColumnName = "`CODIGOMODULO`", nullable = false)
    private ModuloDTO moduloDTOCol;

    /**
     *
     * @return
     */
    public Integer getCodigoRol() {
        return codigoRol;
    }

    /**
     *
     * @param codigoRol
     */
    public void setCodigoRol(Integer codigoRol) {
        this.codigoRol = codigoRol;
    }

    /**
     *
     * @return
     */

    /*public Integer getCodigoModulo() {
        return codigoModulo;
    }*/

    /**
     *
     * @param codigoModulo
     */
    /*public void setCodigoModulo(Integer codigoModulo) {
        this.codigoModulo = codigoModulo;
    }*/

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


    public Set<RelacionRolUsuarioDTO> getRelRolUsuarioDTOCol() {
        return relRolUsuarioDTOCol;
    }

    /**
     *
     * @param relRolUsuarioDTOCol
     */
    public void setRelRolUsuarioDTOCol(Set<RelacionRolUsuarioDTO> relRolUsuarioDTOCol) {
        this.relRolUsuarioDTOCol = relRolUsuarioDTOCol;
    }

    /**
     *
     * @return
     */

    public ModuloDTO getModuloDTOCol() {
        return moduloDTOCol;
    }

    public void setModuloDTOCol(ModuloDTO moduloDTOCol) {
        this.moduloDTOCol = moduloDTOCol;
    }
}
