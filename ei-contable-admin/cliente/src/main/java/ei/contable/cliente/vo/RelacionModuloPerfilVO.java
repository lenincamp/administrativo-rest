package ei.contable.cliente.vo;
/**
 * @author Lenin-PC
 */
public class RelacionModuloPerfilVO {
  private Long codigomoduloperfil;
  private Long codigomodulo;
  private Long codigoperfil;
  private Long codigousuarioregistro;
  private java.sql.Timestamp fecharegistro;
  private java.sql.Timestamp fechafin;

  public Long getCodigomoduloperfil() {
    return codigomoduloperfil;
  }

  public void setCodigomoduloperfil(Long codigomoduloperfil) {
    this.codigomoduloperfil = codigomoduloperfil;
  }

  public Long getCodigomodulo() {
    return codigomodulo;
  }

  public void setCodigomodulo(Long codigomodulo) {
    this.codigomodulo = codigomodulo;
  }

  public Long getCodigoperfil() {
    return codigoperfil;
  }

  public void setCodigoperfil(Long codigoperfil) {
    this.codigoperfil = codigoperfil;
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
