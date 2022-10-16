package com.mycompany.pruebajpa;

import com.mycompany.pruebajpa.logica.Alumno;
import com.mycompany.pruebajpa.logica.Asignatura;
import com.mycompany.pruebajpa.logica.Carrera;
import com.mycompany.pruebajpa.logica.Controladora;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;

public class PruebaJPA {

    public static void main(String[] args) {
        Controladora control = new Controladora();

        /*//Crear y editar alumno
        Alumno alu = new Alumno(1,"enea","jpa",new Date());
        control.crearAlumno(alu);
        alu.setApellido("Castro");
        control.editarAlumno(alu);
        */
        
        //control.eliminarAlumno(1);
        
        
        LinkedList<Asignatura> listaAsignaturas = new LinkedList<Asignatura>();
        
        //Crear carrera con lista de asignaturas
        Carrera carrera = new Carrera(1,"Programación", listaAsignaturas);
     
        //Guardar carrera en BD
        control.crearCarrera(carrera);
        
        //Creacion asignaturas y lista con las asignaturas que queremos agregar a una carrera
        Asignatura a1 = new Asignatura(1, "Acceso a datos", "Trimestral", carrera);
        Asignatura a2 = new Asignatura(2, "Diseño interfaces", "Trimestral", carrera);
        Asignatura a3 = new Asignatura(3,"Programación procesos", "Trimestral", carrera);
        control.crearAsignatura(a1);
        control.crearAsignatura(a2);
        control.crearAsignatura(a3);

        listaAsignaturas.add(a1);
        listaAsignaturas.add(a2);
        listaAsignaturas.add(a3);
        
        carrera.setListaAsignaturas(listaAsignaturas);
        control.editarCarrera(carrera);
        
        //Crear alumno con carrera y guardar en BD
        Alumno alum = new Alumno(3,"Enea","test2",new Date(),control.traerCarrera(1));
        control.crearAlumno(alum);

        Alumno alu = control.traerAlumno(3);
        System.out.println("-----------------------");
        System.out.println("El alumno es : " + alu.toString());
        System.out.println("Cursa: " + alu.getCarrera().getNombre());
        System.out.println("-----------------------");
        ArrayList<Alumno> alumnos = control.traerAlumnos();
        for(Alumno alumno : alumnos){
            System.out.println(alumno.toString());
        }
    }
}
