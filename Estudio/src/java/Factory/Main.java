/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

import java.util.Scanner;

/**
 *
 * @author Oscar
 */
public class Main {
    
    public static void main(String...args){
        Scanner sc = new Scanner(System.in);
        Factory factory;
        Conexion conexion;
        System.out.print("Digite el tipo de conexion :");
        String tipo = sc.nextLine();
        
        factory = new Factory();
        conexion = factory.establecerConexion(tipo);
        conexion.crearConexion();
        
    }
    
}
