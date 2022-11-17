package pe.com.mass.service;

import java.util.List;
import java.util.Optional;
import pe.com.mass.entity.PedidoEntity;

public interface PedidoService {
    //funcion para mostrar todos los distritos
    List<PedidoEntity>findALL();
    //funcion para mostrar los distritos habilitados
    List<PedidoEntity>findAllCustom();
    //funcion para buscar dostrotp por codigo
    Optional<PedidoEntity>findById(Long id);
    //funcion para registrar
    PedidoEntity add(PedidoEntity p);
    //funcion para actualizar
    PedidoEntity update(PedidoEntity p);
    //funcion para eliminar
    PedidoEntity delete(PedidoEntity p);
      
}
