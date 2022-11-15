package pe.com.mass.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity(name="CargoEntity")
@Table(name="cargo")
public class CargoEntity implements Serializable{
    private static final long serialVersionUID=1L;
    @Id
    @Column(name="cod_cargo")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;
    @Column(name="nom_cargo")
    private String nombre;
    @Column(name="estcar")
    private boolean estado;
    
}
