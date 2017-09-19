package ei.contable.cliente.vo;

import java.sql.Timestamp;

/**
 * @author Lenin-PC
 */
public class UsuarioVO {
  private Integer codigoUsuario;
  private String nombreLogin;
  private String password;
  private String codigoSistema;
  private Integer codigoUsuarioRegistro;
  private java.sql.Timestamp fechaRegistro;
  private java.sql.Timestamp fechaFin;

  public Integer getCodigoUsuario() {
    return codigoUsuario;
  }

  public void setCodigoUsuario(Integer codigoUsuario) {
    this.codigoUsuario = codigoUsuario;
  }

  public String getNombreLogin() {
    return nombreLogin;
  }

  public void setNombreLogin(String nombreLogin) {
    this.nombreLogin = nombreLogin;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getCodigoSistema() {
    return codigoSistema;
  }

  public void setCodigoSistema(String codigoSistema) {
    this.codigoSistema = codigoSistema;
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
