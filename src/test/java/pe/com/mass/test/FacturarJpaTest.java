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
import pe.com.mass.entity.ComprobanteEntity;
import pe.com.mass.entity.FacturaEntity;
import pe.com.mass.repository.FacturaRepository;

@DataJpaTest
@AutoConfigureTestDatabase(replace=Replace.NONE)
public class FacturarJpaTest {
    private static FacturaEntity objfactura;
    private static ComprobanteEntity objcomprobante;
    
    @Autowired
    private  FacturaRepository repositorio;
    
    @BeforeAll
    public static void Inicio(){
        objfactura=new FacturaEntity();
        objcomprobante=new ComprobanteEntity();
        System.out.println("@BeforeAll -->Inicio()");
    }
    
    @AfterAll
    public static void Final(){
        objfactura=null;
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
        List<FacturaEntity> FacturaEntity=repositorio.findAll();
        assertNotNull(FacturaEntity);
        System.out.println("@Test -->findAllTest()");
    }
    
    @Test
    public void findAllCustomTest(){
        List<FacturaEntity> FacturaEntity=repositorio.findAllCustom();
        assertNotNull(FacturaEntity);
        System.out.println("@Test -->findAllCustomTest()");
    }
    
    @Test
    public void findByIdTest(){
        long id=1;
        Optional<FacturaEntity> FacturaEntity=repositorio.findById(id);
        assertNotNull(FacturaEntity);
        System.out.println("@Test -->findByIdTest()");
    }
    
    @Test
    @Rollback(false)
    public void addTest(){
        objfactura.setNumfactura(22);
        
        
        objcomprobante.setCodigo(2);
        objfactura.setComprobante(objcomprobante);
        
        objfactura.setEstado(true);
        
        FacturaEntity FacturaEntity = repositorio.save(objfactura);
        assertNotNull(FacturaEntity);
        System.out.println("@Test -->addTest()");
    }
    
    @Test
    @Rollback(false)
    public void updateTest(){
        objfactura.setCodigo(2);
        objfactura.setNumfactura(2);
        objcomprobante.setCodigo(2);
        objfactura.setComprobante(objcomprobante);
        
        objfactura.setEstado(true);
        
        FacturaEntity FacturaEntity = repositorio.save(objfactura);
        assertNotNull(FacturaEntity);
        System.out.println("@Test -->updateTest()");
    }
    
    @Test
    @Rollback(false)
    public void deleteTest(){
        objfactura.setCodigo(2);
        objfactura.setNumfactura(2);
        objcomprobante.setCodigo(2);
        objfactura.setComprobante(objcomprobante);
        
        objfactura.setEstado(false);
        
        FacturaEntity FacturaEntity = repositorio.save(objfactura);
        assertNotNull(FacturaEntity);
        System.out.println("@Test -->deleteTest()");
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
