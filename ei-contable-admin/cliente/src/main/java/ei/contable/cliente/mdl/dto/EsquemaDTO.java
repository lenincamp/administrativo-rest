package ei.contable.cliente.mdl.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;



@Entity
@Table(name = "\"SISCONTBLESQUEMA\"")
public class EsquemaDTO extends  BaseEntity{

    @Id
    @Column(name = "\"CODIGOESQUEMA\"")
    @SequenceGenerator(name = "\"SISCONTBLESQUEMA_CODIGOESQUEMA_seq\"", sequenceName = "\"SISCONTBLESQUEMA_CODIGOESQUEMA_seq\"", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "\"SISCONTBLESQUEMA_CODIGOESQUEMA_seq\"")
    private Integer codigoEsquema;


    @Column(name = "\"CODIGOSISTEMAFUENTE\"")
    private Integer codigoSistemaFuente;

    @Column(name = "\"NOMBRE\"")
    private String nombre;

    @Column(name = "\"ABREVIATURA\"")
    private String abreviatura;

    @Column(name = "\"DESCRIPCION\"")
    private String descripcion;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "\"CODIGOSISTEMAFUENTE\"", insertable = false, updatable = false)
    private SistemaFuenteDTO sistemaFuente;

    public Integer getCodigoEsquema() {
        return codigoEsquema;
    }

    public void setCodigoEsquema(Integer codigoEsquema) {
        this.codigoEsquema = codigoEsquema;
    }

    public Integer getCodigoSistemaFuente() {
        return codigoSistemaFuente;
    }

    public void setCodigoSistemaFuente(Integer codigoSistemaFuente) {
        this.codigoSistemaFuente = codigoSistemaFuente;
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


    public SistemaFuenteDTO getSistemaFuente() {
        return sistemaFuente;
    }

    public void setSistemaFuente(SistemaFuenteDTO sistemaFuente) {
        this.sistemaFuente = sistemaFuente;
    }
}
