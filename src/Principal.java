/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author CORE I5
 */
import java.util.LinkedList;
import java.util.Scanner;

public class Principal {
   //metodo para mostrar personas
    public static void mostrarPersonas (LinkedList<Persona> personas){
        System.out.println("Némero de personas registradas:");
        for (Persona p : personas){
            System.out.println("Nombre: " + p.getNombre()
            + "Género:" + p.getGenero());
        }
    }
    
    // metodo promedio edades
    public static double promedioEdades(LinkedList<Persona> personas){
        int suma = 0;
        for (Persona p : personas) {
            suma += p.getEdad();
        }
        return (double) suma / personas.size();
    }
    //metodod contar genro masculino
    public static int contarMasculinos(LinkedList<Persona> personas){
        int contador = 0;
        for (Persona p: personas) {
            if (p.getGenero().equalsIgnoreCase("Masculino")){
                contador++;
            }
        }
        return contador;
    }
    //metodod contar genero femenino
    public static int contarFemeninos(LinkedList<Persona> personas){
        int contador = 0;
        for (Persona p : personas){
            if (p.getGenero().equalsIgnoreCase("Femenino")){
                contador++;
            }
        }
        return contador;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        LinkedList<Persona> personas = new LinkedList<>();
        //captura de datos
        for(int i = 0; i<5; i++){
            System.out.println("número de personas:" + (i + 1));
            
             System.out.print("Nombre: ");
            String nombre = sc.nextLine();

            System.out.print("Apellido: ");
            String apellido = sc.nextLine();

            System.out.print("Género (Masculino/Femenino): ");
            String genero = sc.nextLine();

            System.out.print("Edad: ");
            int edad = sc.nextInt();
            sc.nextLine();
            //crear objeto
            Persona persona = new Persona(nombre, apellido, genero, edad);
            //agregar a la lista
            personas.add(persona);
        }
        //resultado
        mostrarPersonas(personas);
        
        System.out.println("promedio de edades:"
        + promedioEdades(personas));
        
        System.out.println("cuantos hombres hay en la base de datos:"
                + contarMasculinos(personas));
        
        System.out.println("cuantas mujeres hay en la base de datos:"
        + contarFemeninos(personas));
        sc.close();
        
        
    }
}
