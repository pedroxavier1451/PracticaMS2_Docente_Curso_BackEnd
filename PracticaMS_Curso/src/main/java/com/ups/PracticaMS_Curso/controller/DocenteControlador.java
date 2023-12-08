package com.ups.PracticaMS_Curso.controller;

import com.ups.PracticaMS_Curso.model.Docente;
import com.ups.PracticaMS_Curso.services.DocenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/MS3/Docente")
public class DocenteControlador {

    @Autowired // es similar al inject
    public DocenteService docenteService;

    //Para consumir el guardar
    @PostMapping("/guardar")
    public ResponseEntity<Docente> save(@RequestBody Docente docente){
        Docente d= docenteService.create(docente);

        try{
            return ResponseEntity.created(new URI("/MS3/Docente/guardar"+d.getCedula())).body(d);
        }
        catch (Exception ex)
        {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    // para consumir el listar
    @GetMapping("/all")
    public ResponseEntity<List<Docente>> listAll(){
        return ResponseEntity.ok(docenteService.listDocente());
    }
}
