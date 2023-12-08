package com.ups.PracticaMS_Curso.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Curso")
public class Curso
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private float horas;
    @ManyToOne
    @JoinColumn(name = "docente_id")
    private Docente docente;

    public Curso() {

    }

    public Curso(int id, String nombre, float horas, Docente docente) {
        this.id = id;
        this.nombre = nombre;
        this.horas = horas;
        this.docente = docente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getHoras() {
        return horas;
    }

    public void setHoras(float horas) {
        this.horas = horas;
    }

    public Docente getDocente() {
        return docente;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }
}
