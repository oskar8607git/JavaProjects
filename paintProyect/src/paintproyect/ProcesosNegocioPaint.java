/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package paintproyect;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Oscar
 */
// <applet width="900" height="600" code="ProcesosNegocioPaint"></applet>
public class ProcesosNegocioPaint extends SuperClaseProcesosNPaint {

    private static int counterPoli = 0;
    private static int counter = 0;
    private static int counterFile = 0;
    private static int puntos[] = new int[4];
    private static int puntosX[] = new int[100];
    private static int puntosY[] = new int[100];
    private static JPanel pnl1, pnl2;
    private static JFrame frame;
    private static JTextField txtF1;

    public static void main(String argv[]) {
        ProcesosNegocioPaint app = new ProcesosNegocioPaint();
    }

    public ProcesosNegocioPaint() {

        pnl1 = new JPanel();
        pnl2 = new JPanel();

        JButton btn1 = new JButton("Dibujar Recta");
        JButton btn2 = new JButton("Dibujar Poligono");
        JButton btn3 = new JButton("Dibujar Poligono Relleno");
        JButton btn4 = new JButton("Dibujar Circulo");
        JButton btn5 = new JButton("Limpiar Panel");
        JButton btn6 = new JButton("Guardar en Archivo");
        JLabel lb1 = new JLabel("Radio");

        txtF1 = new JTextField("", 2);

        frame = new JFrame("Paint");
        frame.setSize(900, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        pnl1.setLayout(new GridLayout(2, 4));

        frame.add(BorderLayout.NORTH, pnl2);
        frame.add(BorderLayout.CENTER, pnl1);

        //Esta acción se encarga de dibujar una recta
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dibujarLinea(pnl1.getGraphics(), puntos[0], puntos[1], puntos[2], puntos[3]);
            }
        });

        //Esta acción se encarga de dibujar un poligono
        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (counterPoli > 2) {
                    dibujarPoligono(pnl1.getGraphics(), puntosX, puntosY, counterPoli);
                }
            }
        });

        //Esta acción se encarga de dibujar un poligono relleno
        btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (counterPoli > 2) {
                    dibujarPoligonoRelleno(pnl1.getGraphics(), puntosX, puntosY, counterPoli);
                }
            }
        });

        //Esta acción se encarga de pintar un curculo en el panel
        btn4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (txtF1.getText() != null && !txtF1.getText().isEmpty()) {
                    dibujarCirculo(pnl1.getGraphics(), Integer.parseInt(txtF1.getText()));
                }
            }
        });

        //Esta acción se encarga de limpiar el panel
        btn5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                limpiarPanel();
            }
        });

        //Esta acción guarda en un archivo
        btn6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    guardarArchivo(counterPoli, counterFile, puntosX, puntosY);
                    counterFile++;
                } catch (IOException ex) {
                    Logger.getLogger(ProcesosNegocioPaint.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        //Esta accion se encarga de los clics sobre el panel1
        pnl1.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent me) {

                dibujarLinea(pnl1.getGraphics(), me.getX(), me.getY(), me.getX(), me.getY());

                if (counter < 3) {
                    puntos[counter] = me.getX();
                    puntos[counter + 1] = me.getY();
                    counter = counter + 2;
                }
                if (counter > 2) {
                    counter = 0;
                }
                puntosX[counterPoli] = me.getX();
                puntosY[counterPoli] = me.getY();
                counterPoli++;

            }
        });

        pnl2.add(btn1);
        pnl2.add(btn2);
        pnl2.add(btn3);
        pnl2.add(lb1);
        pnl2.add(txtF1);
        pnl2.add(btn4);
        pnl2.add(btn5);
        pnl2.add(btn6);
        frame.setVisible(true);
    }


    //Este Metodo limpia el panel
    public static void limpiarPanel() {
        puntosX = new int[100];
        puntosY = new int[100];
        puntos = new int[4];
        counterPoli = 0;
        counter = 0;
        pnl1.removeAll();
        pnl1.repaint();
    }
}
