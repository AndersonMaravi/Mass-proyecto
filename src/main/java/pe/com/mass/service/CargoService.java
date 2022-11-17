package pe.com.mass.service;

import java.util.List;
import java.util.Optional;
import pe.com.mass.entity.CargoEntity;

public interface CargoService {
    //funcion para mostrar todos los distritos
    List<CargoEntity>findALL();
    //funcion para mostrar los distritos habilitados
    List<CargoEntity>findAllCustom();
    //funcion para buscar dostrotp por codigo
    Optional<CargoEntity>findById(Long id);
    //funcion para registrar
    CargoEntity add(CargoEntity c);
    //funcion para actualizar
    CargoEntity update(CargoEntity c);
    //funcion para eliminar
    CargoEntity delete(CargoEntity c);
    
}
