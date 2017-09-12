package ei.contable.cliente.mdl.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.SequenceGenerator;
import javax.persistence.GenerationType;
import javax.persistence.PrePersist;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.ManyToOne;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import java.util.Date;

/**
 * @author Lenin-PC
 */
@Entity
@Table(name="\"SISCONTBLMENU\"")
public class MenuDTO {

    /**
     *
     */
    @Id
    @Column(name = "\"CODIGOMENU\"")
    @SequenceGenerator(name = "\"SINCONTBLMENU_CODIGOMENU_seq\"", sequenceName = "\"SINCONTBLMENU_CODIGOMENU_seq\"", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "\"SINCONTBLMENU_CODIGOMENU_seq\"")
    private Integer codigoMenu;

    /**
     * Relacion de menu modulos
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "\"CODIGOMODULO\"", insertable = false, updatable = false)
    private ModuloDTO codigoModuloDTO;

    /**
     *
     */
    @Column(name = "\"NOMBRE\"")
    private String nombre;

    /**
     *
     */
    @Column(name = "\"URL\"")
    private String url;

    /**
     *
     */
    @Column(name = "\"DESCRIPCION\"")
    private String descripcion;

    /**
     *
     */
    @Column(name = "\"CODIGOUSUARIOREGISTRO\"")
    private Integer codigoUsuarioRegistro;

    @Column(name="\"FECHAREGISTRO\"")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaRegistro;

    @PrePersist
    protected void onCreate() {
        fechaRegistro = new Date();
    }

    @Column(name="\"FECHAFIN\"")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaFin;

    public Integer getCodigoMenu() {
        return codigoMenu;
    }

    public void setCodigoMenu(Integer codigoMenu) {
        this.codigoMenu = codigoMenu;
    }

    public ModuloDTO getCodigoModuloDTO() {
        return codigoModuloDTO;
    }

    public void setCodigoModuloDTO(ModuloDTO codigoModuloDTO) {
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
