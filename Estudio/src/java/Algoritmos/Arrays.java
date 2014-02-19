/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Algoritmos;

/**
 *
 * @author Oscar
 */
public class Arrays {

    //Ordenar un array de menor a mayor
    public static void main(String... args) {
        int nombreArray[] = {4, 6, 3, 2, 9};
        int nombre2Array[];
        int[] nombre3Array = new int[10];
        System.out.println("tamano : "+nombreArray.length);
        burbuja(nombreArray);

    }

    public static void burbuja(int[] A) {
        int i, j, aux;
        for (i = 0; i < A.length - 1; i++) {
            for (j = 0; j < A.length - i - 1; j++) {
                if (A[j + 1] > A[j]) { // Verifica que el siguiente elemento del array sea menor que el actual
                    aux = A[j + 1];
                    A[j + 1] = A[j];
                    A[j] = aux;
                }
            }
        }
        
        imprimirArray(A);
    }
    
    public static void imprimirArray(int[] A){
        
        for (int i = 0; i < A.length;i++){
            System.out.println("Elemento :"+i+" igual a :"+A[i]);
        }
        
    }
}
