package ei.contable.cliente.mdl.dto;

import javax.persistence.*;

@Entity
@Table(name="\"SISCONTBLMODULO\"")
public class ModuloDTO {
    @Id
    @Column(name = "\"CODIGOMODULO\"")
    @SequenceGenerator(name = "\"SISCONTBLMODULO_CODIGOMODULO_seq\"", sequenceName = "\"SISCONTBLMODULO_CODIGOMODULO_seq\"", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "\"SISCONTBLMODULO_CODIGOMODULO_seq\"")
    private Integer id;

    @Column(name = "\"CODIGO\"", nullable=false)
    private String codigo;

    @Column(name = "\"NOMBRE\"", nullable=false)
    private String nombre;

    @Column(name = "\"DESCRIPCION\"", nullable=false)
    private String descripcion;

    @Column(name = "\"CODIGOUSUARIOREGISTRO\"", nullable=false)
    private Integer codigoUsuarioRegistro;


    @Column(name="\"FECHAREGISTRO\"", nullable=false)
    @Temporal(TemporalType.TIMESTAMP)
    private java.util.Date fechaRegistro;

    @PrePersist
    protected void onCreate() {
        fechaRegistro = new java.util.Date();
    }

    @Column(name="\"FECHAFIN\"")
    @Temporal(TemporalType.TIMESTAMP)
    private java.util.Date fechaFin;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getCodigoUsuarioRegistro() {
        return codigoUsuarioRegistro;
    }

    public void setCodigoUsuarioRegistro(Integer codigoUsuarioRegistro) {
        this.codigoUsuarioRegistro = codigoUsuarioRegistro;
    }

    public java.util.Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(java.util.Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public java.util.Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(java.util.Date fechaFin) {
        this.fechaFin = fechaFin;
    }
}
