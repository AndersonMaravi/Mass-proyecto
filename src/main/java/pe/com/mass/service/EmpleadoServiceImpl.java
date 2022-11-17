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
import pe.com.mass.entity.EmpleadoEntity;
import pe.com.mass.repository.EmpleadoRepository;

/**
 *
 * @author Anderson
 */
@Service
public class EmpleadoServiceImpl implements EmpleadoService{

    @Autowired
    private EmpleadoRepository repositorioEmpleado;
    
    @Override
    public List<EmpleadoEntity> findALL() {
        return repositorioEmpleado.findAll(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<EmpleadoEntity> findAllCustom() {
        return repositorioEmpleado.findAllCustom(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Optional<EmpleadoEntity> findById(Long id) {
        return repositorioEmpleado.findById(id); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public EmpleadoEntity add(EmpleadoEntity e) {
        return repositorioEmpleado.save(e); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public EmpleadoEntity update(EmpleadoEntity e) {
        EmpleadoEntity objdistrito= repositorioEmpleado.getById(e.getCodigo());
        BeanUtils.copyProperties(e, objdistrito);
        return repositorioEmpleado.save(objdistrito); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public EmpleadoEntity delete(EmpleadoEntity e) {
        EmpleadoEntity objdistrito= repositorioEmpleado.getById(e.getCodigo());
        objdistrito.setEstado(false);
        return repositorioEmpleado.save(objdistrito); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
