package com.mycompany.pruebajpa.persistencia;

import com.mycompany.pruebajpa.logica.Alumno;
import com.mycompany.pruebajpa.persistencia.exceptions.NonexistentEntityException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {
    
    AlumnoJpaController alumnoJPa = new AlumnoJpaController();

    public void crearAlumno(Alumno alumno) {
        alumnoJPa.create(alumno);
    }

    public void eliminarAlumno(long id) {
        try {
            alumnoJPa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editarAlumno(Alumno alumno) {
        try {
            alumnoJPa.edit(alumno);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Alumno traerAlumno(long id) {
        return alumnoJPa.findAlumno(id);
    }

    public ArrayList<Alumno> traerListaAlumnos() {
        List<Alumno> aux = alumnoJPa.findAlumnoEntities();
        ArrayList<Alumno> listaAlumnos = new ArrayList<Alumno> (aux);
        return listaAlumnos;
    }
     
}
