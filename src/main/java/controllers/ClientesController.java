package controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import entities.Clientes;
import services.ClientesService;

@RestController
@RequestMapping("/clientes/")
public class ClientesController {

    @Autowired
    private ClientesService clientesService;

    @GetMapping
    private ResponseEntity<List<Clientes>> getAllClientes(){
        return ResponseEntity.ok(clientesService.findAll());
    }
}
