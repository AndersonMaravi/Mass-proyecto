package pe.com.mass.service;

import java.util.List;
import java.util.Optional;
import pe.com.proyecto.entity.VentaEntity;

public interface VentaService {
    //funcion para mostrar todos los distritos
    List<VentaEntity>findALL();
    //funcion para mostrar los distritos habilitados
    List<VentaEntity>findAllCustom();
    //funcion para buscar dostrotp por codigo
    Optional<VentaEntity>findById(Long id);
    //funcion para registrar
    VentaEntity add(VentaEntity v);
    //funcion para actualizar
    VentaEntity update(VentaEntity v);
    //funcion para eliminar
    VentaEntity delete(VentaEntity v);
       
}
