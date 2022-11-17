package pe.com.mass.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.mass.entity.DistritoEntity;
import pe.com.mass.repository.DistritoRepository;

@Service
public class DistritoServiceImpl implements DistritoService{
    @Autowired
    private DistritoRepository repositorioDistrito;
  
    @Override
    public List<DistritoEntity> findALL() {
        return repositorioDistrito.findAll(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<DistritoEntity> findAllCustom() {
        return repositorioDistrito.findAllCustom(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Optional<DistritoEntity> findById(Long id) {
        return repositorioDistrito.findById(id); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public DistritoEntity add(DistritoEntity d) {
        return repositorioDistrito.save(d);
    }

    @Override
    public DistritoEntity update(DistritoEntity d) {
        DistritoEntity objdistrito= repositorioDistrito.getById(d.getCodigo());
        BeanUtils.copyProperties(d, objdistrito);
        return repositorioDistrito.save(objdistrito);
    }

    @Override
    public DistritoEntity delete(DistritoEntity d) {
        DistritoEntity objdistrito= repositorioDistrito.getById(d.getCodigo());
        objdistrito.setEstado(false);
        return repositorioDistrito.save(objdistrito);
    }
    
}
