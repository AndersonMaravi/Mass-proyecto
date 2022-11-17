package pe.com.mass.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.mass.entity.CargoEntity;

public interface CargoRepository extends JpaRepository<CargoEntity, Long>{
    @Query("select c from CargoEntity c where c.estado='1'")
            
    List<CargoEntity> findAllCustom();
}
