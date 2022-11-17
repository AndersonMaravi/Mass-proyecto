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
import pe.com.mass.entity.PedidoEntity;
import pe.com.mass.service.PedidoService;

@RestController
//@Controller  -- es un controllador de spring
//@ResponseBody --> se volcia un controlador Rest
//@RestController -- @Controller + @ResponseBody
//@RequestMapping --> asignar un nombre al endpoint
@RequestMapping("/pedido")
public class PedidoController {
    @Autowired
    private PedidoService pedidoService;
    
    //@GetMapping --> permite obtener valores
    @GetMapping
    public List<PedidoEntity> findAll(){
        return pedidoService.findALL();
    }
    
    @GetMapping("/custom")
    public List<PedidoEntity> findAllCustom(){
        return pedidoService.findAllCustom();
    }
    
    @GetMapping("/{id}")
    public Optional<PedidoEntity> findById(@PathVariable Long id){
        return pedidoService.findById(id);
    }
    
    @PostMapping
    public PedidoEntity add(@RequestBody PedidoEntity p){
        return pedidoService.add(p);
    }
    
    @PutMapping("/{id}")
    public PedidoEntity update(@PathVariable long id, @RequestBody PedidoEntity p){
        p.setCodigo(id);
        return pedidoService.update(p);
    }
    
    @DeleteMapping("/{id}")
    public PedidoEntity update(@PathVariable long id){
        PedidoEntity objapoderado = new PedidoEntity();
        objapoderado.setEstado(false);
        return pedidoService.delete(PedidoEntity.builder().codigo(id).build());
    }
}
