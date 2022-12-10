
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
import pe.com.mass.entity.EmpleadoEntity;
import pe.com.mass.entity.PedidoEntity;
import pe.com.mass.entity.VentaEntity;
import pe.com.mass.repository.VentaRepository;

@DataJpaTest
@AutoConfigureTestDatabase(replace=Replace.NONE)
public class VentaJpaTest {
    private static VentaEntity objventa;
    private static PedidoEntity objpedido;
    private static EmpleadoEntity objempleado;
    
    @Autowired
    private  VentaRepository repositorio;
    
    
    @BeforeAll
    public static void Inicio(){
        objventa=new VentaEntity();
        objpedido=new PedidoEntity();
        objempleado=new EmpleadoEntity();
        System.out.println("@BeforeAll -->Inicio()");
    }
    
    @AfterAll
    public static void Final(){
        objventa=null;
        objpedido=null;
        objempleado=null;
        System.out.println("@AfterAll -->Final()");
    }
    
    @Test
    public void Mensaje(){
        System.out.println("Prueba Inicial");
        System.out.println("@Test -->PruebaInicial()");
    }
    
    @Test
    public void findAllTest(){
        List<VentaEntity> VentaEntity=repositorio.findAll();
        assertNotNull(VentaEntity);
        System.out.println("@Test -->findAllTest()");
    }
    
    @Test
    public void findAllCustomTest(){
        List<VentaEntity> VentaEntity=repositorio.findAllCustom();
        assertNotNull(VentaEntity);
        System.out.println("@Test -->findAllCustomTest()");
    }
    
    @Test
    public void findByIdTest(){
        long id=1;
        Optional<VentaEntity> VentaEntity=repositorio.findById(id);
        assertNotNull(VentaEntity);
        System.out.println("@Test -->findByIdTest()");
    }
    
    @Test
    @Rollback(false)
    public void addTest(){
        objventa.setNumventa("22");
        
        objpedido.setCodigo(1);
        objventa.setPedido(objpedido);
        objempleado.setCodigo(1);
        objventa.setEmpleado(objempleado);
        
        objventa.setEstado(true);
        
        VentaEntity VentaEntity = repositorio.save(objventa);
        assertNotNull(VentaEntity);
        System.out.println("@Test -->addTest()");
    }
    
    @Test
    @Rollback(false)
    public void updateTest(){
        objventa.setCodigo(2);
        objventa.setNumventa("21");
        
        objpedido.setCodigo(1);
        objventa.setPedido(objpedido);
        objempleado.setCodigo(1);
        objventa.setEmpleado(objempleado);
        
        objventa.setEstado(true);
        
        VentaEntity VentaEntity = repositorio.save(objventa);
        assertNotNull(VentaEntity);
        System.out.println("@Test -->updateTest()");
    }
    
    @Test
    @Rollback(false)
    public void deleteTest(){
        objventa.setCodigo(2);
        objventa.setNumventa("22");
        
        objpedido.setCodigo(1);
        objventa.setPedido(objpedido);
        objempleado.setCodigo(1);
        objventa.setEmpleado(objempleado);
        
        objventa.setEstado(false);
        
        VentaEntity VentaEntity = repositorio.save(objventa);
        assertNotNull(VentaEntity);
        System.out.println("@Test -->deleteTest()");
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
