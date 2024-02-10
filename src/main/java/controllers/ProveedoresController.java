package controllers;

import java.net.URI;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import entities.Proveedores;
import services.ProveedoresService;

@RestController
@RequestMapping("/proveedores/")
public class ProveedoresController {
    private ProveedoresService proveedoresService;
    
    @GetMapping
    private ResponseEntity<List<Proveedores>> getAllProveedores(){
        return ResponseEntity.ok(proveedoresService.findAll());
    }
    @PostMapping
    private ResponseEntity<Proveedores> saveProveedores (@RequestBody Proveedores proveedores){
        try {
            Proveedores proveedoresGuardado = proveedoresService.save(proveedores);
            return ResponseEntity.created(new URI("/proveedores/"+proveedoresGuardado.getId())).body(proveedoresGuardado);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }
   
}
