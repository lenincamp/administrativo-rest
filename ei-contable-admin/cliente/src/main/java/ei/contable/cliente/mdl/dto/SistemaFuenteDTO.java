package ei.contable.cliente.mdl.dto;

import javax.persistence.*;

@Entity
@Table(name = "\"SISCONTBLSISFUENTE\"")
public class SistemaFuenteDTO extends BaseEntity{

    @Id
    @Column(name = "\"CODIGOSISTEMAFUENTE\"")
    @SequenceGenerator(name = "\"SISCONTBLSISFUENTE_CODIGOSISTEMAFUENTE_seq\"", sequenceName = "\"SISCONTBLSISFUENTE_CODIGOSISTEMAFUENTE_seq\"", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "\"SISCONTBLSISFUENTE_CODIGOSISTEMAFUENTE_seq\"")
    private Integer codigoSistemaFuente;

    @Column(name = "\"NOMBRE\"")
    private String nombre;

    @Column(name = "\"ABREVIATURA\"")
    private String abreviatura;

    @Column(name = "\"DESCRIPCION\"")
    private String descripcion;


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


}
