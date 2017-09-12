package ei.contable.cliente.mdl.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.SequenceGenerator;
import javax.persistence.GenerationType;
import javax.persistence.PrePersist;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import java.util.Date;

@Entity
@Table(name="\"SISCONTBLMODULO\"")
public class ModuloDTO extends BaseEntity{
    @Id
    @Column(name = "\"CODIGOMODULO\"")
    @SequenceGenerator(name = "\"SISCONTBLMODULO_CODIGOMODULO_seq\"", sequenceName = "\"SISCONTBLMODULO_CODIGOMODULO_seq\"", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "\"SISCONTBLMODULO_CODIGOMODULO_seq\"")
    private Integer codigoModulo;

    @Column(name = "\"CODIGO\"")
    private String codigo;

    @Column(name = "\"NOMBRE\"")
    private String nombre;

    @Column(name = "\"DESCRIPCION\"")
    private String descripcion;


    public Integer getCodigoModulo() {
        return codigoModulo;
    }

    public void setCodigoModulo(Integer codigoModulo) {
        this.codigoModulo = codigoModulo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


}
