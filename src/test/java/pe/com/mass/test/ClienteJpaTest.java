
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
import pe.com.mass.entity.DistritoEntity;
import pe.com.mass.repository.ClienteRepository;

@DataJpaTest
@AutoConfigureTestDatabase(replace=Replace.NONE)
public class ClienteJpaTest {
    private static ClienteEntity objcliente;
    private static DistritoEntity objdistrito;
    
    @Autowired
    private  ClienteRepository repositorio;
    
    @BeforeAll
    public static void Inicio(){
        objcliente=new ClienteEntity();
        objdistrito=new DistritoEntity();
        System.out.println("@BeforeAll -->Inicio()");
    }
    
    @AfterAll
    public static void Final(){
        objcliente=null;
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
        List<ClienteEntity> ClienteEntity=repositorio.findAll();
        assertNotNull(ClienteEntity);
        System.out.println("@Test -->findAllTest()");
    }
    
    @Test
    public void findAllCustomTest(){
        List<ClienteEntity> ClienteEntity=repositorio.findAllCustom();
        assertNotNull(ClienteEntity);
        System.out.println("@Test -->findAllCustomTest()");
    }
    
    @Test
    public void findByIdTest(){
        long id=1;
        Optional<ClienteEntity> ClienteEntity=repositorio.findById(id);
        assertNotNull(ClienteEntity);
        System.out.println("@Test -->findByIdTest()");
    }
    
    @Test
    @Rollback(false)
    public void addTest(){
        objcliente.setNombre("Anderson");
        objcliente.setApellido("Huamancha");
        objcliente.setDni("41319569");
        objcliente.setDni("99988877");
        objcliente.setTelefono("4256398");
        objcliente.setDireccion("Av. Luis Braille 1890 - Unidad Vecinal de Mirones");
        
        objdistrito.setCodigo(2);
        objcliente.setDistrito(objdistrito);
        
        objcliente.setEstado(true);
        
        ClienteEntity ClienteEntity = repositorio.save(objcliente);
        assertNotNull(ClienteEntity);
        System.out.println("@Test -->addTest()");
    }
    
    
    @Test
    @Rollback(false)
    public void updateTest(){

        objcliente.setCodigo(2);
        objcliente.setNombre("Anderson Nicolas");
        objcliente.setApellido("Huamancha");
        objcliente.setDni("41319569");
        objcliente.setDni("99988877");
        objcliente.setTelefono("4256398");
        objcliente.setDireccion("Av. Luis Braille 1890 - Unidad Vecinal de Mirones");
        
        objdistrito.setCodigo(2);
        objcliente.setDistrito(objdistrito);
        
        objcliente.setEstado(true);
        
        ClienteEntity ClienteEntity = repositorio.save(objcliente);
        assertNotNull(ClienteEntity);
        System.out.println("@Test -->updateTest()");
    }
    
    @Test
    @Rollback(false)
    public void deleteTest(){

        objcliente.setCodigo(2);
        objcliente.setNombre("Anderson Nicolas");
        objcliente.setApellido("Huamancha");
        objcliente.setDni("41319569");
        objcliente.setDni("99988877");
        objcliente.setTelefono("4256398");
        objcliente.setDireccion("Av. Luis Braille 1890 - Unidad Vecinal de Mirones");
        
        objdistrito.setCodigo(2);
        objcliente.setDistrito(objdistrito);
        
        objcliente.setEstado(false);
        
        ClienteEntity ClienteEntity = repositorio.save(objcliente);
        assertNotNull(ClienteEntity);
        System.out.println("@Test -->deleteTest()");
    }
    
    
}
