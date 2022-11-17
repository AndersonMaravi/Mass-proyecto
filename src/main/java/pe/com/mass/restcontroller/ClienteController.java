package pe.com.mass.restcontroller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.com.mass.entity.ClienteEntity;
import pe.com.proyecto.service.ClienteService;
//Aparece apartir de la version 4 de Spring
@RestController
//@Controller  -- es un controllador de spring
//@ResponseBody --> se volcia un controlador Rest
//@RestController -- @Controller + @ResponseBody
//@RequestMapping --> asignar un nombre al endpoint
@RequestMapping("/cliente")

public class ClienteController {
        @Autowired
    private ClienteService clienteService;
    
    //@GetMapping --> permite obtener valores
    @GetMapping
    public List<ClienteEntity> findAll(){
        return clienteService.findALL();
    }
    
    @GetMapping("/custom")
    public List<ClienteEntity> findAllCustom(){
        return clienteService.findAllCustom();
    }
    
    @GetMapping("/{id}")
    public Optional<ClienteEntity> findById(@PathVariable Long id){
        return clienteService.findById(id);
    }
    
    @PostMapping
    public ClienteEntity add(@RequestBody ClienteEntity c){
        return clienteService.add(c);
    }
    
    @PutMapping("/{id}")
    public ClienteEntity update(@PathVariable long id, @RequestBody ClienteEntity c){
        c.setCodigo(id);
        return clienteService.update(c);
    }
    
    @DeleteMapping("/{id}")
    public ClienteEntity update(@PathVariable long id){
        ClienteEntity objapoderado = new ClienteEntity();
        objapoderado.setEstado(false);
        return clienteService.delete(ClienteEntity.builder().codigo(id).build());
    }
}
