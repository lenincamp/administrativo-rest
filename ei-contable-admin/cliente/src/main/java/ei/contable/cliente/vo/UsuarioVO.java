package ei.contable.cliente.vo;
/**
 * @author Lenin-PC
 */
public class UsuarioVO {
  private Long codigousuario;
  private String nombrelogin;
  private String password;
  private String codigosistema;
  private Long codigousuarioregistro;
  private java.sql.Timestamp fecharegistro;
  private java.sql.Timestamp fechafin;

  public Long getCodigousuario() {
    return codigousuario;
  }

  public void setCodigousuario(Long codigousuario) {
    this.codigousuario = codigousuario;
  }

  public String getNombrelogin() {
    return nombrelogin;
  }

  public void setNombrelogin(String nombrelogin) {
    this.nombrelogin = nombrelogin;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getCodigosistema() {
    return codigosistema;
  }

  public void setCodigosistema(String codigosistema) {
    this.codigosistema = codigosistema;
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
