/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author CORE I5
 */
package concesionario;
/**
 *
 * se creo clase padre
 */
public class Vehiculo {
    protected String codigo;
    protected String marca;
    protected String tipo;
    protected int modelo;
    protected double kilometraje;
    
    public Vehiculo(String codigo,String marca, String tipo, int modelo, double kilometraje){
        this.codigo = codigo;
        this.marca = marca;
        this.tipo =tipo;
        this.modelo = modelo;
        this.kilometraje =kilometraje;
        
    }
    
    public void mostrarDatos(){
        System.out.println("codigo:"+ codigo);
        System.out.println("Marca:" + marca);
        System.out.println("Tipo:"+ tipo);
        System.out.println("Modelo"+ modelo);
        System.out.println("Kilometraje:"+ kilometraje);
        
    }
    
}
