package ei.contable.cliente.mdl.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * @author Lenin
 */
@Entity
@Table(name="`SISCONTBLRELUSUPER`")
public class RelUsuPerDTO {

    /**
     *
     */
    @Id
    @Column(name = "`CODIGOUSUARIOPERFIL`")
    @SequenceGenerator(name = "`SISCONTBLRELUSUPER_CODIGOUSUARIOPERFIL_seq`", sequenceName = "`SISCONTBLRELUSUPER_CODIGOUSUARIOPERFIL_seq`", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "`SISCONTBLRELUSUPER_CODIGOUSUARIOPERFIL_seq`")
    private Integer codigoUsuarioPerfil;
    /**
     *
     */
    //@Column(name = "`CODIGOUSUARIO`", nullable = false)
    @JoinColumn(name = "`CODIGOUSUARIO`", referencedColumnName = "`CODIGOUSUARIO`", insertable = false, updatable = false)
    private Integer codigoUsuario;
    /**
     *
     */
    //@Column(name = "`CODIGOPERFIL`", nullable = false)
    @JoinColumn(name = "`CODIGOPERFIL`", referencedColumnName = "`CODIGOPERFIL`", insertable = false, updatable = false)
    private Integer codigoPerfil;
    /**
     *
     */
    @ManyToOne
    @JoinColumn(name = "`CODIGOUSUARIO`", referencedColumnName = "`CODIGOUSUARIO`", nullable = false)
    private UsuarioDTO usuarioDTOCol;
    /**
     *
     */
    @ManyToOne
    @JoinColumn(name = "`CODIGOPERFIL`", referencedColumnName = "`CODIGOPERFIL`", nullable = false)
    private PerfilDTO perfilDTOCol;

    /**
     *
     * @return
     */
    public Integer getCodigoUsuarioPerfil() {
        return codigoUsuarioPerfil;
    }

    /**
     *
     * @param codigoUsuarioPerfil
     */
    public void setCodigoUsuarioPerfil(Integer codigoUsuarioPerfil) {
        this.codigoUsuarioPerfil = codigoUsuarioPerfil;
    }

    /**
     *
     * @return
     */

    public Integer getCodigoUsuario() {
        return codigoUsuario;
    }

    /**
     *
     * @param codigoUsuario
     */
    public void setCodigoUsuario(Integer codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }

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


    public UsuarioDTO getusuarioDTOCol() {
        return usuarioDTOCol;
    }

    /**
     *
     * @param usuarioDTOCol
     */
    public void setusuarioDTOCol(UsuarioDTO usuarioDTOCol) {
        this.usuarioDTOCol = usuarioDTOCol;
    }

    /**
     *
     * @return
     */

    public PerfilDTO getperfilDTOCol() {
        return perfilDTOCol;
    }

    /**
     *
     * @param perfilDTOCol
     */
    public void setperfilDTOCol(PerfilDTO perfilDTOCol) {
        this.perfilDTOCol = perfilDTOCol;
    }
}
