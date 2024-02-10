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

import entities.Clientes;
import entities.Empleados;
import services.EmpleadosService;

@RestController
@RequestMapping("/empleados/")
public class EmpleadoController {

    private EmpleadosService empleadosService;

    
    @GetMapping
    private ResponseEntity<List<Empleados>> getAllEmpleado(){
        return ResponseEntity.ok(empleadosService.findAll());
    }
    
    @PostMapping
    private ResponseEntity<Empleados> saveEmpleados (@RequestBody Empleados empleados){
        try {
            Empleados empleadoGuardado = empleadosService.save(empleados);
            return ResponseEntity.created(new URI("/empleados/"+empleadoGuardado.getId())).body(empleadoGuardado);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

}
