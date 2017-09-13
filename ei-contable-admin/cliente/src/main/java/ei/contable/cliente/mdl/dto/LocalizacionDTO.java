package ei.contable.cliente.mdl.dto;

import javax.persistence.*;
import org.hibernate.annotations.Filter;
import org.hibernate.annotations.FilterDef;
/**
 * @author Dtandazo
 * */
@Entity
@Table(name = "\"SISCONTBLLOCALIZACION\"")
@FilterDef(name = "fechaFin", defaultCondition = " fechaFin is not null")
@Filter(name = "fechaFin")
public class LocalizacionDTO {

    @Id
    @Column(name = "\"CODIGOLOCALIZACION\"")
    @SequenceGenerator(name = "\"SISCONTBLLOCALIZACION_CODIGOLOCALIZACION_seq\"", sequenceName = "\"SISCONTBLLOCALIZACION_CODIGOLOCALIZACION_seq\"", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "\"SISCONTBLLOCALIZACION_CODIGOLOCALIZACION_seq\"")
    private Integer codigoLocalizacion;

    @Column(name = "\"CATALOGOVALOR\"")
    private Integer codigoCatalogoValor;

    @Column(name = "\"CATALOGOVALORRELACION\"")
    private Integer codigoCatalogoValorRelacion;

    @Column(name = "\"CATALOGOVALORRELACIONPADRE\"")
    private Integer codigoCatalogoValorRelacionPadre;

    @Column(name = "\"DESCRIPCION\"")
    private String descripcion;

    @Column(name = "\"CODIGOPAIS\"")
    private String codigoPais;

    @Column(name = "\"CODIGOPROVINCIA\"")
    private String codigoProvincia;

    @Column(name = "\"CODIGOCIUDAD\"")
    private String codigoCiudad;

    @Column(name = "\"CODIGOPAISTEL\"")
    private String codigoPaisTel;

    @Column(name = "\"CODIGOPROVINCIATEL\"")
    private String codigoProvinciaTel;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "\"CATALOGOVALOR\"", insertable = false, updatable = false)
    private CatalogoValorDTO catalogo;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "\"CATALOGOVALORRELACION\"", insertable = false, updatable = false)
    private CatalogoValorRelacionDTO catalogoRelacion;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "\"CATALOGOVALORRELACIONPADRE\"", insertable = false, updatable = false)
    private CatalogoValorRelacionDTO catalogoRelacionPadre;


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

    public Integer getCodigoCatalogoValorRelacion() {
        return codigoCatalogoValorRelacion;
    }

    public void setCodigoCatalogoValorRelacion(Integer codigoCatalogoValorRelacion) {
        this.codigoCatalogoValorRelacion = codigoCatalogoValorRelacion;
    }

    public Integer getCodigoCatalogoValorRelacionPadre() {
        return codigoCatalogoValorRelacionPadre;
    }

    public void setCodigoCatalogoValorRelacionPadre(Integer codigoCatalogoValorRelacionPadre) {
        this.codigoCatalogoValorRelacionPadre = codigoCatalogoValorRelacionPadre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCodigoPais() {
        return codigoPais;
    }

    public void setCodigoPais(String codigoPais) {
        this.codigoPais = codigoPais;
    }

    public String getCodigoProvincia() {
        return codigoProvincia;
    }

    public void setCodigoProvincia(String codigoProvincia) {
        this.codigoProvincia = codigoProvincia;
    }

    public String getCodigoCiudad() {
        return codigoCiudad;
    }

    public void setCodigoCiudad(String codigoCiudad) {
        this.codigoCiudad = codigoCiudad;
    }

    public String getCodigoPaisTel() {
        return codigoPaisTel;
    }

    public void setCodigoPaisTel(String codigoPaisTel) {
        this.codigoPaisTel = codigoPaisTel;
    }

    public String getCodigoProvinciaTel() {
        return codigoProvinciaTel;
    }

    public void setCodigoProvinciaTel(String codigoProvinciaTel) {
        this.codigoProvinciaTel = codigoProvinciaTel;
    }

    public CatalogoValorDTO getCatalogo() {
        return catalogo;
    }

    public void setCatalogo(CatalogoValorDTO catalogo) {
        this.catalogo = catalogo;
    }

    public CatalogoValorRelacionDTO getCatalogoRelacion() {
        return catalogoRelacion;
    }

    public void setCatalogoRelacion(CatalogoValorRelacionDTO catalogoRelacion) {
        this.catalogoRelacion = catalogoRelacion;
    }

    public CatalogoValorRelacionDTO getCatalogoRelacionPadre() {
        return catalogoRelacionPadre;
    }

    public void setCatalogoRelacionPadre(CatalogoValorRelacionDTO catalogoRelacionPadre) {
        this.catalogoRelacionPadre = catalogoRelacionPadre;
    }
}


