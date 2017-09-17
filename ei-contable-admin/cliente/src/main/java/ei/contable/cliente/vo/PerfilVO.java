package ei.contable.cliente.vo;

import java.sql.Timestamp;

/**
 * @author Lenin-PC
 */
public class PerfilVO {
  private Integer codigoPerfil;
  private String codigo;
  private String nombre;
  private String descripcion;
  private Integer codigoUsuarioRegistro;
  private java.sql.Timestamp fechaRegistro;
  private java.sql.Timestamp fechaFin;

  public Integer getCodigoPerfil() {
    return codigoPerfil;
  }

  public void setCodigoPerfil(Integer codigoPerfil) {
    this.codigoPerfil = codigoPerfil;
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
