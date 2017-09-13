package ei.contable.cliente.mdl.dto;


import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.util.Date;

/**
 * @author Dtandazo
 * */
@MappedSuperclass
public class BaseEntity {

    @Column(name = "\"CODIGOUSUARIOREGISTRO\"")
    private Integer codigoUsuarioRegistro;

    @Column(name = "\"FECHAREGISTRO\"")
    private Date fechaRegistro=new Date();

    @Column(name = "\"FECHAFIN\"")
    private Date fechaFin;


    public Integer getCodigoUsuarioRegistro() {
        return codigoUsuarioRegistro;
    }

    public void setCodigoUsuarioRegistro(Integer codigoUsuarioRegistro) {
        this.codigoUsuarioRegistro = codigoUsuarioRegistro;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }
}
