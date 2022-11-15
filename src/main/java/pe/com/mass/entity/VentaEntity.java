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
@Entity(name="VentaEntity")
@Table(name="venta")
public class VentaEntity implements Serializable{
    private static final long serialVersionUID=1L;
    @Id
    @Column(name="cod_venta")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;
    @ManyToOne
    @JoinColumn(name="cod_pedido", nullable = false)
    private PedidoEntity pedido;
    @ManyToOne
    @JoinColumn(name="cod_empleado", nullable = false)
    private EmpleadoEntity empleado;
    @Column(name="num_venta")
    private String numventa;
    @Column(name="estdven")
    private boolean estado;
     
}
