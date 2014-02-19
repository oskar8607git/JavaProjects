/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Algoritmos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Oscar
 */
public class Listas {

    public static void main(String...args) {
        List<String> listaEjemplo = new ArrayList<String>();
        
        listaEjemplo.add("uno");
        listaEjemplo.add("dos");
        listaEjemplo.add("tres");

        for (String s : listaEjemplo) System.out.println(s);
    }
}
