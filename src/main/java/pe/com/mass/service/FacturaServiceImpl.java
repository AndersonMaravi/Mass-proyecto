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
import pe.com.mass.entity.FacturaEntity;
import pe.com.mass.repository.FacturaRepository;

/**
 *
 * @author Anderson
 */
@Service
public class FacturaServiceImpl implements FacturaService{
    @Autowired
    private FacturaRepository repositorioFactura;

    @Override
    public List<FacturaEntity> findALL() {
        return repositorioFactura.findAll(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<FacturaEntity> findAllCustom() {
        return repositorioFactura.findAllCustom(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Optional<FacturaEntity> findById(Long id) {
        return repositorioFactura.findById(id);// Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public FacturaEntity add(FacturaEntity f) {
        return repositorioFactura.save(f); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public FacturaEntity update(FacturaEntity f) {
        FacturaEntity objdistrito= repositorioFactura.getById(f.getCodigo());
        BeanUtils.copyProperties(f, objdistrito);
        return repositorioFactura.save(objdistrito); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public FacturaEntity delete(FacturaEntity f) {
        FacturaEntity objdistrito= repositorioFactura.getById(f.getCodigo());
        objdistrito.setEstado(false);
        return repositorioFactura.save(objdistrito); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
