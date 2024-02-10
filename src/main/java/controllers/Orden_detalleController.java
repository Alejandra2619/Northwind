package controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import entities.Orden;
import services.OrdenService;

@RestController
@RequestMapping("/ordendetalle/")
public class Orden_detalleController {

    private OrdenService ordenService;

    @GetMapping
    private ResponseEntity<List<Orden>> getAllEmpleado() {
        return ResponseEntity.ok(ordenService.findAll());
    }

}
