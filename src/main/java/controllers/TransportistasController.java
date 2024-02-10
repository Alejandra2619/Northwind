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

import entities.Transportistas;
import services.TransportistasService;

@RestController
@RequestMapping("/tranportistas/")
public class TransportistasController {

    private TransportistasService transportistasService;
    
    @GetMapping
    private ResponseEntity<List<Transportistas>> getAllTransportistas(){
        return ResponseEntity.ok(transportistasService.findAll());
    }
    
    @PostMapping
    private ResponseEntity<Transportistas> saveTransportistas (@RequestBody Transportistas transportistas){
        try {
            Transportistas transportistaGuardado = transportistasService.save(transportistas);
            return ResponseEntity.created(new URI("/tranportistas/"+transportistaGuardado.getId())).body(transportistaGuardado);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

}
