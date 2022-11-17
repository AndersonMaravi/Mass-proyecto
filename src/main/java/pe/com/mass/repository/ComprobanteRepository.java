package pe.com.mass.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.mass.entity.ComprobanteEntity;

public interface ComprobanteRepository extends JpaRepository<ComprobanteEntity, Long>{
    @Query("select c from ComprobanteEntity c where c.estado='1'")
            
    List<ComprobanteEntity> findAllCustom(); 
}
