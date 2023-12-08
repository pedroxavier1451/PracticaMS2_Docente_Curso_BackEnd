package com.ups.PracticaMS_Curso.controller;

import com.ups.PracticaMS_Curso.model.Curso;
import com.ups.PracticaMS_Curso.services.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/MS2/Curso")
public class CursoControlador {

    @Autowired // es similar al inject
    public CursoService cursoService;

    //Para consumir el guardar
    @PostMapping("/guardar")
    public ResponseEntity<Curso> save(@RequestBody Curso curso){
        Curso c= cursoService.create(curso);

        try{
            return ResponseEntity.created(new URI("/MS2/Curso/guardar"+c.getId())).body(c);
        }
        catch (Exception ex)
        {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    // para consumir el listar
    @GetMapping("/all")
    public ResponseEntity<List<Curso>> listAll(){
        return ResponseEntity.ok(cursoService.listCurso());
    }
}