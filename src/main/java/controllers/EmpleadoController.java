package controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import entities.Empleados;
import services.EmpleadosService;

@RestController
@RequestMapping("/empleados")
public class EmpleadoController {

    private EmpleadosService empleadosService;

    
    @GetMapping
    private ResponseEntity<List<Empleados>> getAllEmpleado(){
        return ResponseEntity.ok(empleadosService.findAll());
    }

}
