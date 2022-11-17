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
import pe.com.proyecto.entity.BoletaEntity;
import pe.com.proyecto.service.BoletaService;

@RestController
//@Controller  -- es un controllador de spring
//@ResponseBody --> se volcia un controlador Rest
//@RestController -- @Controller + @ResponseBody
//@RequestMapping --> asignar un nombre al endpoint
@RequestMapping("/boleta")
public class BoletaController {
    
    @Autowired
    private BoletaService boletaService;
    //@GetMapping --> permite obtener valores
    @GetMapping
    public List<BoletaEntity> findAll(){
        return boletaService.findALL();
    }
    
    @GetMapping("/custom")
    public List<BoletaEntity> findAllCustom(){
        return boletaService.findAllCustom();
    }
    
    @GetMapping("/{id}")
    public Optional<BoletaEntity> findById(@PathVariable Long id){
        return boletaService.findById(id);
    }
    
    @PostMapping
    public BoletaEntity add(@RequestBody BoletaEntity b){
        return boletaService.add(b);
    }
    
    @PutMapping("/{id}")
    public BoletaEntity update(@PathVariable long id, @RequestBody BoletaEntity b){
        b.setCodigo(id);
        return boletaService.update(b);
    }
    
    @DeleteMapping("/{id}")
    public BoletaEntity update(@PathVariable long id){
        BoletaEntity objapoderado = new BoletaEntity();
        objapoderado.setEstado(false);
        return boletaService.delete(BoletaEntity.builder().codigo(id).build());
    }
}
