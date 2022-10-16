package com.mycompany.pruebajpa;

import com.mycompany.pruebajpa.logica.Alumno;
import com.mycompany.pruebajpa.logica.Carrera;
import com.mycompany.pruebajpa.logica.Controladora;
import java.util.ArrayList;
import java.util.Date;

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

        //Crear carrera
        Carrera carrera = new Carrera(1,"Programación");
        
        //Guardar carrera en BD
        control.crearCarrera(carrera);
        //Crear alumno con carrera y guardar en BD
        Alumno alum = new Alumno(2,"Enea","test2",new Date(),carrera);
        control.crearAlumno(alum);

        Alumno alu = control.traerAlumno(4);
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
