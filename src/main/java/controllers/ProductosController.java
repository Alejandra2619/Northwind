package controllers;

import java.net.URI;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import entities.Productos;
import services.ProductosService;

@RestController
@RequestMapping("/productos/")
public class ProductosController {

    private ProductosService productosService;

    @GetMapping
    private ResponseEntity<List<Productos>> getAllProductos() {
        return ResponseEntity.ok(productosService.findAll());
    }
    
    private ResponseEntity<Productos> saveProductos (@RequestBody Productos productos){
        try {
            Productos productoGuardado = productosService.save(productos);
            return ResponseEntity.created(new URI("/productos/"+productoGuardado.getId())).body(productoGuardado);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

}
