package ei.contable.cliente.vo;

import ei.contable.cliente.mdl.dto.ModuloDTO;

import java.sql.Timestamp;

/**
 * @author Lenin-PC
 */
public class MenuVO {

    private Integer codigoMenu;

    private Integer codigoModuloDTO;

    private String nombre;


    private String url;
    private String descripcion;

    private Integer codigoUsuarioRegistro;


    private Timestamp fechaRegistro;


    private Timestamp fechaFin;

    public Integer getCodigoMenu() {
        return codigoMenu;
    }

    public void setCodigoMenu(Integer codigoMenu) {
        this.codigoMenu = codigoMenu;
    }

    public Integer getCodigoModuloDTO() {
        return codigoModuloDTO;
    }

    public void setCodigoModuloDTO(Integer codigoModuloDTO) {
        this.codigoModuloDTO = codigoModuloDTO;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
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
