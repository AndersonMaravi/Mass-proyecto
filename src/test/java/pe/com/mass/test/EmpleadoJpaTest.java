
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
import pe.com.mass.entity.DistritoEntity;
import pe.com.mass.entity.EmpleadoEntity;
import pe.com.mass.repository.EmpleadoRepository;

@DataJpaTest
@AutoConfigureTestDatabase(replace=Replace.NONE)
public class EmpleadoJpaTest {
    private static EmpleadoEntity objempleado;
    private static DistritoEntity objdistrito;
    private static CargoEntity objcargo;
    
    @Autowired
    private  EmpleadoRepository repositorio;
    
    @BeforeAll
    public static void Inicio(){
        objempleado=new EmpleadoEntity();
        objdistrito=new DistritoEntity();
        objcargo=new CargoEntity();
        System.out.println("@BeforeAll -->Inicio()");
    }
    
    @AfterAll
    public static void Final(){
        objempleado=null;
        objdistrito=null;
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
        List<EmpleadoEntity> EmpleadoEntity=repositorio.findAll();
        assertNotNull(EmpleadoEntity);
        System.out.println("@Test -->findAllTest()");
    }
    
    @Test
    public void findAllCustomTest(){
        List<EmpleadoEntity> EmpleadoEntity=repositorio.findAllCustom();
        assertNotNull(EmpleadoEntity);
        System.out.println("@Test -->findAllCustomTest()");
    }
    
    @Test
    public void findByIdTest(){
        long id=1;
        Optional<EmpleadoEntity> EmpleadoEntity=repositorio.findById(id);
        assertNotNull(EmpleadoEntity);
        System.out.println("@Test -->findByIdTest()");
    }
    
    @Test
    @Rollback(false)
    public void addTest(){
        objempleado.setNombre("Anderson");
        objempleado.setApelldio("Huamancha");
        objempleado.setDni("41319569");
        objempleado.setTelefono("4256398");
        objempleado.setDireccion("Av. Luis Braille 1890 - Unidad Vecinal de Mirones");
        objempleado.setSexo("masculino");
        
        
        objdistrito.setCodigo(2);
        objempleado.setDistrito(objdistrito);
        objcargo.setCodigo(2);
        objempleado.setCargo(objcargo);
        
        objempleado.setEstado(true);
        
        EmpleadoEntity Cliente = repositorio.save(objempleado);
        assertNotNull(Cliente);
        System.out.println("@Test -->addTest()");
    }
    
    
    @Test
    @Rollback(false)
    public void updateTest(){
        objempleado.setCodigo(2);
        objempleado.setNombre("Anderson Nicolas");
        objempleado.setApelldio("Huamancha");
        objempleado.setDni("41319569");
        objempleado.setTelefono("4256398");
        objempleado.setDireccion("Av. Luis Braille 1890 - Unidad Vecinal de Mirones");
        objempleado.setSexo("masculino");
        
        
        objdistrito.setCodigo(2);
        objempleado.setDistrito(objdistrito);
        objcargo.setCodigo(2);
        objempleado.setCargo(objcargo);
        
        objempleado.setEstado(true);
        
        EmpleadoEntity Cliente = repositorio.save(objempleado);
        assertNotNull(Cliente);
        System.out.println("@Test -->updateTest()");
    }
    
    
    @Test
    @Rollback(false)
    public void deleteTest(){
        
        objempleado.setCodigo(2);
        objempleado.setNombre("Anderson ");
        objempleado.setApelldio("Huamancha");
        objempleado.setDni("41319569");
        objempleado.setTelefono("4256398");
        objempleado.setDireccion("Av. Luis Braille 1890 - Unidad Vecinal de Mirones");
        objempleado.setSexo("masculino");
        
        
        objdistrito.setCodigo(2);
        objempleado.setDistrito(objdistrito);
        objcargo.setCodigo(2);
        objempleado.setCargo(objcargo);
        
        objempleado.setEstado(false);
        
        EmpleadoEntity Cliente = repositorio.save(objempleado);
        assertNotNull(Cliente);
        System.out.println("@Test -->deleteTest()");
    }
    
    
}
