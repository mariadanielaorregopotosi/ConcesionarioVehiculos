/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author CORE I5
 */
public class Persona {
    //atributos
    private String nombre;
    private String apellido;
    private String genero;
    private int edad;
    //constructor
    public Persona(String nombre,String apellido,String genero,int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.edad = edad;
    }
    //metodo get
    public String getNombre(){
        return nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public String getGenero(){
        return genero;
    }
    public int getEdad(){
        return edad;
    }
}
