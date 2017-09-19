package ei.contable.cliente.mdl.dto;

import org.hibernate.annotations.Where;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.JoinColumn;


/**
 * @author Lenin
 */
@Entity
@Table(name="`SISCONTBLRELMODPER`")
@Where( clause = "`FECHAFIN` IS NULL" )
public class RelacionModuloPerfilDTO extends BaseEntity{

    /**
     *
     */
    @Id
    @Column(name = "`CODIGOMODULOPERFIL`")
    @SequenceGenerator(name = "`SISCONTBLRELMODPER_CODIGOMODULOPERFIL_seq`", sequenceName = "`SISCONTBLRELMODPER_CODIGOMODULOPERFIL_seq`", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "`SISCONTBLRELMODPER_CODIGOMODULOPERFIL_seq`")
    private Integer codigoModuloPerfil;

    /**
     *
     */
    //@Column(name = "`CODIGOMODULO`", nullable = false)
    //@JoinColumn(name = "`CODIGOMODULO`", referencedColumnName = "`CODIGOMODULO`", insertable = false, updatable = false)
    //private Integer codigoModulo;

    /**
     *
     */
    //@Column(name = "`CODIGOPERFIL`", nullable = false)
    //@JoinColumn(name = "`CODIGOPERFIL`", referencedColumnName = "`CODIGOPERFIL`", insertable = false, updatable = false)
    //private Integer codigoPerfil;

    /**
     * relación con modulo
     */
    @ManyToOne
    @JoinColumn(name = "`CODIGOMODULO`", referencedColumnName = "`CODIGOMODULO`", nullable = false)
    private ModuloDTO moduloDTOCol;

    /**
     * relación con perfil
     */
    @ManyToOne
    @JoinColumn(name = "`CODIGOPERFIL`", referencedColumnName = "`CODIGOPERFIL`", nullable = false)
    private PerfilDTO perfilDTOCol;

    /**
     *
     * @return
     */
    public Integer getCodigoModuloPerfil() {
        return codigoModuloPerfil;
    }

    /**
     *
     * @param codigoModuloPerfil
     */
    public void setCodigoModuloPerfil(Integer codigoModuloPerfil) {
        this.codigoModuloPerfil = codigoModuloPerfil;
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
     *  @return
     */
    /*public Integer getCodigoPerfil() {
        return codigoPerfil;
    }*/

    /**
     *
     * @param codigoPerfil
     */
    /*public void setCodigoPerfil(Integer codigoPerfil) {
        this.codigoPerfil = codigoPerfil;
    }*/

    /**
     *
     * @return
     */
    public ModuloDTO getModuloDTOCol() {
        return moduloDTOCol;
    }

    /**
     *
     * @param moduloDTOCol
     */
    public void setModuloDTOCol(ModuloDTO moduloDTOCol) {
        this.moduloDTOCol = moduloDTOCol;
    }

    /**
     *
     * @return
     */
    public PerfilDTO getPerfilDTOCol() {
        return perfilDTOCol;
    }

    /**
     *
     * @param perfilDTOCol
     */
    public void setPerfilDTOCol(PerfilDTO perfilDTOCol) {
        this.perfilDTOCol = perfilDTOCol;
    }
}
