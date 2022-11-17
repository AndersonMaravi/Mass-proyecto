package pe.com.mass.service;

import java.util.List;
import java.util.Optional;
import pe.com.mass.entity.DistritoEntity;

public interface DistritoService {
    //funcion para mostrar todos los distritos
    List<DistritoEntity>findALL();
    //funcion para mostrar los distritos habilitados
    List<DistritoEntity>findAllCustom();
    //funcion para buscar dostrotp por codigo
    Optional<DistritoEntity>findById(Long id);
    //funcion para registrar
    DistritoEntity add(DistritoEntity d);
    //funcion para actualizar
    DistritoEntity update(DistritoEntity d);
    //funcion para eliminar
    DistritoEntity delete(DistritoEntity d);
       
}
