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

class LaminaBotones extends JPanel implements ActionListener{
    JButton boton = new JButton("Boton Azul");
    JButton boton2 = new JButton("Boton Amarillo");
    JButton boton3 = new JButton("Boton Rojo");

    public LaminaBotones(){
        add(boton);
        add(boton2);
        add(boton3);

        boton.addActionListener(this);
        boton2.addActionListener(this);
        boton3.addActionListener(this);
    }

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
        
    }

}