
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
import pe.com.mass.entity.BoletaEntity;
import pe.com.mass.entity.ComprobanteEntity;
import pe.com.mass.repository.BoletaRepository;

@DataJpaTest
@AutoConfigureTestDatabase(replace=Replace.NONE)
public class BoletaJpaTest {
    private static BoletaEntity objboleta;
    private static ComprobanteEntity objcomprobante;
    
    @Autowired
    private  BoletaRepository repositorio;
    
    @BeforeAll
    public static void Inicio(){
        objboleta=new BoletaEntity();
        objcomprobante=new ComprobanteEntity();
        System.out.println("@BeforeAll -->Inicio()");
    }
    
    @AfterAll
    public static void Final(){
        objboleta=null;
        objcomprobante=null;
        System.out.println("@AfterAll -->Final()");
    }
    
    @Test
    public void Mensaje(){
        System.out.println("Prueba Inicial");
        System.out.println("@Test -->PruebaInicial()");
    }
    
    @Test
    public void findAllTest(){
        List<BoletaEntity> BoletaEntity=repositorio.findAll();
        assertNotNull(BoletaEntity);
        System.out.println("@Test -->findAllTest()");
    }
    
    
    @Test
    public void findAllCustomTest(){
        List<BoletaEntity> BoletaEntity=repositorio.findAllCustom();
        assertNotNull(BoletaEntity);
        System.out.println("@Test -->findAllCustomTest()");
    }
    
    @Test
    public void findByIdTest(){
        long id=1;
        Optional<BoletaEntity> BoletaEntity=repositorio.findById(id);
        assertNotNull(BoletaEntity);
        System.out.println("@Test -->findByIdTest()");
    }
    
    @Test
    @Rollback(false)
    public void addTest(){
        
        
        objcomprobante.setCodigo(1);
        objboleta.setComprobante(objcomprobante);
        
        objboleta.setNumboleta(3);
        objboleta.setEstado(true);
        
        BoletaEntity BoletaEntity = repositorio.save(objboleta);
        assertNotNull(BoletaEntity);
        System.out.println("@Test -->addTest()");
    }
    
    @Test
    @Rollback(false)
    public void updateTest(){
        
        objboleta.setCodigo(2);
        
        objcomprobante.setCodigo(1);
        objboleta.setComprobante(objcomprobante);
        
        objboleta.setNumboleta(4);
        objboleta.setEstado(true);
        
        BoletaEntity BoletaEntity = repositorio.save(objboleta);
        assertNotNull(BoletaEntity);
        System.out.println("@Test -->updateTest()");
    }
    
    @Test
    @Rollback(false)
    public void deleteTest(){
        
        objboleta.setCodigo(2);
        objcomprobante.setCodigo(1);
        objboleta.setComprobante(objcomprobante);
        
        objboleta.setNumboleta(3);
        objboleta.setEstado(false);
        
        BoletaEntity BoletaEntity = repositorio.save(objboleta);
        assertNotNull(BoletaEntity);
        System.out.println("@Test -->deleteTest()");
    
    }
}
