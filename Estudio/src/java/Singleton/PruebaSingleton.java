/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton;

import org.jboss.weld.context.ApplicationContext;

/**
 *
 * @author Oscar
 */
public class PruebaSingleton {


    public static void main(String... args) {
        Singleton singletonPrueba = Singleton.getSingleton();
        Singleton singletonPrueba2 = Singleton.getSingleton();
        Singleton singletonPrueba3 = Singleton.getSingleton();
        Singleton singletonPrueba4 = Singleton.getSingleton();
    }

    public PruebaSingleton() {

    }
}
