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
import pe.com.mass.entity.ProductoEntity;
import pe.com.mass.service.ProductoService;


//Aparece apartir de la version 4 de Spring
@RestController
//@Controller  -- es un controllador de spring
//@ResponseBody --> se volcia un controlador Rest
//@RestController -- @Controller + @ResponseBody
//@RequestMapping --> asignar un nombre al endpoint
@RequestMapping("/producto")
public class ProductoController {
   @Autowired
    private ProductoService productoService;
    
    //@GetMapping --> permite obtener valores
    @GetMapping
    public List<ProductoEntity> findAll(){
        return productoService.findALL();
    }
    
    @GetMapping("/custom")
    public List<ProductoEntity> findAllCustom(){
        return productoService.findAllCustom();
    }
    
    @GetMapping("/{id}")
    public Optional<ProductoEntity> findById(@PathVariable Long id){
        return productoService.findById(id);
    }
    
    @PostMapping
    public ProductoEntity add(@RequestBody ProductoEntity p){
        return productoService.add(p);
    }
    
    @PutMapping("/{id}")
    public ProductoEntity update(@PathVariable long id, @RequestBody ProductoEntity p){
        p.setCodigo(id);
        return productoService.update(p);
    }
    
    @DeleteMapping("/{id}")
    public ProductoEntity update(@PathVariable long id){
        ProductoEntity objapoderado = new ProductoEntity();
        objapoderado.setEstado(false);
        return productoService.delete(ProductoEntity.builder().codigo(id).build());
    } 
}
