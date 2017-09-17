package ei.contable.cliente.vo;
/**
 * @author Lenin-PC
 */
public class RelacionSistemaFuenteParticipanteVO {
  private Long codigorelacionsistemafuenteparticipante;
  private Long codigosistemafuente;
  private Long codigoparticipante;
  private Long codigousuario;
  private Long codigousuarioregistro;
  private java.sql.Timestamp fecharegistro;
  private java.sql.Timestamp fechafin;

  public Long getCodigorelacionsistemafuenteparticipante() {
    return codigorelacionsistemafuenteparticipante;
  }

  public void setCodigorelacionsistemafuenteparticipante(Long codigorelacionsistemafuenteparticipante) {
    this.codigorelacionsistemafuenteparticipante = codigorelacionsistemafuenteparticipante;
  }

  public Long getCodigosistemafuente() {
    return codigosistemafuente;
  }

  public void setCodigosistemafuente(Long codigosistemafuente) {
    this.codigosistemafuente = codigosistemafuente;
  }

  public Long getCodigoparticipante() {
    return codigoparticipante;
  }

  public void setCodigoparticipante(Long codigoparticipante) {
    this.codigoparticipante = codigoparticipante;
  }

  public Long getCodigousuario() {
    return codigousuario;
  }

  public void setCodigousuario(Long codigousuario) {
    this.codigousuario = codigousuario;
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
