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
public class Bebidas {
    protected String marca;
    protected String sabor;
    protected int cantidad;
    protected String presentacion;
    protected int precio;

    
    public Bebidas(){}
    
    public Bebidas(String marca){
        this.marca = marca; 
    }
    public Bebidas (String marca, String sabor){
        this.marca = marca;
        this.sabor = sabor;
    }
    public Bebidas (String marca, String sabor, int cantidad){
        this.marca = marca;
        this.sabor = sabor;
        this.cantidad = cantidad;
    }
    public Bebidas (String marca, String sabor, int cantidad, int precio, String presentacion){
        this.marca = marca;
        this.sabor = sabor;
        this.cantidad = cantidad;
        this.precio= precio;
        this.presentacion = presentacion;
    }
    
    //*************************************************  
    
}
