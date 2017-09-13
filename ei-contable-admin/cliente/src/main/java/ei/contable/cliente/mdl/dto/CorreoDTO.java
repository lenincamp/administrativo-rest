package ei.contable.cliente.mdl.dto;

import javax.persistence.*;

@Entity
@Table(name = "\"SISCONTBLCORREO\"")
public class CorreoDTO extends BaseEntity {

    @Id
    @Column(name = "\"CODIGOCORREO\"")
    @SequenceGenerator(name = "\"SISCONTBLCORREO_CODIGOCORREO_seq\"", sequenceName = "\"SISCONTBLCORREO_CODIGOCORREO_seq\"", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "\"SISCONTBLCORREO_CODIGOCORREO_seq\"")
    private Integer codigoCorreo;

    @Column(name = "\"CODIGOLOCALIZACION\"")
    private Integer codigoLocalizacion;

    @Column(name = "\"DESCRIPCION\"")
    private String descripcion;

    @Column(name = "\"DOMINIO\"")
    private String dominio;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "\"CODIGOLOCALIZACION\"", insertable = false, updatable = false)
    private LocalizacionDTO localizacion;


    public Integer getCodigoCorreo() {
        return codigoCorreo;
    }

    public void setCodigoCorreo(Integer codigoCorreo) {
        this.codigoCorreo = codigoCorreo;
    }

    public Integer getCodigoLocalizacion() {
        return codigoLocalizacion;
    }

    public void setCodigoLocalizacion(Integer codigoLocalizacion) {
        this.codigoLocalizacion = codigoLocalizacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDominio() {
        return dominio;
    }

    public void setDominio(String dominio) {
        this.dominio = dominio;
    }

    public LocalizacionDTO getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(LocalizacionDTO localizacion) {
        this.localizacion = localizacion;
    }
}
