package pe.com.mass.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.mass.entity.CargoEntity;
import pe.com.mass.repository.CargoRepository;

@Service
public class CargoServiceImpl implements CargoService{
    @Autowired
    private CargoRepository repositoriocargo;
    
    @Override
    public List<CargoEntity> findALL() {
        return repositoriocargo.findAll(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<CargoEntity> findAllCustom() {
        return repositoriocargo.findAllCustom(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Optional<CargoEntity> findById(Long id) {
        return repositoriocargo.findById(id); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public CargoEntity add(CargoEntity c) {
        return repositoriocargo.save(c); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public CargoEntity update(CargoEntity c) {
        CargoEntity objcargo=repositoriocargo.getById(c.getCodigo()); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        BeanUtils.copyProperties(c, objcargo);
        return repositoriocargo.save(objcargo);
    }

    @Override
    public CargoEntity delete(CargoEntity c) {
        CargoEntity objcargo= repositoriocargo.getById(c.getCodigo()); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        objcargo.setEstado(false);
        return repositoriocargo.save(objcargo);
    }
    
}
