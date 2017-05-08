package edu.ncsu.monopoly.gui;

import edu.ncsu.monopoly.Sistema;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import javax.swing.JOptionPane;



public class Main {

	

	public static void main(String[] args) {
            
        try {
            FileInputStream fis = new FileInputStream("jugadores.txt");
            BufferedInputStream b = new BufferedInputStream(fis);
            ObjectInputStream o = new ObjectInputStream(b);
            Sistema sistema;
            sistema = (Sistema) o.readObject();
            o.close();
            StartWindow ventana = new StartWindow(sistema);
            ventana.setVisible(true);
        } catch (IOException | ClassNotFoundException e) {
            Sistema sistema = new Sistema();
            StartWindow ventana = new StartWindow(sistema);
            ventana.setVisible(true);
        } 
                
	}
}
