package POO.ServiciosProcesos;

import java.awt.geom.*;

import javax.swing.*;

import java.util.*;
import java.awt.*;
import java.awt.event.*;

public class ThreadsTestingPildoras {

    public static void main(String[] args) {

        JFrame marco = new MarcoRebote();

        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        marco.setVisible(true);

    }

}

class PelotaHilos implements Runnable{
    public PelotaHilos(Pelota unaPelota, Component unComponente){
        pelota = unaPelota;
        componente = unComponente;
    }
    public void run(){
        for (int i = 1; i <= 3000; i++) {

            pelota.mueve_pelota(componente.getBounds());

            componente.paint(componente.getGraphics());

            try {
                Thread.sleep(2); // Este metodo estatico hace que la ejecucion del hilo se pause 4 milisegundos,
                                 // pero no aceptara mas instrucciones
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    } 
    private Pelota pelota;
    private Component componente;
}

// Movimiento de la
// pelota-----------------------------------------------------------------------------------------

class Pelota {

    // Mueve la pelota invirtiendo posición si choca con límites

    public void mueve_pelota(Rectangle2D limites) {

        x += dx;

        y += dy;

        if (x < limites.getMinX()) {

            x = limites.getMinX();

            dx = -dx;
        }

        if (x + TAMX >= limites.getMaxX()) {

            x = limites.getMaxX() - TAMX;

            dx = -dx;
        }

        if (y < limites.getMinY()) {

            y = limites.getMinY();

            dy = -dy;
        }

        if (y + TAMY >= limites.getMaxY()) {

            y = limites.getMaxY() - TAMY;

            dy = -dy;

        }

    }

    // Forma de la pelota en su posición inicial

    public Ellipse2D getShape() {

        return new Ellipse2D.Double(x, y, TAMX, TAMY);

    }

    private static final int TAMX = 15;

    private static final int TAMY = 15;

    private double x = 0;

    private double y = 0;

    private double dx = 1;

    private double dy = 1;

}

// Lámina que dibuja las
// pelotas----------------------------------------------------------------------

class LaminaPelota extends JPanel {

    // Añadimos pelota a la lámina

    public void add(Pelota b) {

        pelotas.add(b);
    }

    public void paintComponent(Graphics g) {

        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;

        for (Pelota b : pelotas) {

            g2.fill(b.getShape());
        }

    }

    private ArrayList<Pelota> pelotas = new ArrayList<Pelota>();
}

// Marco con lámina y
// botones------------------------------------------------------------------------------

class MarcoRebote extends JFrame {

    public MarcoRebote() {

        setBounds(600, 300, 400, 350);

        setTitle("Rebotes");

        lamina = new LaminaPelota();

        add(lamina, BorderLayout.CENTER);

        JPanel laminaBotones = new JPanel();

        ponerBoton(laminaBotones, "Dale!", new ActionListener() {

            public void actionPerformed(ActionEvent evento) {

                comienza_el_juego();
            }

        });

        ponerBoton(laminaBotones, "Salir", new ActionListener() {

            public void actionPerformed(ActionEvent evento) {

                System.exit(0);

            }

        });

        add(laminaBotones, BorderLayout.SOUTH);
    }

    // Ponemos botones

    public void ponerBoton(Container c, String titulo, ActionListener oyente) {

        JButton boton = new JButton(titulo);

        c.add(boton);

        boton.addActionListener(oyente);

    }

    // Añade pelota y la bota 1000 veces

    public void comienza_el_juego() {

        Pelota pelota = new Pelota();

        lamina.add(pelota);

        Runnable r= new PelotaHilos(pelota, rootPane);

        Thread th = new Thread(r); 

        th.start();
        

    }

    private LaminaPelota lamina;

}

/*
 * Crear hilos de ejecucion:
 * 1. Crear clase que implemente la interfaz Runnable(metodo run())
 * 2. Escribir codigo de la tarea dentro del metodo run
 * 3. Instanciar la clase creada y almacenar la instancia en variable de tipo Runnable
 * 4. Crear instancia de la clase Thread pasando como parametro al constructor de Thread el objeto Runnable anterior
 * 5. Poner en marcha el hilo de ejecucion con el metodo start() de la clase Thread
 */