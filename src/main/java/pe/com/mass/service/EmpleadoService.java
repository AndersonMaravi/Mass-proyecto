package pe.com.mass.service;

import java.util.List;
import java.util.Optional;
import pe.com.mass.entity.EmpleadoEntity;

public interface EmpleadoService {
    //funcion para mostrar todos los distritos
    List<EmpleadoEntity>findALL();
    //funcion para mostrar los distritos habilitados
    List<EmpleadoEntity>findAllCustom();
    //funcion para buscar dostrotp por codigo
    Optional<EmpleadoEntity>findById(Long id);
    //funcion para registrar
    EmpleadoEntity add(EmpleadoEntity e);
    //funcion para actualizar
    EmpleadoEntity update(EmpleadoEntity e);
    //funcion para eliminar
    EmpleadoEntity delete(EmpleadoEntity e);
      
}
