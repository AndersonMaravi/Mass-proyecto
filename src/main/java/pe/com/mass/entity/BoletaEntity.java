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
@Entity(name="BoletaEntity")
@Table(name="boleta")
public class BoletaEntity implements Serializable{
    private static final long serialVersionUID=1L;
    @Id
    @Column(name="cod_boleta")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;
    @ManyToOne
    @JoinColumn(name="cod_comprobante", nullable = false)
    private ComprobanteEntity comprobante;
    @Column(name="num_boleta")
    private double numboleta;
    @Column(name="estdbol")
    private boolean estado;
    
}
