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
@Entity(name="ClienteEntity")
@Table(name="cliente")
public class ClienteEntity implements Serializable{
    private static final long serialVersionUID=1L;
    @Id
    @Column(name="cod_cliente")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;
    @ManyToOne
    @JoinColumn(name="cod_distrito", nullable = false)
    private DistritoEntity distrito;
    @Column(name="nom_cliente")
    private String nombre;
    @Column(name="ape_cliente")
    private String apellido;
    @Column(name="dni_cliente")
    private String dni;
    @Column(name="tel_cliente")
    private String telefono;
    @Column(name="dir_cliente")
    private String direccion;
    @Column(name="estcli")
    private boolean estado;
    
    
    
}
