package ei.contable.cliente.vo;
/**
 * @author Lenin-PC
 */
public class RelacionUsuarioPerfilVO {
  private Long codigousuarioperfil;
  private Long codigousuario;
  private Long codigoperfil;
  private Long codigousuarioregistro;
  private java.sql.Timestamp fecharegistro;
  private java.sql.Timestamp fechafin;

  public Long getCodigousuarioperfil() {
    return codigousuarioperfil;
  }

  public void setCodigousuarioperfil(Long codigousuarioperfil) {
    this.codigousuarioperfil = codigousuarioperfil;
  }

  public Long getCodigousuario() {
    return codigousuario;
  }

  public void setCodigousuario(Long codigousuario) {
    this.codigousuario = codigousuario;
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
