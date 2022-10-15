package com.mycompany.pruebajpa.logica;

import com.mycompany.pruebajpa.persistencia.ControladoraPersistencia;
import java.util.ArrayList;

public class Controladora {
    ControladoraPersistencia controlPer = new ControladoraPersistencia();
    
    public void crearAlumno(Alumno alumno){
        controlPer.crearAlumno(alumno);
    }
    
    public void eliminarAlumno(long id){
        controlPer.eliminarAlumno(id);
    }
    
    public void editarAlumno(Alumno alumno){
        controlPer.editarAlumno(alumno);
    }
    
    public Alumno traerAlumno(long id){
        return controlPer.traerAlumno(id);
    }
    
    public ArrayList<Alumno> traerAlumnos(){
        return controlPer.traerListaAlumnos();
    }
}
