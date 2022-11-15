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
@Entity(name="PedidoEntity")
@Table(name="pedido")
public class PedidoEntity implements Serializable{
    private static final long serialVersionUID=1L;
    @Id
    @Column(name="cod_pedido")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;
    @ManyToOne
    @JoinColumn(name="cod_cliente", nullable = false)
    private ClienteEntity cliente;
    @ManyToOne
    @JoinColumn(name="cod_producto", nullable = false)
    private ProductoEntity producto;
    @Column(name="tipo_pedido")
    private String tipo;
    @Column(name="fecha_emi")
    private String fecha;
    @Column(name="hora_emi")
    private String hora;
    @Column(name="estdped")
    private boolean estado;
   
    
            
            
            
}
