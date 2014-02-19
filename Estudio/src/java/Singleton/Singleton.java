/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton;

/**
 *
 * @author Oscar
 */
public final class Singleton {
    
    private static final Singleton singleton = new Singleton();
    
    private static int cantidad;
    
    private Singleton(){
      System.out.println("Se creo una instancia de la Clase singleton");  
    }
    
    public static Singleton getSingleton(){
        cantidad++;
        System.out.println("catindad de veces que se llama el getSingleton "+cantidad);
        return singleton;
    }
        
}
