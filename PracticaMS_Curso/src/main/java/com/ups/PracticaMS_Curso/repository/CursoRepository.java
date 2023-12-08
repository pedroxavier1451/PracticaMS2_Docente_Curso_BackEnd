package com.ups.PracticaMS_Curso.repository;

import com.ups.PracticaMS_Curso.model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository extends JpaRepository<Curso, Long> {
}
