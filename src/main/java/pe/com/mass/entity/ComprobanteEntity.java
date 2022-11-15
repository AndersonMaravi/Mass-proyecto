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
@Entity(name="ComprobanteEntity")
@Table(name="comprobante")
public class ComprobanteEntity implements Serializable{
    private static final long serialVersionUID=1L;
    @Id
    @Column(name="cod_comprobante")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;
    @ManyToOne
    @JoinColumn(name="cod_venta", nullable = false)
    private VentaEntity venta;
    @Column(name="tipo_comprobante")
    private String tipo;
    @Column(name="subtotal")
    private double subtotal;
    @Column(name="igv")
    private double igv;
    @Column(name="total")
    private double total;
    @Column(name="estdcom")
    private boolean estado;
}
