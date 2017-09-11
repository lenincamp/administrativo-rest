package ei.contable.cliente.mdl.dto;

import javax.persistence.*;

@Entity
@Table(name="\"SisConTblModulo\"")
public class ModuloDTO {
    @Id
    @Column(name = "\"CodigoModulo\"")
    @SequenceGenerator(name = "\"SisConTblModulo_CodigoModulo_seq\"", sequenceName = "\"SisConTblModulo_CodigoModulo_seq\"", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "\"SisConTblModulo_CodigoModulo_seq\"")
    private Integer id;

    @Column(name = "\"Codigo\"", nullable=false)
    private String codigo;

    @Column(name = "\"Nombre\"", nullable=false)
    private String nombre;

    @Column(name = "\"Descripcion\"", nullable=false)
    private String descripcion;

    @Column(name = "\"CodigoUsuarioRegistro\"", nullable=false)
    private Integer codigoUsuarioRegistro;


    @Column(name="\"FechaRegistro\"", nullable=false)
    @Temporal(TemporalType.TIMESTAMP)
    private java.util.Date fechaRegistro;

    @PrePersist
    protected void onCreate() {
        fechaRegistro = new java.util.Date();
    }

    @Column(name="\"FechaFin\"")
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
