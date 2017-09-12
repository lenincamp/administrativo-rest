package ei.contable.cliente.mdl.dto;

import javax.persistence.*;

@Entity
@Table(name = "\"SISCONTBLCATVALOR\"")
public class CatalogoValorDTO extends BaseEntity{

    @Id
    @Column(name = "\"CODIGOCATALOGOVALOR\"")
    @SequenceGenerator(name = "\"SISCONTBLCATVALOR_CODIGOCATALOGOVALOR_seq\"", sequenceName = "\"SISCONTBLCATVALOR_CODIGOCATALOGOVALOR_seq\"", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "\"SISCONTBLCATVALOR_CODIGOCATALOGOVALOR_seq\"")
    private Integer codigoCatalogoValor;

    @Column(name = "\"CODIGOESQUEMA\"")
    private Integer codigoEsquema;

    @Column(name = "\"NOMBRE\"")
    private String nombre;


    @Column(name = "\"ABREVIATURA\"")
    private String abreviatura;

    @Column(name = "\"DESCRIPCION\"")
    private String descripcion;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "\"CODIGOESQUEMA\"", insertable = false, updatable = false)
    private EsquemaDTO esquema;


    public Integer getCodigoCatalogoValor() {
        return codigoCatalogoValor;
    }

    public void setCodigoCatalogoValor(Integer codigoCatalogoValor) {
        this.codigoCatalogoValor = codigoCatalogoValor;
    }

    public Integer getCodigoEsquema() {
        return codigoEsquema;
    }

    public void setCodigoEsquema(Integer codigoEsquema) {
        this.codigoEsquema = codigoEsquema;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAbreviatura() {
        return abreviatura;
    }

    public void setAbreviatura(String abreviatura) {
        this.abreviatura = abreviatura;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


    public EsquemaDTO getEsquema() {
        return esquema;
    }

    public void setEsquema(EsquemaDTO esquema) {
        this.esquema = esquema;
    }
}
