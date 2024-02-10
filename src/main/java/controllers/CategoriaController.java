package controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import entities.Categoria;
import services.CategoriaService;

@RestController
@RequestMapping("/categoria/")

public class CategoriaController {

    @Autowired
    private CategoriaService categoriaService;

    @GetMapping("{id}")
    private ResponseEntity<List<Categoria>> getAllCategoriasByProductos(@PathVariable ("id")Long idProductos){
        return ResponseEntity.ok(categoriaService.findAllByProduct(idProductos));
    }

}
