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

    @Override
    public String toString() {
        return "Vehiculo{" + "codigo=" + codigo + ","
                + " marca=" + marca + ","
                + " tipo=" + tipo + ","
                + " modelo=" + modelo + ","
                + " kilometraje=" + kilometraje + '}';
    }
    private String codigo;
    private String marca;
    private String tipo;
    private int modelo;
    private double kilometraje;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public double getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(double kilometraje) {
        this.kilometraje = kilometraje;
    }
    //metodo contructor
    
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
        System.out.println("Modelo:"+ modelo);
        System.out.println("Kilometraje:"+ kilometraje);
        
    }
    
}
