/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
@Entity(name="ProductoEntity")
@Table(name="producto")
public class ProductoEntity implements Serializable{
    private static final long serialVersionUID=1L;
    @Id
    @Column(name="cod_producto")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;
    @Column(name="nom_producto")
    private String nombre;
    @Column(name="tipo_producto")
    private String tipo;
    @Column(name="prec_producto")
    private double precio;
    @Column(name="cant_prodcuto")
    private int cantidad;
    @Column(name="desc_producto")
    private double descuento;
    @Column(name="estpro")
    private boolean estado;
}
