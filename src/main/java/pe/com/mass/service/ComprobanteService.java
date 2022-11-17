package pe.com.mass.service;

import java.util.List;
import java.util.Optional;
import pe.com.proyecto.entity.ComprobanteEntity;

public interface ComprobanteService {
    //funcion para mostrar todos los distritos
    List<ComprobanteEntity>findALL();
    //funcion para mostrar los distritos habilitados
    List<ComprobanteEntity>findAllCustom();
    //funcion para buscar dostrotp por codigo
    Optional<ComprobanteEntity>findById(Long id);
    //funcion para registrar
    ComprobanteEntity add(ComprobanteEntity c);
    //funcion para actualizar
    ComprobanteEntity update(ComprobanteEntity c);
    //funcion para eliminar
    ComprobanteEntity delete(ComprobanteEntity c);
     
}
