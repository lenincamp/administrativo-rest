package ei.contable.cliente.vo;

import java.sql.Timestamp;

public class ModuloVO {
    private Integer id;

    private String codigo;

    private String nombre;


    private String descripcion;


    private Integer codigoUsuarioRegistro;


    private Timestamp fechaRegistro;


    private Timestamp fechaFin;

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

    public Timestamp getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Timestamp fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public Timestamp getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Timestamp fechaFin) {
        this.fechaFin = fechaFin;
    }
}
