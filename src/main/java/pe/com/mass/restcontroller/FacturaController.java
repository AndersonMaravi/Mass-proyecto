/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.com.proyecto.restcontroller;

//Aparece apartir de la version 4 de Spring

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
import pe.com.proyecto.entity.FacturaEntity;
import pe.com.proyecto.service.FacturaService;

@RestController
//@Controller  -- es un controllador de spring
//@ResponseBody --> se volcia un controlador Rest
//@RestController -- @Controller + @ResponseBody
//@RequestMapping --> asignar un nombre al endpoint
@RequestMapping("/factura")
public class FacturaController {
    @Autowired
    private FacturaService facturaService;
    
    //@GetMapping --> permite obtener valores
    @GetMapping
    public List<FacturaEntity> findAll(){
        return facturaService.findALL();
    }
    
    @GetMapping("/custom")
    public List<FacturaEntity> findAllCustom(){
        return facturaService.findAllCustom();
    }
    
    @GetMapping("/{id}")
    public Optional<FacturaEntity> findById(@PathVariable Long id){
        return facturaService.findById(id);
    }
    
    @PostMapping
    public FacturaEntity add(@RequestBody FacturaEntity c){
        return facturaService.add(c);
    }
    
    @PutMapping("/{id}")
    public FacturaEntity update(@PathVariable long id, @RequestBody FacturaEntity f){
        f.setCodigo(id);
        return facturaService.update(f);
    }
    
    @DeleteMapping("/{id}")
    public FacturaEntity update(@PathVariable long id){
        FacturaEntity objapoderado = new FacturaEntity();
        objapoderado.setEstado(false);
        return facturaService.delete(FacturaEntity.builder().codigo(id).build());
    }
}
