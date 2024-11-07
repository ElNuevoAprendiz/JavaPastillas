/*En este programa se explora el manejos de los eventos de una ventana (Cerrar, maximizar, etc) */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PruebaEventosVentana {
    
    public static void main(String[] args) {

        MarcoVentana miMarco = new MarcoVentana();
        
        miMarco.setVisible(true);
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miMarco.setTitle("Ventana1");
        miMarco.setBounds(700,300,500,300);

        MarcoVentana miMarco2 = new MarcoVentana();
        
        miMarco2.setVisible(true);
        miMarco2.setTitle("Ventana2");
        miMarco2.setBounds(200,300,500,300);

        miMarco2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
    }

}

class MarcoVentana extends JFrame{

    public MarcoVentana(){

        //setTitle("Respondiendo");
        //setBounds(700,300,500,300);

        M_Ventana oyenteVentana = new M_Ventana();
        addWindowListener(oyenteVentana);


    }
    
}

class M_Ventana implements WindowListener{

    public void windowActivated(WindowEvent e){
        
    }

    public void windowClosed(WindowEvent e){}

    public void windowClosing(WindowEvent e){}

    public void windowDeactivated(WindowEvent e){}

    public void windowIconified(WindowEvent e){

    }

    public void windowDeiconified(WindowEvent e){}

    public void windowOpened(WindowEvent e){}

}
