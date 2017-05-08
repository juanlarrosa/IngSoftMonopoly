/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ncsu.monopoly;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Observable;

/**
 *
 * @author mateoblanco
 */
public class Sistema extends Observable implements Serializable{
    
    private ArrayList<Player> listaJugadores;
    
    public Sistema() {
        listaJugadores = new ArrayList<>();

    }
    public ArrayList<Player> devolverJugadores() {
        return listaJugadores;
    }

    public void agregarJugador(Player unJugador) {
       
            this.devolverJugadores().add(unJugador);
            this.setChanged();
	this.notifyObservers();
        
    }

    public void eliminarJugador(Player unJugador) {
        this.devolverJugadores().remove(unJugador);
        this.setChanged();
	this.notifyObservers();
    }
    
    public Player devolverJugador(int jugadorIngresado) {
        Player p = this.devolverJugadores().get(jugadorIngresado);
        return p;

    }
    
}
