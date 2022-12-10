
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
import pe.com.mass.entity.DistritoEntity;
import pe.com.mass.repository.DistritoRepository;

@DataJpaTest
@AutoConfigureTestDatabase(replace=Replace.NONE)
public class DistritoJpaTest {
    private static DistritoEntity objdistrito;
    
    @Autowired
    private  DistritoRepository repositorio;
    
    @BeforeAll
    public static void Inicio(){
        objdistrito=new DistritoEntity();
        System.out.println("@BeforeAll -->Inicio()");
    }
    
    @AfterAll
    public static void Final(){
        objdistrito=null;
        System.out.println("@AfterAll -->Final()");
    }
    
    @Test
    public void Mensaje(){
        System.out.println("Prueba Inicial");
        System.out.println("@Test -->PruebaInicial()");
    }
    
    @Test
    public void findAllTest(){
        List<DistritoEntity> DistritoEntity=repositorio.findAll();
        assertNotNull(DistritoEntity);
        System.out.println("@Test -->findAllTest()");
    }
    
    @Test
    public void findAllCustomTest(){
        List<DistritoEntity> DistritoEntity=repositorio.findAllCustom();
        assertNotNull(DistritoEntity);
        System.out.println("@Test -->findAllCustomTest()");
    }
    
    @Test
    public void findByIdTest(){
        long id=1;
        Optional<DistritoEntity> DistritoEntity=repositorio.findById(id);
        assertNotNull(DistritoEntity);
        System.out.println("@Test -->findByIdTest()");
    }
    
    @Test
    @Rollback(false)
    public void addTest(){
        objdistrito.setNombre("Comas");
        objdistrito.setEstado(true);
        DistritoEntity DistritoEntity = repositorio.save(objdistrito);
        assertNotNull(DistritoEntity);
        System.out.println("@Test -->addTest()");
    }
    
    
    @Test
    @Rollback(false)
    public void updateTest(){
        objdistrito.setCodigo(5);
        objdistrito.setNombre("Lima");
        objdistrito.setEstado(true);
        DistritoEntity DistritoEntity = repositorio.save(objdistrito);
        assertNotNull(DistritoEntity);
        System.out.println("@Test -->updateTest()");
    }
    
    @Test
    @Rollback(false)
    public void deleteTest(){
        objdistrito.setCodigo(5);
        objdistrito.setNombre("Lima");
        objdistrito.setEstado(false);
        DistritoEntity DistritoEntity = repositorio.save(objdistrito);
        assertNotNull(DistritoEntity);
        System.out.println("@Test -->deleteTest()");
    }
    
}
      
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
