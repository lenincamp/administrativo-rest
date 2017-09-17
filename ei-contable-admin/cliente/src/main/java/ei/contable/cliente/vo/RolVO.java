package ei.contable.cliente.vo;
/**
 * @author Lenin-PC
 */
public class RolVO {
  private Long codigorol;
  private Long codigomodulo;
  private String codigo;
  private String nombre;
  private String descripcion;
  private Long codigousuarioregistro;
  private java.sql.Timestamp fecharegistro;
  private java.sql.Timestamp fechafin;

  public Long getCodigorol() {
    return codigorol;
  }

  public void setCodigorol(Long codigorol) {
    this.codigorol = codigorol;
  }

  public Long getCodigomodulo() {
    return codigomodulo;
  }

  public void setCodigomodulo(Long codigomodulo) {
    this.codigomodulo = codigomodulo;
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

  public Long getCodigousuarioregistro() {
    return codigousuarioregistro;
  }

  public void setCodigousuarioregistro(Long codigousuarioregistro) {
    this.codigousuarioregistro = codigousuarioregistro;
  }

  public java.sql.Timestamp getFecharegistro() {
    return fecharegistro;
  }

  public void setFecharegistro(java.sql.Timestamp fecharegistro) {
    this.fecharegistro = fecharegistro;
  }

  public java.sql.Timestamp getFechafin() {
    return fechafin;
  }

  public void setFechafin(java.sql.Timestamp fechafin) {
    this.fechafin = fechafin;
  }
}
