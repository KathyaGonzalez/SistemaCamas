/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemak;

/**
 *
 * @author Usuario 1
 */
public class Producto {
    String nombre;
    String color;
    String tamanio;
    String estilo;
    int cantidad;

    public Producto(String nombre, String color, String tamanio, String estilo, int cantidad) {
        this.nombre = nombre;
        this.color = color;
        this.tamanio = tamanio;
        this.estilo = estilo;
        this.cantidad = cantidad;
    }
    
    public void agrega(int cantidad){
        this.cantidad +=cantidad;
    }
    
}
