package com.mycompany.pruebajpa;

import com.mycompany.pruebajpa.logica.Alumno;
import com.mycompany.pruebajpa.logica.Controladora;
import java.util.ArrayList;
import java.util.Date;

public class PruebaJPA {

    public static void main(String[] args) {
        Controladora control = new Controladora();
        Alumno alum = new Alumno(2,"test","test",new Date());
        control.crearAlumno(alum);
        /*
        Alumno alu = new Alumno(1,"enea","jpa",new Date());
        control.crearAlumno(alu);
        alu.setApellido("Castro");
        control.editarAlumno(alu);
        */
        
       //control.eliminarAlumno(1);
       
       Alumno alu = control.traerAlumno(1);
        System.out.println("-----------------------");
       System.out.println("El alumno es : " + alu.toString());
        System.out.println("-----------------------");
        ArrayList<Alumno> alumnos = control.traerAlumnos();
        for(Alumno alumno : alumnos){
            System.out.println(alumno.toString());
        }
    }
}
