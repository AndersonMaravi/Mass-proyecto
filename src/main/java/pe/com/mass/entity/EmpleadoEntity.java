package pe.com.mass.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity(name="EmpleadoEntity")
@Table(name="empleado")
public class EmpleadoEntity implements Serializable{
    private static final long serialVersionUID=1L;
    @Id
    @Column(name="cod_empleado")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;
    @ManyToOne
    @JoinColumn(name="cod_distrito", nullable = false)
    private DistritoEntity distrito;
    @ManyToOne
    @JoinColumn(name="cod_cargo", nullable = false)
    private CargoEntity cargo;
    @Column(name="nom_empleado")
    private String nombre;
    @Column(name="ape_empleado")
    private String apelldio;
    @Column(name="dni_empleado")
    private String dni;
    @Column(name="tel_empleado")
    private String telefono;
    @Column(name="dir_empleado")
    private String direccion;
    @Column(name="sexo_empleado")
    private String sexo;
    @Column(name="estemp")
    private boolean estado;
    
    
}
