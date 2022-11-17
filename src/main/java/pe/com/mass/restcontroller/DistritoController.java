/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
import pe.com.mass.entity.DistritoEntity;
import pe.com.mass.service.DistritoService;

//Aparece apartir de la version 4 de Spring
@RestController
//@Controller  -- es un controllador de spring
//@ResponseBody --> se volcia un controlador Rest
//@RestController -- @Controller + @ResponseBody
//@RequestMapping --> asignar un nombre al endpoint
@RequestMapping("/distrito")
public class DistritoController {
    @Autowired
    private DistritoService distritoService;
    
    //@GetMapping --> permite obtener valores
    @GetMapping
    public List<DistritoEntity> findAll(){
        return distritoService.findALL();
    }
    
    @GetMapping("/custom")
    public List<DistritoEntity> findAllCustom(){
        return distritoService.findAllCustom();
    }
    
    @GetMapping("/{id}")
    public Optional<DistritoEntity> findById(@PathVariable Long id){
        return distritoService.findById(id);
    }
    
    @PostMapping
    public DistritoEntity add(@RequestBody DistritoEntity d){
        return distritoService.add(d);
    }
    
    @PutMapping("/{id}")
    public DistritoEntity update(@PathVariable long id, @RequestBody DistritoEntity d){
        d.setCodigo(id);
        return distritoService.update(d);
    }
    
    @DeleteMapping("/{id}")
    public DistritoEntity update(@PathVariable long id){
        DistritoEntity objapoderado = new DistritoEntity();
        objapoderado.setEstado(false);
        return distritoService.delete(DistritoEntity.builder().codigo(id).build());
    }
}
