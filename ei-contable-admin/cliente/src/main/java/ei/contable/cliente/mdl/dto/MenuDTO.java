package ei.contable.cliente.mdl.dto;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name="SisConTblMenu")
public class MenuDTO {
    @Id
    @Column(name = "CodigoMenu")
    @SequenceGenerator(name = "SinConTblMenu_CodigoMenu_seq", sequenceName = "SinConTblMenu_CodigoMenu_seq", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SinConTblMenu_CodigoMenu_seq")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "CodigoModulo")
    private ModuloDTO codigoModuloDTO;

    @Column(name = "Nombre", nullable=false)
    private String nombre;

    @Column(name = "Url", nullable=false)
    private String url;

    @Column(name = "Descripcion", nullable=false)
    private String descripcion;

    @Column(name = "CodigoUsuarioRegistro", nullable=false)
    private Integer codigoUsuarioRegistro;

    @Column(name="FechaRegistro", nullable=false)
    private Timestamp fechaRegistro;

    @Column(name="FechaFin")
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
