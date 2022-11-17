package pe.com.mass.service;

import java.util.List;
import java.util.Optional;
import pe.com.proyecto.entity.ClienteEntity;

public interface ClienteService {
    //funcion para mostrar todos los distritos
    List<ClienteEntity>findALL();
    //funcion para mostrar los distritos habilitados
    List<ClienteEntity>findAllCustom();
    //funcion para buscar dostrotp por codigo
    Optional<ClienteEntity>findById(Long id);
    //funcion para registrar
    ClienteEntity add(ClienteEntity c);
    //funcion para actualizar
    ClienteEntity update(ClienteEntity c);
    //funcion para eliminar
    ClienteEntity delete(ClienteEntity c);
    
}
