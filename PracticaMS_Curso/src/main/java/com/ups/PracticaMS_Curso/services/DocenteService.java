package com.ups.PracticaMS_Curso.services;

import com.ups.PracticaMS_Curso.model.Docente;
import com.ups.PracticaMS_Curso.repository.DocenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DocenteService {

    @Autowired // es como el inject
    private DocenteRepository docenteRepository;

    //Servicio de crear Docentes
    public Docente create(Docente docente){
        return docenteRepository.save(docente);
    }
    //Servicios de Listar Serviciso

    public List<Docente> listDocente() {
        return docenteRepository.findAll();
    }
}