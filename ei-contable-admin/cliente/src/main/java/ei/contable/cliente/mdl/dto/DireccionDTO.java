package ei.contable.cliente.mdl.dto;

import javax.persistence.*;

@Entity
@Table(name = "\"SISCONTBLDIRECCION\"")
public class DireccionDTO extends BaseEntity {

    @Id
    @Column(name = "\"CODIGODIRECCION\"")
    @SequenceGenerator(name = "\"SISCONTBLDIRECCION_CODIGODIRECCION_seq\"", sequenceName = "\"SISCONTBLDIRECCION_CODIGODIRECCION_seq\"", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "\"SISCONTBLDIRECCION_CODIGODIRECCION_seq\"")
    private Integer codigoDireccion;

    @Column(name = "\"CODIGOLOCALIZACION\"")
    private Integer codigoLocalizacion;

    @Column(name = "\"CODIGOPAIS\"")
    private Integer codigoPais;

    @Column(name = "\"CODIGOPROVINCIA\"")
    private Integer codigoProvincia;

    @Column(name = "\"CODIGOCANTON\"")
    private Integer codigoCanton;

    @Column(name = "\"CODIGOPARROQUIA\"")
    private Integer codigoParroquia;

    @Column(name = "\"CODIGOSECTOR\"")
    private Integer codigoSector;

    @Column(name = "\"CALLEPRINCIPAL\"")
    private String callePrincipal;

    @Column(name = "\"CALLESECUNDARIA\"")
    private String calleSecundaria;

    @Column(name = "\"NUMEROCALLEPRINCIPAL\"")
    private String numeroCallePrincipal;

    @Column(name = "\"NUMEROCALLESECUNDARIA\"")
    private String numeroCalleSecundaria;

    @Column(name = "\"CODIGOPOSTAL\"")
    private String codigoPostal;

    @Column(name = "\"REFERENCIA\"")
    private String referencia;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "\"CODIGOLOCALIZACION\"", insertable = false, updatable = false)
    private LocalizacionDTO localizacion;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "\"CODIGOPAIS\"", insertable = false, updatable = false)
    private LocalizacionDTO pais;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "\"CODIGOPROVINCIA\"", insertable = false, updatable = false)
    private LocalizacionDTO provincia;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "\"CODIGOCANTON\"", insertable = false, updatable = false)
    private LocalizacionDTO canton;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "\"CODIGOPARROQUIA\"", insertable = false, updatable = false)
    private LocalizacionDTO parroquia;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "\"CODIGOSECTOR\"", insertable = false, updatable = false)
    private LocalizacionDTO sector;


    public Integer getCodigoDireccion() {
        return codigoDireccion;
    }

    public void setCodigoDireccion(Integer codigoDireccion) {
        this.codigoDireccion = codigoDireccion;
    }

    public Integer getCodigoLocalizacion() {
        return codigoLocalizacion;
    }

    public void setCodigoLocalizacion(Integer codigoLocalizacion) {
        this.codigoLocalizacion = codigoLocalizacion;
    }

    public Integer getCodigoPais() {
        return codigoPais;
    }

    public void setCodigoPais(Integer codigoPais) {
        this.codigoPais = codigoPais;
    }

    public Integer getCodigoProvincia() {
        return codigoProvincia;
    }

    public void setCodigoProvincia(Integer codigoProvincia) {
        this.codigoProvincia = codigoProvincia;
    }

    public Integer getCodigoCanton() {
        return codigoCanton;
    }

    public void setCodigoCanton(Integer codigoCanton) {
        this.codigoCanton = codigoCanton;
    }

    public Integer getCodigoParroquia() {
        return codigoParroquia;
    }

    public void setCodigoParroquia(Integer codigoParroquia) {
        this.codigoParroquia = codigoParroquia;
    }

    public Integer getCodigoSector() {
        return codigoSector;
    }

    public void setCodigoSector(Integer codigoSector) {
        this.codigoSector = codigoSector;
    }

    public String getCallePrincipal() {
        return callePrincipal;
    }

    public void setCallePrincipal(String callePrincipal) {
        this.callePrincipal = callePrincipal;
    }

    public String getCalleSecundaria() {
        return calleSecundaria;
    }

    public void setCalleSecundaria(String calleSecundaria) {
        this.calleSecundaria = calleSecundaria;
    }

    public String getNumeroCallePrincipal() {
        return numeroCallePrincipal;
    }

    public void setNumeroCallePrincipal(String numeroCallePrincipal) {
        this.numeroCallePrincipal = numeroCallePrincipal;
    }

    public String getNumeroCalleSecundaria() {
        return numeroCalleSecundaria;
    }

    public void setNumeroCalleSecundaria(String numeroCalleSecundaria) {
        this.numeroCalleSecundaria = numeroCalleSecundaria;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public LocalizacionDTO getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(LocalizacionDTO localizacion) {
        this.localizacion = localizacion;
    }

    public LocalizacionDTO getPais() {
        return pais;
    }

    public void setPais(LocalizacionDTO pais) {
        this.pais = pais;
    }

    public LocalizacionDTO getProvincia() {
        return provincia;
    }

    public void setProvincia(LocalizacionDTO provincia) {
        this.provincia = provincia;
    }

    public LocalizacionDTO getCanton() {
        return canton;
    }

    public void setCanton(LocalizacionDTO canton) {
        this.canton = canton;
    }

    public LocalizacionDTO getParroquia() {
        return parroquia;
    }

    public void setParroquia(LocalizacionDTO parroquia) {
        this.parroquia = parroquia;
    }

    public LocalizacionDTO getSector() {
        return sector;
    }

    public void setSector(LocalizacionDTO sector) {
        this.sector = sector;
    }
}
