package ei.contable.cliente.mdl.dto;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="persona")
public class PersonaDTO{

    @Id
    @Column(name = "id")
    @SequenceGenerator(name = "persona_id_seq", sequenceName = "persona_id_seq", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "persona_id_seq")
    private Integer id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellido")
    private String apellido;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
