
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
import pe.com.mass.entity.ClienteEntity;
import pe.com.mass.entity.PedidoEntity;
import pe.com.mass.entity.ProductoEntity;
import pe.com.mass.repository.PedidoRepository;

@DataJpaTest
@AutoConfigureTestDatabase(replace=Replace.NONE)
public class PedidoJpaTest {
    private static PedidoEntity objpedido;
    private static ClienteEntity objcliente;
    private static ProductoEntity objproducto;
    
    @Autowired
    private  PedidoRepository repositorio;
    
    @BeforeAll
    public static void Inicio(){
        objpedido=new PedidoEntity();
        objcliente=new ClienteEntity();
        objproducto=new ProductoEntity();
        System.out.println("@BeforeAll -->Inicio()");
    }
    
    @AfterAll
    public static void Final(){
        objpedido=null;
        objcliente=null;
        objproducto=null;
        System.out.println("@AfterAll -->Final()");
    }
    
    @Test
    public void Mensaje(){
        System.out.println("Prueba Inicial");
        System.out.println("@Test -->PruebaInicial()");
    }
    
    @Test
    public void findAllTest(){
        List<PedidoEntity> PedidoEntity=repositorio.findAll();
        assertNotNull(PedidoEntity);
        System.out.println("@Test -->findAllTest()");
    }
    
    @Test
    public void findAllCustomTest(){
        List<PedidoEntity> PedidoEntity=repositorio.findAllCustom();
        assertNotNull(PedidoEntity);
        System.out.println("@Test -->findAllCustomTest()");
    }
    
    @Test
    public void findByIdTest(){
        long id=1;
        Optional<PedidoEntity> PedidoEntity=repositorio.findById(id);
        assertNotNull(PedidoEntity);
        System.out.println("@Test -->findByIdTest()");
    }
    
    @Test
    @Rollback(false)
    public void addTest(){
        objpedido.setTipo("delivery");
        objpedido.setFecha("20/09/2022");
        objpedido.setHora("4:50");
        
        objcliente.setCodigo(2);
        objpedido.setCliente(objcliente);
        objproducto.setCodigo(1);
        objpedido.setProducto(objproducto);

        objpedido.setEstado(true);
        
        PedidoEntity PedidoEntity = repositorio.save(objpedido);
        assertNotNull(PedidoEntity);
        System.out.println("@Test -->addTest()");
    }
    
    @Test
    @Rollback(false)
    public void updateTest(){
        objpedido.setCodigo(2);
        objpedido.setTipo("delivery");
        objpedido.setFecha("20/09/2024");
        objpedido.setHora("4:50");
        
        objcliente.setCodigo(2);
        objpedido.setCliente(objcliente);
        objproducto.setCodigo(1);
        objpedido.setProducto(objproducto);

        objpedido.setEstado(true);
        
        PedidoEntity PedidoEntity = repositorio.save(objpedido);
        assertNotNull(PedidoEntity);
        System.out.println("@Test -->updateTest()");
    }
    
    @Test
    @Rollback(false)
    public void deleteTest(){
        objpedido.setCodigo(2);
        objpedido.setTipo("delivery");
        objpedido.setFecha("20/09/2024");
        objpedido.setHora("4:50");
        
        objcliente.setCodigo(2);
        objpedido.setCliente(objcliente);
        objproducto.setCodigo(1);
        objpedido.setProducto(objproducto);

        objpedido.setEstado(false);
        
        PedidoEntity PedidoEntity = repositorio.save(objpedido);
        assertNotNull(PedidoEntity);
        System.out.println("@Test -->deleteTest()");
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
