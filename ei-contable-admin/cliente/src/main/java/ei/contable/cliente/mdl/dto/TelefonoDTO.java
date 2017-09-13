package ei.contable.cliente.mdl.dto;

import javax.persistence.*;

@Entity
@Table(name = "\"SISCONTBLTELEFONO\"")
public class TelefonoDTO extends BaseEntity {

    @Id
    @Column(name = "\"CODIGOTELEFONO\"")
    @SequenceGenerator(name = "\"SISCONTBLTELEFONO_CODIGOTELEFONO_seq\"", sequenceName = "\"SISCONTBLTELEFONO_CODIGOTELEFONO_seq\"", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "\"SISCONTBLTELEFONO_CODIGOTELEFONO_seq\"")
    private Integer codigoTelefono;

    @Column(name = "\"CODIGOLOCALIZACION\"")
    private Integer codigoLocalizacion;

    @Column(name = "\"CODIGOCATALOGOVALOR\"")
    private Integer codigoCatalogoValor;

    @Column(name = "\"DESCRIPCION\"")
    private String descripcion;

    @Column(name = "\"CODIGOTIPOTELEFONO\"")
    private String codigoTipoTelefono;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "\"CODIGOCATALOGOVALOR\"", insertable = false, updatable = false)
    private CatalogoValorDTO catalogoValor;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "\"CODIGOLOCALIZACION\"", insertable = false, updatable = false)
    private LocalizacionDTO localizacion;


    public Integer getCodigoTelefono() {
        return codigoTelefono;
    }

    public void setCodigoTelefono(Integer codigoTelefono) {
        this.codigoTelefono = codigoTelefono;
    }

    public Integer getCodigoLocalizacion() {
        return codigoLocalizacion;
    }

    public void setCodigoLocalizacion(Integer codigoLocalizacion) {
        this.codigoLocalizacion = codigoLocalizacion;
    }

    public Integer getCodigoCatalogoValor() {
        return codigoCatalogoValor;
    }

    public void setCodigoCatalogoValor(Integer codigoCatalogoValor) {
        this.codigoCatalogoValor = codigoCatalogoValor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCodigoTipoTelefono() {
        return codigoTipoTelefono;
    }

    public void setCodigoTipoTelefono(String codigoTipoTelefono) {
        this.codigoTipoTelefono = codigoTipoTelefono;
    }

    public CatalogoValorDTO getCatalogoValor() {
        return catalogoValor;
    }

    public void setCatalogoValor(CatalogoValorDTO catalogoValor) {
        this.catalogoValor = catalogoValor;
    }

    public LocalizacionDTO getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(LocalizacionDTO localizacion) {
        this.localizacion = localizacion;
    }
}
