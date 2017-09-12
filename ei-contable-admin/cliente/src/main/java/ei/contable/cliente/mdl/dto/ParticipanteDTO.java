package ei.contable.cliente.mdl.dto;

import javax.persistence.*;

/**
 * @author Dtandazo
 * */
@Entity
@Table(name = "\"SISCONTBLPARTICIPANTE\"")
public class ParticipanteDTO {

    @Id
    @Column(name = "\"CODIGOPARTICIPANTE\"")
    @SequenceGenerator(name = "\"SISCONTBLPARTICIPANTE_CODIGOPARTICIPANTE_seq\"", sequenceName = "\"SISCONTBLPARTICIPANTE_CODIGOPARTICIPANTE_seq\"", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "\"SISCONTBLPARTICIPANTE_CODIGOPARTICIPANTE_seq\"")
    private Integer codigoParticipante;

    @Column(name = "\"CODIGOPARTICIPANTEIDENTIFICACION\"")
    private Integer codigoParticipanteIdentificacion;

    @Column(name = "\"RAZONSOCIAL\"")
    private String razonSocial;

    @Column(name = "\"NOMBRE\"")
    private String nombre;

    @Column(name = "\"APELLIDO\"")
    private String apellido;

    @Column(name = "\"NOMBRECOMPLETO\"")
    private String nombreCompleto;

    @Column(name = "\"NOMBRE1\"")
    private String nombre1;

    @Column(name = "\"NOMBRE2\"")
    private String nombre2;

    @Column(name = "\"APELLIDO1\"")
    private String apellido1;

    @Column(name = "\"APELLIDO2\"")
    private String apellido2;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "\"CODIGOPARTICIPANTEIDENTIFICACION\"", insertable = false, updatable = false)
    private ParticipanteIdentificacionDTO identificacionParticipante;


    public Integer getCodigoParticipante() {
        return codigoParticipante;
    }

    public void setCodigoParticipante(Integer codigoParticipante) {
        this.codigoParticipante = codigoParticipante;
    }

    public Integer getCodigoParticipanteIdentificacion() {
        return codigoParticipanteIdentificacion;
    }

    public void setCodigoParticipanteIdentificacion(Integer codigoParticipanteIdentificacion) {
        this.codigoParticipanteIdentificacion = codigoParticipanteIdentificacion;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getNombre1() {
        return nombre1;
    }

    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    public String getNombre2() {
        return nombre2;
    }

    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public ParticipanteIdentificacionDTO getIdentificacionParticipante() {
        return identificacionParticipante;
    }

    public void setIdentificacionParticipante(ParticipanteIdentificacionDTO identificacionParticipante) {
        this.identificacionParticipante = identificacionParticipante;
    }
}
