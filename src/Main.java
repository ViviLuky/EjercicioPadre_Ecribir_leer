import modelos.Alumno;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //hacer un programa
        //menu crear alumno lista
        //escriba el alumno 
        //leer alumno lista
        // guardar modelos.Alumno lista
        //mostrar alumnos en el fichero

      ArrayList<Alumno>alumnos=new ArrayList<>();

        Scanner scanner= new Scanner(System.in);
        ProcessBuilder processBuilder=new ProcessBuilder();
        int eleccion=0;

        do{
              eleccion=menu(scanner);
              switch (eleccion){
            case 1: crearAlumno(ArrayList<Alumno>);
            break;
            case 2:leerAlumno(alumnos);
            break;
            case 3: guardarAlumno(alumnos);
            break;
            case 4:mostrarAlumno(alumnos);
            break;
            default:
                System.out.println();
        }
    }while (eleccion!=4);
        System.out.println("Error Elige una Opcion");


    }

    private static void mostrarAlumno(File alumnos) {

    }

    private static void guardarAlumno(File alumnos) {
    }

    private static void leerAlumno(File alumnos) {
    }

    private static void crearAlumno(Scanner scanner, File alumnos) {

    }


    private static int menu(Scanner scanner) {
        int eleccion=0;

        System.out.println("Elige las opciones:");
        System.out.println("1-Crear modelos.Alumno");
        System.out.println("2-Leer modelos.Alumno ");
        System.out.println("3-Guardar modelos.Alumno");
        System.out.println("4-Mostar alumno en un fichero");
        return eleccion;
    }
}