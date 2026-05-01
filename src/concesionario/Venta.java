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

    @Override
    public String toString() {
        return "Venta{" + 
                "montoVenta=" + montoVenta +
                ", codigoVehiculo=" + codigoVehiculo + ","
                + " apellido=" + apellido + ","
                + " nombre=" + nombre + ","
                + " documento=" + documento + '}';
    }
    private  double montoVenta;
    private  String codigoVehiculo;
    private  String apellido;
    private  String nombre;
    private  String documento;
    
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
