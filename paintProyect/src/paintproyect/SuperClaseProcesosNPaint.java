/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package paintproyect;

import java.awt.Color;
import java.awt.Graphics;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


/**
 *
 * @author 
 */
public class SuperClaseProcesosNPaint {
    

    //Este Metodo Pinta puntos y rectas en el panel
    public static void dibujarLinea(Graphics g, int x, int y, int x1, int y1) {
        g.setColor(Color.red);
        g.drawLine(x, y, x1, y1);
    }

    //Este Metodo Pinta poligonos en el panel
    public static void dibujarPoligono(Graphics g, int[] xPoint, int[] yPoint, int points) {
        g.drawPolygon(xPoint, yPoint, points);
    }
    
    //Este Metodo Pinta poligonos relleno en el panel
    public static void dibujarPoligonoRelleno(Graphics g, int[] xPoint, int[] yPoint, int points) {
        g.fillPolygon(xPoint, yPoint, points);
    }
    
    //Este Metodo Pinta poligonos en el panel
    public static void dibujarCirculo(Graphics g, int radio) {
        g.drawOval(450, 150, radio , radio);
    }
    
    
    //Este Metodo Pinta poligonos en el panel
    public static void guardarArchivo(int counterPoli, int counterFile, int[] puntosX, int[] puntosY ) throws IOException {

        File archivo = new File("archivo" + counterFile + ".txt");
        FileWriter coordenadas = new FileWriter(archivo, true);
        String infoPuntos = "";

        for (int i = 0; i < counterPoli; i++) {
            infoPuntos += "(" + puntosX[i] + "," + puntosY[i] + ")";
        }

        coordenadas.write("Coordenadas: " + infoPuntos);
        coordenadas.close();
        
    }
    
    
}
