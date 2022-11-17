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
import pe.com.mass.entity.VentaEntity;
import pe.com.mass.repository.VentaRepository;

/**
 *
 * @author Anderson
 */
@Service
public class VentaServiceImpl implements VentaService{

    @Autowired
    private VentaRepository repositorioVenta;
    
    @Override
    public List<VentaEntity> findALL() {
        return repositorioVenta.findAll(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<VentaEntity> findAllCustom() {
        return repositorioVenta.findAllCustom(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Optional<VentaEntity> findById(Long id) {
        return repositorioVenta.findById(id); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public VentaEntity add(VentaEntity v) {
        return repositorioVenta.save(v); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public VentaEntity update(VentaEntity v) {
        VentaEntity objdistrito= repositorioVenta.getById(v.getCodigo());
        BeanUtils.copyProperties(v, objdistrito);
        return repositorioVenta.save(objdistrito); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public VentaEntity delete(VentaEntity v) {
        VentaEntity objdistrito= repositorioVenta.getById(v.getCodigo());
        objdistrito.setEstado(false);
        return repositorioVenta.save(objdistrito); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
