package pe.com.mass.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.mass.entity.VentaEntity;

public interface VentaRepository extends JpaRepository<VentaEntity, Long>{
    @Query("select v from VentaEntity v where v.estado='1'")
            
    List<VentaEntity> findAllCustom();
}
