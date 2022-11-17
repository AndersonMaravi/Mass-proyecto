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
import pe.com.mass.entity.PedidoEntity;
import pe.com.mass.repository.PedidoRepository;

/**
 *
 * @author Anderson
 */
@Service
public class PedidoServiceImpl implements PedidoService{
    @Autowired
    private PedidoRepository repositorioPedido;
    @Override
    public List<PedidoEntity> findALL() {
        return repositorioPedido.findAll(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<PedidoEntity> findAllCustom() {
        return repositorioPedido.findAllCustom(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Optional<PedidoEntity> findById(Long id) {
        return repositorioPedido.findById(id); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public PedidoEntity add(PedidoEntity p) {
        return repositorioPedido.save(p); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public PedidoEntity update(PedidoEntity p) {
        PedidoEntity objdistrito= repositorioPedido.getById(p.getCodigo());
        BeanUtils.copyProperties(p, objdistrito);
        return repositorioPedido.save(objdistrito); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public PedidoEntity delete(PedidoEntity p) {
        PedidoEntity objdistrito= repositorioPedido.getById(p.getCodigo());
        objdistrito.setEstado(false);
        return repositorioPedido.save(objdistrito); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
