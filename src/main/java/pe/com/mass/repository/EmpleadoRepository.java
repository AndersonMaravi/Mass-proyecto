package pe.com.mass.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.mass.entity.EmpleadoEntity;

public interface EmpleadoRepository extends JpaRepository<EmpleadoEntity, Long>{
    @Query("select e from EmpleadoEntity e where e.estado='1'")
            
    List<EmpleadoEntity> findAllCustom();  
}
