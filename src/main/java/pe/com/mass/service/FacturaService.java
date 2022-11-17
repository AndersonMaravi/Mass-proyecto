package pe.com.mass.service;

import java.util.List;
import java.util.Optional;
import pe.com.mass.entity.FacturaEntity;

public interface FacturaService {
    //funcion para mostrar todos los distritos
    List<FacturaEntity>findALL();
    //funcion para mostrar los distritos habilitados
    List<FacturaEntity>findAllCustom();
    //funcion para buscar dostrotp por codigo
    Optional<FacturaEntity>findById(Long id);
    //funcion para registrar
    FacturaEntity add(FacturaEntity f);
    //funcion para actualizar
    FacturaEntity update(FacturaEntity f);
    //funcion para eliminar
    FacturaEntity delete(FacturaEntity f);
      
}
