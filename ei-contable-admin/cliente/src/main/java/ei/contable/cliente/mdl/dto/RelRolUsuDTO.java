package ei.contable.cliente.mdl.dto;

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
@Table(name="`SISCONTBLRELROLUSU`")
public class  RelRolUsuDTO{
    /**
     *
     */
    @Id
    @Column(name = "`CODIGOROLUSUARIO`")
    @SequenceGenerator(name = "`SISCONTBLRELROLUSU_CODIGOROLUSUARIO_seq`", sequenceName = "`SISCONTBLRELROLUSU_CODIGOROLUSUARIO_seq`", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "`SISCONTBLRELROLUSU_CODIGOROLUSUARIO_seq`")
    private Integer codigoRolUsuario;

    /**
     *
     */
    //@Column(name = "`CODIGOUSUARIO`", nullable = false)
    @JoinColumn(name = "`CODIGOUSUARIO`", referencedColumnName = "`CODIGOUSUARIO`", insertable = false, updatable = false)
    private Integer codigoUsuario;
    /**
     *
     */
    //@Column(name = "`CODIGOROL`", nullable = false)
    @JoinColumn(name = "`CODIGOROL`", referencedColumnName = "`CODIGOROL`", insertable = false, updatable = false)
    private Integer codigoRol;

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
    @JoinColumn(name = "`CODIGOROL`", referencedColumnName = "`CODIGOROL`", nullable = false)
    private RolDTO rolDTOCol;

    /**
     *
     * @return
     */
    public Integer getCodigoRolUsuario() {
        return codigoRolUsuario;
    }

    /**
     *
     * @param codigoRolUsuario
     */
    public void setCodigoRolUsuario(Integer codigoRolUsuario) {
        this.codigoRolUsuario = codigoRolUsuario;
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
    public RolDTO getrolDTOCol() {
        return rolDTOCol;
    }

    /**
     *
     * @param rolDTOCol
     */
    public void setrolDTOCol(RolDTO rolDTOCol) {
        this.rolDTOCol = rolDTOCol;
    }
}
