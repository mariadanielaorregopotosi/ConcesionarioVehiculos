/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author CORE I5
 */
package concesionario;

public class Principal {
    public static void main(String[] args){
        Auto auto1 = new Auto ("A001", "Toyota", 2022, 15000);
        Camioneta camioneta1 = new Camioneta("C001","Ford", 2021, 30000);
        Motocicleta moto1 = new Motocicleta("M001", "yamaha", 2023, 5000);
        
        System.out.println("Vehiculos Disponibles:");
        auto1.mostrarDatos();
        
        System.out.println("Camionetas disponibles:");
        camioneta1.mostrarDatos();
        
        System.out.println("Motos diaponibles:");
        moto1.mostrarDatos();
        
        System.out.println("Registro de ventas:");
         
        Venta venta1 = new Venta(
                 50000000,
                "A001",
                "perez",
                "juan",
                "1020485467"
        );
        
        venta1.mostrarVenta();
               
        
        
    }
    
}
