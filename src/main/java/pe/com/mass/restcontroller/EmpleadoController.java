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
import pe.com.proyecto.entity.EmpleadoEntity;
import pe.com.proyecto.service.EmpleadoService;

@RestController
//@Controller  -- es un controllador de spring
//@ResponseBody --> se volcia un controlador Rest
//@RestController -- @Controller + @ResponseBody
//@RequestMapping --> asignar un nombre al endpoint
@RequestMapping("/empleado")
public class EmpleadoController {
    @Autowired
    private EmpleadoService empleadoService;
    
    //@GetMapping --> permite obtener valores
    @GetMapping
    public List<EmpleadoEntity> findAll(){
        return empleadoService.findALL();
    }
    
    @GetMapping("/custom")
    public List<EmpleadoEntity> findAllCustom(){
        return empleadoService.findAllCustom();
    }
    
    @GetMapping("/{id}")
    public Optional<EmpleadoEntity> findById(@PathVariable Long id){
        return empleadoService.findById(id);
    }
    
    @PostMapping
    public EmpleadoEntity add(@RequestBody EmpleadoEntity e){
        return empleadoService.add(e);
    }
    
    @PutMapping("/{id}")
    public EmpleadoEntity update(@PathVariable long id, @RequestBody EmpleadoEntity e){
        e.setCodigo(id);
        return empleadoService.update(e);
    }
    
    @DeleteMapping("/{id}")
    public EmpleadoEntity update(@PathVariable long id){
        EmpleadoEntity objapoderado = new EmpleadoEntity();
        objapoderado.setEstado(false);
        return empleadoService.delete(EmpleadoEntity.builder().codigo(id).build());
    }
}
