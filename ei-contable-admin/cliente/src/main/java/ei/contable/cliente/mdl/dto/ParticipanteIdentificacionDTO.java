package ei.contable.cliente.mdl.dto;

import javax.persistence.*;

/**
 * @author Dtandazo
 * */
@Entity
@Table(name = "\"SISCONTBLPARIDE\"")
public class ParticipanteIdentificacionDTO extends BaseEntity {

    @Id
    @Column(name = "\"CODIGOPARTICIPANTEIDENTIFICACION\"")
    @SequenceGenerator(name = "\"SISCONTBLPARIDE_CODIGOPARTICIPANTEIDENTIFICACION_seq\"", sequenceName = "\"SISCONTBLPARIDE_CODIGOPARTICIPANTEIDENTIFICACION_seq\"", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "\"SISCONTBLPARIDE_CODIGOPARTICIPANTEIDENTIFICACION_seq\"")
    private Integer codigoParticipanteIdentificacion;

    @Column(name = "\"TIPOIDENTIFICACION\"")
    private Integer tipoIdentificacion;

    @Column(name = "\"IDENTIFICACION\"")
    private String identificacion;

    @Column(name = "\"IDENTIFICACIONPRIMARIA\"")
    private Boolean identificacionPrimaria;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "\"TIPOIDENTIFICACION\"", insertable = false, updatable = false)
    private CatalogoValorDTO tipoIdentificacionRel;


    public Integer getCodigoParticipanteIdentificacion() {
        return codigoParticipanteIdentificacion;
    }

    public void setCodigoParticipanteIdentificacion(Integer codigoParticipanteIdentificacion) {
        this.codigoParticipanteIdentificacion = codigoParticipanteIdentificacion;
    }

    public Integer getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public void setTipoIdentificacion(Integer tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public Boolean getIdentificacionPrimaria() {
        return identificacionPrimaria;
    }

    public void setIdentificacionPrimaria(Boolean identificacionPrimaria) {
        this.identificacionPrimaria = identificacionPrimaria;
    }

    public CatalogoValorDTO getTipoIdentificacionRel() {
        return tipoIdentificacionRel;
    }

    public void setTipoIdentificacionRel(CatalogoValorDTO tipoIdentificacionRel) {
        this.tipoIdentificacionRel = tipoIdentificacionRel;
    }
}
