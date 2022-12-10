
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
import pe.com.mass.entity.ProductoEntity;
import pe.com.mass.repository.ProductoRepository;

@DataJpaTest
@AutoConfigureTestDatabase(replace=Replace.NONE)
public class ProductoJpaTest {
    private static ProductoEntity objproducto;
    
    @Autowired
    private  ProductoRepository repositorio;
    
    @BeforeAll
    public static void Inicio(){
        objproducto=new ProductoEntity();
        System.out.println("@BeforeAll -->Inicio()");
    }
    
    @AfterAll
    public static void Final(){
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
        List<ProductoEntity> ProductoEntity=repositorio.findAll();
        assertNotNull(ProductoEntity);
        System.out.println("@Test -->findAllTest()");
    }
    
    @Test
    public void findAllCustomTest(){
        List<ProductoEntity> ProductoEntity=repositorio.findAllCustom();
        assertNotNull(ProductoEntity);
        System.out.println("@Test -->findAllCustomTest()");
    }
    
    @Test
    public void findByIdTest(){
        long id=1;
        Optional<ProductoEntity> ProductoEntity=repositorio.findById(id);
        assertNotNull(ProductoEntity);
        System.out.println("@Test -->findByIdTest()");
    }
    
    @Test
    @Rollback(false)
    public void addTest(){
        objproducto.setNombre("golosina");
        objproducto.setTipo("caramelo");
        objproducto.setPrecio(20);
        objproducto.setCantidad(5);
        objproducto.setDescuento(15);

        objproducto.setEstado(true);
        
        ProductoEntity ProductoEntity = repositorio.save(objproducto);
        assertNotNull(ProductoEntity);
        System.out.println("@Test -->addTest()");
    }
    
    @Test
    @Rollback(false)
    public void updateTest(){
        objproducto.setCodigo(2);
        objproducto.setNombre("bebida");
        objproducto.setTipo("cocacola");
        objproducto.setPrecio(20);
        objproducto.setCantidad(5);
        objproducto.setDescuento(15);

        objproducto.setEstado(true);
        
        ProductoEntity ProductoEntity = repositorio.save(objproducto);
        assertNotNull(ProductoEntity);
        System.out.println("@Test -->updateTest()");
    }
    
    
    @Test
    @Rollback(false)
    public void deleteTest(){
        objproducto.setCodigo(2);
        objproducto.setNombre("bebida");
        objproducto.setTipo("cocacola");
        objproducto.setPrecio(20);
        objproducto.setCantidad(5);
        objproducto.setDescuento(15);

        objproducto.setEstado(false);
        
        ProductoEntity ProductoEntity = repositorio.save(objproducto);
        assertNotNull(ProductoEntity);
        System.out.println("@Test -->deleteTest()");
    }
    
    
    
    
    
    
    
    
    
    
    
    
}
