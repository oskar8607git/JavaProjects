/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

/**
 *
 * @author Oscar
 */
public class Oracle extends Conexion {

    @Override
    public void crearConexion() {
        System.out.println("Conexion Oracle");
    }
    
}
