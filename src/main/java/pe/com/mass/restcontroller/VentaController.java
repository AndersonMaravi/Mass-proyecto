/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.com.mass.restcontroller;

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
import pe.com.mass.entity.VentaEntity;
import pe.com.mass.service.VentaService;

@RestController
//@Controller  -- es un controllador de spring
//@ResponseBody --> se volcia un controlador Rest
//@RestController -- @Controller + @ResponseBody
//@RequestMapping --> asignar un nombre al endpoint
@RequestMapping("/venta")
public class VentaController {
    @Autowired
    private VentaService ventaService;
    
    //@GetMapping --> permite obtener valores
    @GetMapping
    public List<VentaEntity> findAll(){
        return ventaService.findALL();
    }
    
    @GetMapping("/custom")
    public List<VentaEntity> findAllCustom(){
        return ventaService.findAllCustom();
    }
    
    @GetMapping("/{id}")
    public Optional<VentaEntity> findById(@PathVariable Long id){
        return ventaService.findById(id);
    }
    
    @PostMapping
    public VentaEntity add(@RequestBody VentaEntity v){
        return ventaService.add(v);
    }
    
    @PutMapping("/{id}")
    public VentaEntity update(@PathVariable long id, @RequestBody VentaEntity v){
        v.setCodigo(id);
        return ventaService.update(v);
    }
    
    @DeleteMapping("/{id}")
    public VentaEntity update(@PathVariable long id){
        VentaEntity objapoderado = new VentaEntity();
        objapoderado.setEstado(false);
        return ventaService.delete(VentaEntity.builder().codigo(id).build());
    }
}
