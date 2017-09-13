package ei.contable.cliente.mdl.dto;

import javax.persistence.*;

@Entity
@Table(name = "\"SISCONTBLRELPARLOC\"")
public class RelacionParticipanteLocalizacionDTO extends BaseEntity{

    @Id
    @Column(name = "\"CODIGORELACIONPARTICIPANTELOCALIZACION\"")
    @SequenceGenerator(name = "\"SISCONTBLRELPARLOC_CODIGORELACIONPARTICIPANTELOCALIZACION_seq\"", sequenceName = "\"SISCONTBLRELPARLOC_CODIGORELACIONPARTICIPANTELOCALIZACION_seq\"", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "\"SISCONTBLRELPARLOC_CODIGORELACIONPARTICIPANTELOCALIZACION_seq\"")
    private Integer codigoParticipanteLocalizacion;

    @Column(name = "\"CODIGOPARTICIPANTE\"")
    private Integer codigoParticipante;


    @Column(name = "\"CODIGOLOCALIZACION\"")
    private Integer codigoLocalizacion;


    @Column(name = "\"CODIGOESQUEMA\"")
    private Integer codigoEsquema;

    @Column(name = "\"CODIGOCATALOGOVALOR\"")
    private Integer codigoCatalogoValor;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "\"CODIGOCATALOGOVALOR\"", insertable = false, updatable = false)
    private CatalogoValorDTO catalogoValor;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "\"CODIGOPARTICIPANTE\"", insertable = false, updatable = false)
    private ParticipanteDTO participante;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "\"CODIGOESQUEMA\"", insertable = false, updatable = false)
    private EsquemaDTO esquema;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "\"CODIGOLOCALIZACION\"", insertable = false, updatable = false)
    private LocalizacionDTO localizacion;


    public Integer getCodigoParticipanteLocalizacion() {
        return codigoParticipanteLocalizacion;
    }

    public void setCodigoParticipanteLocalizacion(Integer codigoParticipanteLocalizacion) {
        this.codigoParticipanteLocalizacion = codigoParticipanteLocalizacion;
    }

    public Integer getCodigoParticipante() {
        return codigoParticipante;
    }

    public void setCodigoParticipante(Integer codigoParticipante) {
        this.codigoParticipante = codigoParticipante;
    }

    public Integer getCodigoLocalizacion() {
        return codigoLocalizacion;
    }

    public void setCodigoLocalizacion(Integer codigoLocalizacion) {
        this.codigoLocalizacion = codigoLocalizacion;
    }

    public Integer getCodigoEsquema() {
        return codigoEsquema;
    }

    public void setCodigoEsquema(Integer codigoEsquema) {
        this.codigoEsquema = codigoEsquema;
    }

    public Integer getCodigoCatalogoValor() {
        return codigoCatalogoValor;
    }

    public void setCodigoCatalogoValor(Integer codigoCatalogoValor) {
        this.codigoCatalogoValor = codigoCatalogoValor;
    }

    public CatalogoValorDTO getCatalogoValor() {
        return catalogoValor;
    }

    public void setCatalogoValor(CatalogoValorDTO catalogoValor) {
        this.catalogoValor = catalogoValor;
    }

    public ParticipanteDTO getParticipante() {
        return participante;
    }

    public void setParticipante(ParticipanteDTO participante) {
        this.participante = participante;
    }

    public EsquemaDTO getEsquema() {
        return esquema;
    }

    public void setEsquema(EsquemaDTO esquema) {
        this.esquema = esquema;
    }

    public LocalizacionDTO getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(LocalizacionDTO localizacion) {
        this.localizacion = localizacion;
    }
}
