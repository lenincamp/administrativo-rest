package ei.contable.cliente.mdl.dto;

import org.hibernate.annotations.Where;

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
@Table(name="`SISCONTBLPERFIL`")
@Where( clause = "`FECHAFIN` IS NULL" )
public class PerfilDTO extends BaseEntity{
    /**
     *
     */
    @Id
    @Column(name = "`CODIGOPERFIL`")
    @SequenceGenerator(name = "`SISCONTBLPERFIL_CODIGOPERFIL_seq`", sequenceName = "`SISCONTBLPERFIL_CODIGOPERFIL_seq`", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "`SISCONTBLPERFIL_CODIGOPERFIL_seq`")
    private Integer codigoPerfil;

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
    @OneToMany(mappedBy = "perfilDTOCol")
    private Set<RelacionModuloPerfilDTO> relModPerfilDTOCol;
    /**
     *
     */
    @OneToMany(mappedBy = "perfilDTOCol")
    private Set<RelacionUsuarioPerfilDTO> relUsuPerfilDTOCol;

    /**
     *
     * @return
     */
    public Integer getCodigoPerfil() {
        return codigoPerfil;
    }

    /**
     *
     * @param codigoPerfil
     */
    public void setCodigoPerfil(Integer codigoPerfil) {
        this.codigoPerfil = codigoPerfil;
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
    public Set<RelacionModuloPerfilDTO> getrelModPerfilDTOCol() {
        return relModPerfilDTOCol;
    }

    /**
     *
     * @param relModPerfilDTOCol
     */
    public void setrelModPerfilDTOCol(Set<RelacionModuloPerfilDTO> relModPerfilDTOCol) {
        this.relModPerfilDTOCol = relModPerfilDTOCol;
    }

    /**
     *
     * @return
     */
    public Set<RelacionUsuarioPerfilDTO> getrelUsuPerfilDTOCol() {
        return relUsuPerfilDTOCol;
    }

    /**
     *
     * @param relUsuPerfilDTOCol
     */
    public void setrelUsuPerfilDTOCol(Set<RelacionUsuarioPerfilDTO> relUsuPerfilDTOCol) {
        this.relUsuPerfilDTOCol = relUsuPerfilDTOCol;
    }
}
