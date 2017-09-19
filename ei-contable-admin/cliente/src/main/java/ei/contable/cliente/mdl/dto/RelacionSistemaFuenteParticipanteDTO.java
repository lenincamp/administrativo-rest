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
@Table(name="`SISCONTBLRELSISFTEPAR`")
@Where( clause = "`FECHAFIN` IS NULL" )
public class RelacionSistemaFuenteParticipanteDTO extends BaseEntity{

    /**
     *
     */
    @Id
    @Column(name = "`CODIGORELACIONSISTEMAFUENTEPARTICIPANTE`")
    @SequenceGenerator(name = "`SISCONTBLRELSISFTEPAR_CODIGORELACIONSISTEMAFUENTEPARTICIPANTE_seq`", sequenceName = "`SISCONTBLRELSISFTEPAR_CODIGORELACIONSISTEMAFUENTEPARTICIPANTE_seq`", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "`SISCONTBLRELSISFTEPAR_CODIGORELACIONSISTEMAFUENTEPARTICIPANTE_seq`")
    private Integer codigoRelacionSistemaFuenteParticipante;
    /**
     *
     */
    //@Column(name = "`CODIGOSISTEMAFUENTE`", nullable = false)
    /*@JoinColumn(name = "`CODIGOSISTEMAFUENTE`", referencedColumnName = "`CODIGOSISTEMAFUENTE`", insertable = false, updatable = false)
    private Integer codigoSistemaFuente;*/
    /**
     *
     */
    //@Column(name = "`CODIGOPARTICIPANTE`", nullable = false)
    /*@JoinColumn(name = "`CODIGOPARTICIPANTE`", referencedColumnName = "`CODIGOPARTICIPANTE`", insertable = false, updatable = false)
    private Integer codigoParticipante;*/
    /**
     *
     */
    //@Column(name = "`CODIGOUSUARIO`", nullable = false)
    /*@JoinColumn(name = "`CODIGOUSUARIO`", referencedColumnName = "`CODIGOUSUARIO`", insertable = false, updatable = false)
    private Integer codigoUsuario;*/
    /**
     *
     */
    @ManyToOne
    @JoinColumn(name = "`CODIGOSISTEMAFUENTE`", referencedColumnName = "`CODIGOSISTEMAFUENTE`", nullable = false)
    private SistemaFuenteDTO sistemaFuenteDTOCol;
    /**
     *
     */
    @ManyToOne
    @JoinColumn(name = "`CODIGOPARTICIPANTE`", referencedColumnName = "`CODIGOPARTICIPANTE`", nullable = false)
    private ParticipanteDTO participanteDTOCol;
    /**
     *
     */
    @ManyToOne
    @JoinColumn(name = "`CODIGOUSUARIO`", referencedColumnName = "`CODIGOUSUARIO`", nullable = false)
    private UsuarioDTO usuarioDTOCol;

    /**
     *
     * @return
     */
    public Integer getCodigoRelacionSistemaFuenteParticipante() {
        return codigoRelacionSistemaFuenteParticipante;
    }

    /**
     *
     * @return
     */
    public void setCodigoRelacionSistemaFuenteParticipante(Integer codigoRelacionSistemaFuenteParticipante) {
        this.codigoRelacionSistemaFuenteParticipante = codigoRelacionSistemaFuenteParticipante;
    }


    /**
     *
     * @return
     */
    /*public Integer getCodigoSistemaFuente() {
        return codigoSistemaFuente;
    }*/
    /**
     *
     * @return
     */
    /*public void setCodigoSistemaFuente(Integer codigoSistemaFuente) {
        this.codigoSistemaFuente = codigoSistemaFuente;
    }
    */

    /**
     *
     * @return
     */
    /*public Integer getCodigoParticipante() {
        return codigoParticipante;
    }*/
    /**
     *
     * @return
     */
    /*public void setCodigoParticipante(Integer codigoParticipante) {
        this.codigoParticipante = codigoParticipante;
    }*/

    /**
     *
     * @return
     */
    
    /*public Integer getCodigoUsuario() {
        return codigoUsuario;
    }*/
    /**
     *
     * @return
     */
    /*public void setCodigoUsuario(Integer codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }*/

    /**
     *
     * @return
     */
    
    public SistemaFuenteDTO getSistemaFuenteDTOCol() {
        return sistemaFuenteDTOCol;
    }
    /**
     *
     * @return
     */
    public void setSistemaFuenteDTOCol(SistemaFuenteDTO sistemaFuenteDTOCol) {
        this.sistemaFuenteDTOCol = sistemaFuenteDTOCol;
    }

    /**
     *
     * @return
     */
    public ParticipanteDTO getParticipanteDTOCol() {
        return participanteDTOCol;
    }
    /**
     *
     * @return
     */
    public void setParticipanteDTOCol(ParticipanteDTO participanteDTOCol) {
        this.participanteDTOCol = participanteDTOCol;
    }

    /**
     *
     * @return
     */
    public UsuarioDTO getUsuarioDTOCol() {
        return usuarioDTOCol;
    }
    /**
     *
     * @return
     */
    public void setUsuarioDTOCol(UsuarioDTO usuarioDTOCol) {
        this.usuarioDTOCol = usuarioDTOCol;
    }
}
