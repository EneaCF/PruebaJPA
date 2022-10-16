package com.mycompany.pruebajpa.persistencia;

import com.mycompany.pruebajpa.logica.Alumno;
import com.mycompany.pruebajpa.logica.Asignatura;
import com.mycompany.pruebajpa.logica.Carrera;
import com.mycompany.pruebajpa.persistencia.exceptions.NonexistentEntityException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {
    
    AlumnoJpaController alumnoJPa = new AlumnoJpaController();
    CarreraJpaController carreraJpa = new CarreraJpaController();
    AsignaturaJpaController asignaturaJpa = new AsignaturaJpaController();
    
    //Metodos Alumno
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
        ArrayList<Alumno> listaAlumnos = new ArrayList(aux);
        return listaAlumnos;
    }

    //Metodos Carrera
    public void crearCarrera(Carrera carrera) {
        carreraJpa.create(carrera);
    }

    public void eliminarCarrera(long id) {
        try {
            carreraJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ArrayList<Carrera> traerListaCarreras() {
        List<Carrera> aux = carreraJpa.findCarreraEntities();
        ArrayList<Carrera> listaCarreras = new ArrayList(aux);
        return listaCarreras;
    }
    public Carrera traerCarrera(long id) {
        return carreraJpa.findCarrera(id);
    }

    public void editarCarrera(Carrera carrera) {
        try {
            carreraJpa.edit(carrera);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //Metodos Asignatura
    public void crearAsignatura(Asignatura asignatura) {
        asignaturaJpa.create(asignatura);
    }

    public void eliminarAsignatura(long id) {
        try {
            asignaturaJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editarAsignatura(Asignatura asignatura) {
        try {
            asignaturaJpa.edit(asignatura);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Asignatura traerAsignatura(long id) {
        return asignaturaJpa.findAsignatura(id);
    }

    public ArrayList<Asignatura> traerListaAsignaturas() {
        List<Asignatura> aux = asignaturaJpa.findAsignaturaEntities();
        ArrayList<Asignatura> listaAsignaturas = new ArrayList(aux);
        return listaAsignaturas;
    }
     
}
