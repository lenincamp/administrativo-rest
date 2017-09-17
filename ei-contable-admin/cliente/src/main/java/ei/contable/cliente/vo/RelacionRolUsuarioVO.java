package ei.contable.cliente.vo;
/**
 * @author Lenin-PC
 */
public class RelacionRolUsuarioVO {
  private Long codigorolusuario;
  private Long codigousuario;
  private Long codigorol;
  private Long codigousuarioregistro;
  private java.sql.Timestamp fecharegistro;
  private java.sql.Timestamp fechafin;

  public Long getCodigorolusuario() {
    return codigorolusuario;
  }

  public void setCodigorolusuario(Long codigorolusuario) {
    this.codigorolusuario = codigorolusuario;
  }

  public Long getCodigousuario() {
    return codigousuario;
  }

  public void setCodigousuario(Long codigousuario) {
    this.codigousuario = codigousuario;
  }

  public Long getCodigorol() {
    return codigorol;
  }

  public void setCodigorol(Long codigorol) {
    this.codigorol = codigorol;
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
