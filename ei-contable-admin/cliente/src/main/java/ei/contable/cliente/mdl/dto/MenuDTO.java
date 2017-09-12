package ei.contable.cliente.mdl.dto;

import javax.persistence.*;
import java.sql.Timestamp;
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
    @ManyToOne
    @JoinColumn(name = "\"CODIGOMODULO\"")
    private ModuloDTO codigoModuloDTO;

    /**
     *
     */
    @Column(name = "\"NOMBRE\"", nullable=false)
    private String nombre;

    /**
     *
     */
    @Column(name = "\"URL\"", nullable=false)
    private String url;

    /**
     *
     */
    @Column(name = "\"DESCRIPCION\"", nullable=false)
    private String descripcion;

    /**
     *
     */
    @Column(name = "\"CODIGOUSUARIOREGISTRO\"", nullable=false)
    private Integer codUsuRegistro;

    /**
     *
     */
    @Column(name="\"FECHAREGISTRO\"", nullable=false)
    private Timestamp fechaRegistro;

    /**
     *
     */
    @Column(name="\"FECHAFIN\"")
    private Timestamp fechaFin;

    /**
     *
     * @return
     */
    public Integer getCodigoMenu() {
        return codigoMenu;
    }

    /**
     *
     * @param codigoMenu
     */
    public void setCodigoMenu(Integer codigoMenu) {
        this.codigoMenu = codigoMenu;
    }

    /**
     *
     * @return
     */
    public ModuloDTO getCodigoModuloDTO() {
        return codigoModuloDTO;
    }

    /**
     *
     * @param codigoModuloDTO
     */
    public void setCodigoModuloDTO(ModuloDTO codigoModuloDTO) {
        this.codigoModuloDTO = codigoModuloDTO;
    }

    /**
     *
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * @return
     */
    public String getUrl() {
        return url;
    }

    /**
     *
     * @param url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     *
     * @return
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     *
     * @param descripcion
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     *
     * @return
     */
    public Integer getCodigoUsuarioRegistro() {
        return codUsuRegistro;
    }

    /**
     *
     * @param codUsuRegistro
     */
    public void setCodigoUsuarioRegistro(Integer codUsuRegistro) {
        this.codUsuRegistro = codUsuRegistro;
    }

    /**
     *
     * @return
     */
    public Timestamp getFechaRegistro() {
        return fechaRegistro;
    }

    /**
     *
     * @param fechaRegistro
     */
    public void setFechaRegistro(Timestamp fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    /**
     *
     * @return
     */
    public Timestamp getFechaFin() {
        return fechaFin;
    }

    /**
     *
     * @param fechaFin
     */
    public void setFechaFin(Timestamp fechaFin) {
        this.fechaFin = fechaFin;
    }
}
