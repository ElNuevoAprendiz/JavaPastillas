/*En este programa se practican los eventos de raton a traves de la interface ActionListener */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PruebaEventos {
    
    public static void main(String[] args) {
        MarcoBotones miMarco = new MarcoBotones();
        miMarco.setVisible(true);
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }

}

class MarcoBotones extends JFrame{

    public MarcoBotones(){

        setTitle("Botones y eventos");
        setBounds(700,300,500,300);

        LaminaBotones miLamina = new LaminaBotones();
        add(miLamina);

    }
    
}

class LaminaBotones extends JPanel{

    JButton boton = new JButton("Boton Azul");
    JButton boton2 = new JButton("Boton Amarillo");
    JButton boton3 = new JButton("Boton Rojo");

    public LaminaBotones(){
        add(boton);
        add(boton2);
        add(boton3);

        ColorFondo amarillo = new ColorFondo(Color.YELLOW);
        ColorFondo azul = new ColorFondo(Color.BLUE);
        ColorFondo rojo = new ColorFondo(Color.RED);


        boton.addActionListener(azul);
        boton2.addActionListener(amarillo);
        boton3.addActionListener(rojo);
    }

    private class ColorFondo implements ActionListener{ //Clase interna ver minuto 8 video 67

        private Color colorFondo;

        public ColorFondo(Color c){
            colorFondo=c;
        
        }
        @Override
        public void actionPerformed(ActionEvent e) {
            setBackground(colorFondo);
        }

    }
    /*
    public void actionPerformed(ActionEvent e){

        Object botonPulsado = e.getSource();
        //if(e.getSource()== boton)

        if(botonPulsado==boton){
            setBackground(Color.BLUE);
        }
        else if(botonPulsado==boton2){
            setBackground(Color.YELLOW);
        }else{
            setBackground(Color.RED);
        }
        */
}




