package ei.contable.cliente.mdl.dto;

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
@Table(name="`SISCONTBLUSUARIO`")
public class  UsuarioDTO{
    /**
     *
     */
    @Id
    @Column(name = "`CODIGOUSUARIO`")
    @SequenceGenerator(name = "`SISCONTBLUSUARIO_CODIGOUSUARIO_seq`", sequenceName = "`SISCONTBLUSUARIO_CODIGOUSUARIO_seq`", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "`SISCONTBLUSUARIO_CODIGOUSUARIO_seq`")
    private Integer codigoUsuario;

    /**
     *
     */
    @Column(name = "`NOMBRELOGIN`", nullable = false, length = 50)
    private String nombreLogin;

    /**
     *
     */
    @Column(name = "`PASSWORD`", nullable = false, length = -1)
    private String password;

    /**
     *
     */
    @Column(name = "`CODIGOSISTEMA`", nullable = false, length = 150)
    private String codigoSistema;
    /**
     *
     */
    @OneToMany(mappedBy = "usuarioDTOCol")
    private Set<RelRolUsuDTO> relRolUsuarioDTOCol;
    /**
     *
     */
    @OneToMany(mappedBy = "usuarioDTOCol")
    private Set<RelSisFteParDTO> relSisFteParticipanteDTOCol;
    /**
     *
     */
    @OneToMany(mappedBy = "usuarioDTOCol")
    private Set<RelUsuPerDTO> relUsuPerfilDTOCol;

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
    public String getNombreLogin() {
        return nombreLogin;
    }

    /**
     *
     * @param nombreLogin
     */
    public void setNombreLogin(String nombreLogin) {
        this.nombreLogin = nombreLogin;
    }
    /**
     *
     */
    public String getPassword() {
        return password;
    }

    /**
     *
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     *
     */
    public String getCodigoSistema() {
        return codigoSistema;
    }

    /**
     *
     * @param codigoSistema
     */
    public void setCodigoSistema(String codigoSistema) {
        this.codigoSistema = codigoSistema;
    }

    /**
     *
     * @return
     */
    
    public Set<RelRolUsuDTO> getrelRolUsuarioDTOCol() {
        return relRolUsuarioDTOCol;
    }

    /**
     *
     * @param relRolUsuarioDTOCol
     */
    public void setrelRolUsuarioDTOCol(Set<RelRolUsuDTO> relRolUsuarioDTOCol) {
        this.relRolUsuarioDTOCol = relRolUsuarioDTOCol;
    }

    
    /**
     *
     */
    public Set<RelSisFteParDTO> getrelSisFteParticipanteDTOCol() {
        return relSisFteParticipanteDTOCol;
    }

    /**
     *
     * @param relSisFteParticipanteDTOCol
     */
    public void setrelSisFteParticipanteDTOCol(Set<RelSisFteParDTO> relSisFteParticipanteDTOCol) {
        this.relSisFteParticipanteDTOCol = relSisFteParticipanteDTOCol;
    }

    /**
     *
     * @return
     */
    public Set<RelUsuPerDTO> getrelUsuPerfilDTOCol() {
        return relUsuPerfilDTOCol;
    }

    /**
     *
     * @param relUsuPerfilDTOCol
     */
    public void setrelUsuPerfilDTOCol(Set<RelUsuPerDTO> relUsuPerfilDTOCol) {
        this.relUsuPerfilDTOCol = relUsuPerfilDTOCol;
    }
}
