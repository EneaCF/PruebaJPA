
package com.mycompany.pruebajpa.logica;

import java.io.Serializable;
import java.util.LinkedList;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Carrera implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    private String nombre;
    @OneToMany(mappedBy = "carrera")
    private LinkedList<Asignatura> listaAsignaturas;

    public Carrera() {
    }

    public Carrera(long id, String nombre, LinkedList<Asignatura> listaAsignaturas) {
        this.id = id;
        this.nombre = nombre;
        this.listaAsignaturas = listaAsignaturas;
    }

    public LinkedList<Asignatura> getListaAsignaturas() {
        return listaAsignaturas;
    }

    public void setListaAsignaturas(LinkedList<Asignatura> listaAsignaturas) {
        this.listaAsignaturas = listaAsignaturas;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
