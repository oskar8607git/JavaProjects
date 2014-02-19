/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ExpresionesRegulares;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Oscar
 */
public class ExpresionesRegulares {

    public static void main(String... args) {
        expresion2("sdfabcsdf");
    }

    //  1. Comprobar si el String cadena contiene exactamente el patrón (matches) “abc”
    public static void expresion1(String cadena) {
        Pattern pat = Pattern.compile("abc");
        Matcher mat = pat.matcher(cadena);

        if (mat.matches()) {
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }
    }
//2. Comprobar si el String cadena contiene “abc”

    public static void expresion2(String cadena) {
        Pattern pat = Pattern.compile(".*abc.*");
        Matcher mat = pat.matcher(cadena);

        if (mat.matches()) {
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }
    }

    public static void expresion3(String cadena) {
        //También lo podemos escribir usando el método find:
        Pattern pat = Pattern.compile("abc");
        Matcher mat = pat.matcher(cadena);

        if (mat.find()) {
            System.out.println("Válido");
        } else {
            System.out.println("No Válido");
        }
    }
//3. Comprobar si el String cadena empieza por “abc”

    public static void expresion4(String cadena) {
        Pattern pat = Pattern.compile("^abc.*");
        Matcher mat = pat.matcher(cadena);

        if (mat.matches()) {
            System.out.println("Válido");
        } else {
            System.out.println("No Válido");
        }
    }

//4. Comprobar si el String cadena empieza por “abc” ó “Abc”
    public static void expresion5(String cadena) {
        Pattern pat = Pattern.compile("^[aA]bc.*");
        Matcher mat = pat.matcher(cadena);

        if (mat.matches()) {
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }
    }

    //5. Comprobar si el String cadena está formado por un mínimo de 5 letras mayúsculas o minúsculas y un máximo de 10.
    public static void expresion6(String cadena) {
        Pattern pat = Pattern.compile("[a-zA-Z]{5,10}");
        Matcher mat = pat.matcher(cadena);

        if (mat.matches()) {
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }
    }

//6. Comprobar si el String cadena no empieza por un dígito
    public static void expresion7(String cadena) {
        Pattern pat = Pattern.compile("^[^\\d].*");
        Matcher mat = pat.matcher(cadena);

        if (mat.matches()) {
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }
    }

//7. Comprobar si el String cadena no acaba con un dígito
    public static void expresion8(String cadena) {
        Pattern pat = Pattern.compile(".*[^\\d]$");
        Matcher mat = pat.matcher(cadena);

        if (mat.matches()) {
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }
    }

//8. Comprobar si el String cadena solo contienen los caracteres a ó b
    public static void expresion9(String cadena) {
        Pattern pat = Pattern.compile("(a|b)+");
        Matcher mat = pat.matcher(cadena);

        if (mat.matches()) {
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }
    }

//9. Comprobar si el String cadena contiene un 1 y ese 1 no está seguido por un 2
    public static void expresion10(String cadena) {
        Pattern pat = Pattern.compile(".*1(?!2).*");
        Matcher mat = pat.matcher(cadena);

        if (mat.matches()) {
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }
    }
}
