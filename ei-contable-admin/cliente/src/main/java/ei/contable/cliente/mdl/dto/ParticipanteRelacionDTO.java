package ei.contable.cliente.mdl.dto;

import javax.persistence.*;

/**
 * @author Dtandazo
 * */
@Entity
@Table(name = "\"SISCONTBLPARREL\"")
public class ParticipanteRelacionDTO extends BaseEntity {

    @Id
    @Column(name = "\"CODIGOPARTICIPANTERELACION\"")
    @SequenceGenerator(name = "\"SISCONTBLPARREL_CODIGOPARTICIPANTERELACION_seq\"", sequenceName = "\"SISCONTBLPARREL_CODIGOPARTICIPANTERELACION_seq\"", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "\"SISCONTBLPARREL_CODIGOPARTICIPANTERELACION_seq\"")
    private Integer codigoParticipanteRelacion;

    @Column(name = "\"CODIGOPARTICIPANTE\"")
    private Integer codigoParticipante;

    @Column(name = "\"CODIGOPARTICIPANTEPADRE\"")
    private Integer codigoParticipantePadre;

    @Column(name = "\"CODIGOTIPOPARTICIPANTE\"")
    private Integer codigoTipoParticipante;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "\"CODIGOPARTICIPANTE\"", insertable = false, updatable = false)
    private ParticipanteDTO participante;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "\"CODIGOPARTICIPANTEPADRE\"", insertable = false, updatable = false)
    private ParticipanteDTO participantePadre;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "\"CODIGOTIPOPARTICIPANTE\"", insertable = false, updatable = false)
    private CatalogoValorDTO tipoParticipante;


    public Integer getCodigoParticipanteRelacion() {
        return codigoParticipanteRelacion;
    }

    public void setCodigoParticipanteRelacion(Integer codigoParticipanteRelacion) {
        this.codigoParticipanteRelacion = codigoParticipanteRelacion;
    }

    public Integer getCodigoParticipante() {
        return codigoParticipante;
    }

    public void setCodigoParticipante(Integer codigoParticipante) {
        this.codigoParticipante = codigoParticipante;
    }

    public Integer getCodigoParticipantePadre() {
        return codigoParticipantePadre;
    }

    public void setCodigoParticipantePadre(Integer codigoParticipantePadre) {
        this.codigoParticipantePadre = codigoParticipantePadre;
    }

    public Integer getCodigoTipoParticipante() {
        return codigoTipoParticipante;
    }

    public void setCodigoTipoParticipante(Integer codigoTipoParticipante) {
        this.codigoTipoParticipante = codigoTipoParticipante;
    }

    public ParticipanteDTO getParticipante() {
        return participante;
    }

    public void setParticipante(ParticipanteDTO participante) {
        this.participante = participante;
    }

    public ParticipanteDTO getParticipantePadre() {
        return participantePadre;
    }

    public void setParticipantePadre(ParticipanteDTO participantePadre) {
        this.participantePadre = participantePadre;
    }

    public CatalogoValorDTO getTipoParticipante() {
        return tipoParticipante;
    }

    public void setTipoParticipante(CatalogoValorDTO tipoParticipante) {
        this.tipoParticipante = tipoParticipante;
    }
}
