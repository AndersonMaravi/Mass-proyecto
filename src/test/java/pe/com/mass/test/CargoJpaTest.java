
package pe.com.mass.test;

import java.util.List;
import java.util.Optional;
import org.junit.jupiter.api.AfterAll;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;
import pe.com.mass.entity.CargoEntity;
import pe.com.mass.repository.CargoRepository;

@DataJpaTest
@AutoConfigureTestDatabase(replace=Replace.NONE)
public class CargoJpaTest {
    private static CargoEntity objcargo;
    
    @Autowired
    private  CargoRepository repositorio;
    
    @BeforeAll
    public static void Inicio(){
        objcargo=new CargoEntity();
        System.out.println("@BeforeAll -->Inicio()");
    }
    
    @AfterAll
    public static void Final(){
        objcargo=null;
        System.out.println("@AfterAll -->Final()");
    }
    
    @Test
    public void Mensaje(){
        System.out.println("Prueba Inicial");
        System.out.println("@Test -->PruebaInicial()");
    }
    
    @Test
    public void findAllTest(){
        List<CargoEntity> CargoEntity=repositorio.findAll();
        assertNotNull(CargoEntity);
        System.out.println("@Test -->findAllTest()");
    }
    
    @Test
    public void findAllCustomTest(){
        List<CargoEntity> CargoEntity=repositorio.findAllCustom();
        assertNotNull(CargoEntity);
        System.out.println("@Test -->findAllCustomTest()");
    }
    
    @Test
    public void findByIdTest(){
        long id=1;
        Optional<CargoEntity> CargoEntity=repositorio.findById(id);
        assertNotNull(CargoEntity);
        System.out.println("@Test -->findByIdTest()");
    }
    
    @Test
    @Rollback(false)
    public void addTest(){
        objcargo.setNombre("Limpieza");
        objcargo.setEstado(true);
        
        CargoEntity CargoEntity = repositorio.save(objcargo);
        assertNotNull(CargoEntity);
        System.out.println("@Test -->addTest()");
    }
    
    
    @Test
    @Rollback(false)
    public void updateTest(){
        objcargo.setCodigo(3);
        objcargo.setNombre("Ventas");
        objcargo.setEstado(true);
        
        CargoEntity CargoEntity = repositorio.save(objcargo);
        assertNotNull(CargoEntity);
        System.out.println("@Test -->updateTest()");
    }
    
    @Test
    @Rollback(false)
    public void deleteTest(){
        objcargo.setCodigo(3);
        objcargo.setNombre("Ventas");
        objcargo.setEstado(false);
        
        CargoEntity CargoEntity = repositorio.save(objcargo);
        assertNotNull(CargoEntity);
        System.out.println("@Test -->deleteTest()");
    }
    
    
}
