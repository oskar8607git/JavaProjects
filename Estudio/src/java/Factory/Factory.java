/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

/**
 *
 * @author Oscar
 */
public class Factory {

    Conexion conexion;

    public Conexion establecerConexion(String tipo) {

        if (tipo.equals("Mysql")) {
            System.out.println("Entro Mysql");
            return new Mysql();
        } else if (tipo.equals("Postgresql")) {
            return new Postgresql();
        } else {
            return new Oracle();
        }

    }
}
