package pe.com.mass.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.mass.entity.FacturaEntity;

public interface FacturaRepository extends JpaRepository<FacturaEntity, Long>{
    @Query("select f from FacturaEntity f where f.estado='1'")
            
    List<FacturaEntity> findAllCustom();   
}
