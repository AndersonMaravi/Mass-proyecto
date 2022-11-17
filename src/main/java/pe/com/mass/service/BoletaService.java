package pe.com.mass.service;

import java.util.List;
import java.util.Optional;
import pe.com.mass.entity.BoletaEntity;

public interface BoletaService {
    //funcion para mostrar todos los distritos
    List<BoletaEntity>findALL();
    //funcion para mostrar los distritos habilitados
    List<BoletaEntity>findAllCustom();
    //funcion para buscar dostrotp por codigo
    Optional<BoletaEntity>findById(Long id);
    //funcion para registrar
    BoletaEntity add(BoletaEntity b);
    //funcion para actualizar
    BoletaEntity update(BoletaEntity b);
    //funcion para eliminar
    BoletaEntity delete(BoletaEntity b); 
}
