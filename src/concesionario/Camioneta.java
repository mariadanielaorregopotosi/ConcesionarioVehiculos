/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author CORE I5
 */
package concesionario;

import concesionario.Vehiculo;

public class Camioneta extends Vehiculo{
   public Camioneta(String codigo, String marca, int modelo, double kilometraje) {
       super(codigo,marca,"Camioneta", modelo,kilometraje);
   }
}
