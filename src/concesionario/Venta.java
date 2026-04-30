/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author CORE I5
 */
package concesionario;

public class Venta {
    private final double montoVenta;
    private final String codigoVehiculo;
    private final String apellido;
    private final String nombre;
    private final String documento;
    
    public Venta(double montoVenta,String codigoVehiculo,String apellido, String nombre, String documento){
        this.montoVenta = montoVenta;
        this.codigoVehiculo = codigoVehiculo;
        this.apellido = apellido;
        this.nombre = nombre;
        this.documento = documento;
        
    }    
    
    public void mostrarVenta(){
       System.out.println("Monto de venta: " + montoVenta);
        System.out.println("Código vehículo: " + codigoVehiculo);
        System.out.println("Comprador: " + nombre + " " + apellido);
        System.out.println("Documento: " + documento);
    }
}
