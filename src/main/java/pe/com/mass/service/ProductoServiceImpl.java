/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.com.mass.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.mass.entity.ProductoEntity;
import pe.com.mass.repository.ProductoRepository;

/**
 *
 * @author Anderson
 */
@Service
public class ProductoServiceImpl implements ProductoService{

    @Autowired
    private ProductoRepository repositorioProducto;
    
    @Override
    public List<ProductoEntity> findALL() {
        return repositorioProducto.findAll(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<ProductoEntity> findAllCustom() {
        return repositorioProducto.findAllCustom(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Optional<ProductoEntity> findById(Long id) {
        return repositorioProducto.findById(id); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ProductoEntity add(ProductoEntity p) {
        return repositorioProducto.save(p); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ProductoEntity update(ProductoEntity p) {
        ProductoEntity objdistrito= repositorioProducto.getById(p.getCodigo());
        BeanUtils.copyProperties(p, objdistrito);
        return repositorioProducto.save(objdistrito); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ProductoEntity delete(ProductoEntity p) {
        ProductoEntity objdistrito= repositorioProducto.getById(p.getCodigo());
        objdistrito.setEstado(false);
        return repositorioProducto.save(objdistrito); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
