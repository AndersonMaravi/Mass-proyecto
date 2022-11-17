package pe.com.mass.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.mass.entity.BoletaEntity;
import pe.com.mass.repository.BoletaRepository;

@Service
public class BoletaServiceImpl implements BoletaService{
    @Autowired
    private BoletaRepository repositorioboleta;
    
    
    @Override
    public List<BoletaEntity> findALL() {
        return repositorioboleta.findAll(); 
    }

    @Override
    public List<BoletaEntity> findAllCustom() {
        return repositorioboleta.findAllCustom();
    }

    @Override
    public Optional<BoletaEntity> findById(Long id) {
        return repositorioboleta.findById(id); 
    }

    @Override
    public BoletaEntity add(BoletaEntity b) {
        return repositorioboleta.save(b); 
    }

    @Override
    public BoletaEntity update(BoletaEntity b) {
        BoletaEntity objboleta = repositorioboleta.getById(b.getCodigo());
        BeanUtils.copyProperties(b, objboleta);
        return repositorioboleta.save(objboleta);
    }

    @Override
    public BoletaEntity delete(BoletaEntity b) {
        BoletaEntity objboleta= repositorioboleta.getById(b.getCodigo());
        objboleta.setEstado(false);
        return repositorioboleta.save(objboleta);
    }
    
}
