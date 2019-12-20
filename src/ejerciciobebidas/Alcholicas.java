/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciobebidas;

/**
 *
 * @author Yashin
 */
public class Alcholicas extends Bebidas {
    
    String tipo;
    
    public Alcholicas (String marca, int cantidad, String presentacion, int precio, String tipo){
        this.marca = marca;
        this.cantidad = cantidad;
        this.presentacion = presentacion;
        this.precio = precio;
        this.tipo=tipo;
    }
      
}
