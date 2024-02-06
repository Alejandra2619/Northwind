package controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import entities.Orden;
import services.OrdenService;

@RestController
@RequestMapping("/orden")
public class OrdenController {
    private OrdenService ordenservice;


    @GetMapping
    private ResponseEntity<List<Orden>> getAllEmpleado(){
        return ResponseEntity.ok(ordenservice.findAll());
    }

    

}
