package controllers;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

    @PostMapping
    private ResponseEntity<Clientes> saveClientes ( @RequestBody Clientes clientes ){
       
        try{
            Clientes clienteGuardado = clientesService.save(clientes);
            return ResponseEntity.created(new URI("/clientes/"+clienteGuardado.getId())).body(clienteGuardado);
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
        
    }
}
