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
import pe.com.proyecto.entity.ComprobanteEntity;
import pe.com.proyecto.service.ComprobanteService;

@RestController
//@Controller  -- es un controllador de spring
//@ResponseBody --> se volcia un controlador Rest
//@RestController -- @Controller + @ResponseBody
//@RequestMapping --> asignar un nombre al endpoint
@RequestMapping("/comprobante")
public class ComprobanteController {
    @Autowired
    private ComprobanteService comprobanteService;
    
    //@GetMapping --> permite obtener valores
    @GetMapping
    public List<ComprobanteEntity> findAll(){
        return comprobanteService.findALL();
    }
    
    @GetMapping("/custom")
    public List<ComprobanteEntity> findAllCustom(){
        return comprobanteService.findAllCustom();
    }
    
    @GetMapping("/{id}")
    public Optional<ComprobanteEntity> findById(@PathVariable Long id){
        return comprobanteService.findById(id);
    }
    
    @PostMapping
    public ComprobanteEntity add(@RequestBody ComprobanteEntity c){
        return comprobanteService.add(c);
    }
    
    @PutMapping("/{id}")
    public ComprobanteEntity update(@PathVariable long id, @RequestBody ComprobanteEntity c){
        c.setCodigo(id);
        return comprobanteService.update(c);
    }
    
    @DeleteMapping("/{id}")
    public ComprobanteEntity update(@PathVariable long id){
        ComprobanteEntity objapoderado = new ComprobanteEntity();
        objapoderado.setEstado(false);
        return comprobanteService.delete(ComprobanteEntity.builder().codigo(id).build());
    }
}
