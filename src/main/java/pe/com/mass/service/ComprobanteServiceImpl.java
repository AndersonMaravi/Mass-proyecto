package pe.com.mass.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.mass.entity.ComprobanteEntity;
import pe.com.mass.repository.ComprobanteRepository;

@Service
public class ComprobanteServiceImpl implements ComprobanteService{
    @Autowired
    private ComprobanteRepository repositoriocomprobante;
    
    @Override
    public List<ComprobanteEntity> findALL() {
        return repositoriocomprobante.findAll(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<ComprobanteEntity> findAllCustom() {
        return repositoriocomprobante.findAllCustom(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Optional<ComprobanteEntity> findById(Long id) {
        return repositoriocomprobante.findById(id); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ComprobanteEntity add(ComprobanteEntity c) {
        return repositoriocomprobante.save(c);
    }

    @Override
    public ComprobanteEntity update(ComprobanteEntity c) {
        ComprobanteEntity objcomprobante= repositoriocomprobante.getById(c.getCodigo());
        BeanUtils.copyProperties(c, objcomprobante);
        return repositoriocomprobante.save(objcomprobante);
    }

    @Override
    public ComprobanteEntity delete(ComprobanteEntity c) {
        ComprobanteEntity objcomprobante= repositoriocomprobante.getById(c.getCodigo());
        objcomprobante.setEstado(false);
        return repositoriocomprobante.save(objcomprobante);
    }
       
}
