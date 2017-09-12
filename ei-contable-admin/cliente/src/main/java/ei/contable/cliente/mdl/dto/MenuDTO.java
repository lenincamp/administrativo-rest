package ei.contable.cliente.mdl.dto;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name="SISCONTBLMENU")
public class MenuDTO {
    @Id
    @Column(name = "CODIGOMENU")
    @SequenceGenerator(name = "SINCONTBLMENU_CODIGOMENU_seq", sequenceName = "SINCONTBLMENU_CODIGOMENU_seq", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SINCONTBLMENU_CODIGOMENU_seq")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "CODIGOMODULO")
    private ModuloDTO codigoModuloDTO;

    @Column(name = "NOMBRE", nullable=false)
    private String nombre;

    @Column(name = "URL", nullable=false)
    private String url;

    @Column(name = "DESCRIPCION", nullable=false)
    private String descripcion;

    @Column(name = "CODIGOUSUARIOREGISTRO", nullable=false)
    private Integer codigoUsuarioRegistro;

    @Column(name="FECHAREGISTRO", nullable=false)
    private Timestamp fechaRegistro;

    @Column(name="FECHAFIN")
    private Timestamp fechaFin;
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
