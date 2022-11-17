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
import pe.com.mass.entity.CargoEntity;
import pe.com.mass.service.CargoService;

@RestController
//@Controller  -- es un controllador de spring
//@ResponseBody --> se volcia un controlador Rest
//@RestController -- @Controller + @ResponseBody
//@RequestMapping --> asignar un nombre al endpoint
@RequestMapping("/cargo")
public class CargoController {
    @Autowired
    private CargoService cargoService;
    
    //@GetMapping --> permite obtener valores
    @GetMapping
    public List<CargoEntity> findAll(){
        return cargoService.findALL();
    }
    
    @GetMapping("/custom")
    public List<CargoEntity> findAllCustom(){
        return cargoService.findAllCustom();
    }
    
    @GetMapping("/{id}")
    public Optional<CargoEntity> findById(@PathVariable Long id){
        return cargoService.findById(id);
    }
    
    @PostMapping
    public CargoEntity add(@RequestBody CargoEntity c){
        return cargoService.add(c);
    }
    
    @PutMapping("/{id}")
    public CargoEntity update(@PathVariable long id, @RequestBody CargoEntity c){
        c.setCodigo(id);
        return cargoService.update(c);
    }
    
    @DeleteMapping("/{id}")
    public CargoEntity update(@PathVariable long id){
        CargoEntity objapoderado = new CargoEntity();
        objapoderado.setEstado(false);
        return cargoService.delete(CargoEntity.builder().codigo(id).build());
    }
}
