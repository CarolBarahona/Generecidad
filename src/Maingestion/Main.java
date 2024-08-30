package Maingestion;
import Modelo.Pair;
import java.time.LocalDate;
import java.util.Scanner;
import supabase.Supabase;

/**
 *
 * @author barah
 */

public class Main {
    static Supabase sup;
    Scanner Read = new Scanner(System.in);
    
    public static void conectionSup(){
        sup = new Supabase("https://ztecjuwerjpfhzylzieb.supabase.co/","eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJzdXBhYmFzZSIsInJlZiI6Inp0ZWNqdXdlcmpwZmh6eWx6aWViIiwicm9sZSI6ImFub24iLCJpYXQiOjE3MjQ5NzY2MzEsImV4cCI6MjA0MDU1MjYzMX0.NRjRz99Yb5k83RGHQSqYnbdH5ShC1xo522XlyR8hBlE");
     }            
    public static void main(String[] args) {
        // Crear un par con edad y nombre de una persona
        Pair<Integer, String> edadYNombre = new Pair<>(30, "Juan Pérez");
        System.out.println("Edad y Nombre: " + edadYNombre);

        // Crear un par con EPS y fecha de nacimiento de una persona
        Pair<String, LocalDate> epsYFechaNacimiento = new Pair<>("SaludTotal", LocalDate.of(1990, 5, 20));
        System.out.println("EPS y Fecha de Nacimiento: " + epsYFechaNacimiento);

        // Simulando la alimentación de una base de datos de usuarios
        // Aquí puedes añadir lógica para insertar estos datos en una base de datos real
        almacenarEnBaseDeDatos(edadYNombre, epsYFechaNacimiento);
    }

    // Método simulado para almacenar datos en una base de datos
    public static void almacenarEnBaseDeDatos(Pair<Integer, String> edadYNombre, Pair<String, LocalDate> epsYFechaNacimiento) {
        // Lógica de almacenamiento (simulada)
        System.out.println("Almacenando en base de datos...");
        System.out.println("Usuario: " + edadYNombre.getSecond());
        System.out.println("Edad: " + edadYNombre.getFirst());
        System.out.println("EPS: " + epsYFechaNacimiento.getFirst());
        System.out.println("Fecha de Nacimiento: " + epsYFechaNacimiento.getSecond());
    }
}