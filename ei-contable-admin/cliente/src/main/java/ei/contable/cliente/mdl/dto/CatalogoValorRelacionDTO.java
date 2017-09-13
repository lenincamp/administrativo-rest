package ei.contable.cliente.mdl.dto;

import javax.persistence.*;

/**
 * @author Dtandazo
 * */
@Entity
@Table(name = "\"SISCONTBLCATVALREL\"")
public class CatalogoValorRelacionDTO extends BaseEntity {

    @Id
    @Column(name = "\"CODIGOCATALOGOVALORRELACION\"")
    @SequenceGenerator(name = "\"SISCONTBLCATVALREL_CODIGOCATALOGOVALORRELACION_seq\"", sequenceName = "\"SISCONTBLCATVALREL_CODIGOCATALOGOVALORRELACION_seq\"", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "\"SISCONTBLCATVALREL_CODIGOCATALOGOVALORRELACION_seq\"")
    private Integer codigoCatalogoValorRelacion;

    @Column(name = "\"CODIGOCATALOGOVALOR\"")
    private Integer codigoCatalogoValor;

    @Column(name = "\"CODIGOCATALOGOVALORPADRE\"")
    private Integer codigoCatalogoValorPadre;

    @Column(name = "\"CODIGOCATALOGOVALORACCION\"")
    private Integer codigoCatalogoValorAccion;

    @Column(name = "\"ABREVIATURACATALOGOVALOR\"")
    private String abreviaturaCatalogoValor;

    @Column(name = "\"ABREVIATURACATALOGOVALORPADRE\"")
    private String abreviaturaCatalogoValorPadre;

    @Column(name = "\"ACCION\"")
    private String accion;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "\"CODIGOCATALOGOVALOR\"", insertable = false, updatable = false)
    private CatalogoValorDTO catalogoValor;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "\"CODIGOCATALOGOVALORPADRE\"", insertable = false, updatable = false)
    private CatalogoValorDTO catalogoValorPadre;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "\"CODIGOCATALOGOVALORACCION\"", insertable = false, updatable = false)
    private CatalogoValorDTO catalogoValorAccion;


    public Integer getCodigoCatalogoValorRelacion() {
        return codigoCatalogoValorRelacion;
    }

    public void setCodigoCatalogoValorRelacion(Integer codigoCatalogoValorRelacion) {
        this.codigoCatalogoValorRelacion = codigoCatalogoValorRelacion;
    }

    public Integer getCodigoCatalogoValor() {
        return codigoCatalogoValor;
    }

    public void setCodigoCatalogoValor(Integer codigoCatalogoValor) {
        this.codigoCatalogoValor = codigoCatalogoValor;
    }

    public Integer getCodigoCatalogoValorPadre() {
        return codigoCatalogoValorPadre;
    }

    public void setCodigoCatalogoValorPadre(Integer codigoCatalogoValorPadre) {
        this.codigoCatalogoValorPadre = codigoCatalogoValorPadre;
    }

    public Integer getCodigoCatalogoValorAccion() {
        return codigoCatalogoValorAccion;
    }

    public void setCodigoCatalogoValorAccion(Integer codigoCatalogoValorAccion) {
        this.codigoCatalogoValorAccion = codigoCatalogoValorAccion;
    }

    public String getAbreviaturaCatalogoValor() {
        return abreviaturaCatalogoValor;
    }

    public void setAbreviaturaCatalogoValor(String abreviaturaCatalogoValor) {
        this.abreviaturaCatalogoValor = abreviaturaCatalogoValor;
    }

    public String getAbreviaturaCatalogoValorPadre() {
        return abreviaturaCatalogoValorPadre;
    }

    public void setAbreviaturaCatalogoValorPadre(String abreviaturaCatalogoValorPadre) {
        this.abreviaturaCatalogoValorPadre = abreviaturaCatalogoValorPadre;
    }

    public String getAccion() {
        return accion;
    }

    public void setAccion(String accion) {
        this.accion = accion;
    }

    public CatalogoValorDTO getCatalogoValor() {
        return catalogoValor;
    }

    public void setCatalogoValor(CatalogoValorDTO catalogoValor) {
        this.catalogoValor = catalogoValor;
    }

    public CatalogoValorDTO getCatalogoValorPadre() {
        return catalogoValorPadre;
    }

    public void setCatalogoValorPadre(CatalogoValorDTO catalogoValorPadre) {
        this.catalogoValorPadre = catalogoValorPadre;
    }

    public CatalogoValorDTO getCatalogoValorAccion() {
        return catalogoValorAccion;
    }

    public void setCatalogoValorAccion(CatalogoValorDTO catalogoValorAccion) {
        this.catalogoValorAccion = catalogoValorAccion;
    }
}

