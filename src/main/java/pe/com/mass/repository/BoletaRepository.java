package pe.com.mass.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.mass.entity.BoletaEntity;

public interface BoletaRepository extends JpaRepository<BoletaEntity, Long>{
    @Query("select b from BoletaEntity b where b.estado='1'")
            
    List<BoletaEntity> findAllCustom();
}
