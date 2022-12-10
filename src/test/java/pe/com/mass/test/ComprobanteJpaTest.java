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
import pe.com.mass.entity.VentaEntity;
import pe.com.mass.repository.ComprobanteRepository;

@DataJpaTest
@AutoConfigureTestDatabase(replace=Replace.NONE)
public class ComprobanteJpaTest {
    private static ComprobanteEntity objcomprobante;
    private static VentaEntity objventa;
    
    @Autowired
    private  ComprobanteRepository repositorio;
    
    @BeforeAll
    public static void Inicio(){
        objcomprobante=new ComprobanteEntity();
        objventa=new VentaEntity();
        System.out.println("@BeforeAll -->Inicio()");
    }
    
    @AfterAll
    public static void Final(){
        objcomprobante=null;
        objventa=null;
        System.out.println("@AfterAll -->Final()");
    }
    
    @Test
    public void findAllTest(){
        List<ComprobanteEntity> ComprobanteEntity=repositorio.findAll();
        assertNotNull(ComprobanteEntity);
        System.out.println("@Test -->findAllTest()");
    }
    
    @Test
    public void findAllCustomTest(){
        List<ComprobanteEntity> ComprobanteEntity=repositorio.findAllCustom();
        assertNotNull(ComprobanteEntity);
        System.out.println("@Test -->findAllCustomTest()");
    }
    
    @Test
    public void findByIdTest(){
        long id=1;
        Optional<ComprobanteEntity> ComprobanteEntity=repositorio.findById(id);
        assertNotNull(ComprobanteEntity);
        System.out.println("@Test -->findByIdTest()");
    }
    
    
    @Test
    @Rollback(false)
    public void addTest(){
        objcomprobante.setTipo("boleta");
        objcomprobante.setSubtotal(50);
        objcomprobante.setIgv(22);
        objcomprobante.setTotal(23);
        
        
        objventa.setCodigo(1);
        objcomprobante.setVenta(objventa);
        
        objcomprobante.setEstado(true);
        
        ComprobanteEntity ComprobanteEntity = repositorio.save(objcomprobante);
        assertNotNull(ComprobanteEntity);
        System.out.println("@Test -->addTest()");
    }
    
    @Test
    @Rollback(false)
    public void updateTest(){
        objcomprobante.setCodigo(2);
        objcomprobante.setTipo("boleta");
        objcomprobante.setSubtotal(50);
        objcomprobante.setIgv(22);
        objcomprobante.setTotal(23);
        
        
        objventa.setCodigo(1);
        objcomprobante.setVenta(objventa);
        
        objcomprobante.setEstado(true);
        
        ComprobanteEntity ComprobanteEntity = repositorio.save(objcomprobante);
        assertNotNull(ComprobanteEntity);
        System.out.println("@Test -->updateTest()");
    }
    
    @Test
    @Rollback(false)
    public void deleteTest(){
        objcomprobante.setCodigo(2);
        objcomprobante.setTipo("boleta");
        objcomprobante.setSubtotal(50);
        objcomprobante.setIgv(22);
        objcomprobante.setTotal(23);
        
        
        objventa.setCodigo(1);
        objcomprobante.setVenta(objventa);
        
        objcomprobante.setEstado(false);
        
        ComprobanteEntity ComprobanteEntity = repositorio.save(objcomprobante);
        assertNotNull(ComprobanteEntity);
        System.out.println("@Test -->deleteTest()");
    }
    
    
    
    
    
    
    
    
    
    
    
    
}
