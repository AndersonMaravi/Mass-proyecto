package pe.com.mass.service;

import java.util.List;
import java.util.Optional;
import pe.com.mass.entity.ProductoEntity;

public interface ProductoService {
    //funcion para mostrar todos los distritos
    List<ProductoEntity>findALL();
    //funcion para mostrar los distritos habilitados
    List<ProductoEntity>findAllCustom();
    //funcion para buscar dostrotp por codigo
    Optional<ProductoEntity>findById(Long id);
    //funcion para registrar
    ProductoEntity add(ProductoEntity p);
    //funcion para actualizar
    ProductoEntity update(ProductoEntity p);
    //funcion para eliminar
    ProductoEntity delete(ProductoEntity p);
     
}
