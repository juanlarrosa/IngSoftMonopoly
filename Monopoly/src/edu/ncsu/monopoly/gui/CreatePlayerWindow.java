/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ncsu.monopoly.gui;

import edu.ncsu.monopoly.Player;
import edu.ncsu.monopoly.Sistema;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;

/**
 *
 * @author mateoblanco
 */
public class CreatePlayerWindow extends javax.swing.JFrame {
    private Sistema sistema;
    /**
     * Creates new form CreatePlayerWindow
     */
    public CreatePlayerWindow(Sistema unSistema) {
        initComponents();
        sistema=unSistema;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNombreJugador = new javax.swing.JTextField();
        BtnCrearJugador = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BtnCrearJugador.setText("Crear");
        BtnCrearJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCrearJugadorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(txtNombreJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(69, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnCrearJugador)
                .addGap(142, 142, 142))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(txtNombreJugador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(BtnCrearJugador)
                .addContainerGap(94, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnCrearJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCrearJugadorActionPerformed
        
        try {
            
        String nombreIngresado=txtNombreJugador.getText().trim();
        

        if(nombreIngresado.equals("") || nombreIngresado.isEmpty()){
            JOptionPane.showMessageDialog(this, "El campo nombre esta vacío " , "Error", JOptionPane.ERROR_MESSAGE);
            
        }
        
        else{
            
           Player p=new Player();
           sistema.agregarJugador(p);
           this.dispose();     
        
        }
        
            
        } 
        catch (NumberFormatException err){
             // El error se produce por el ingreso incorecto del monto
            JOptionPane.showMessageDialog(this, "El campo debe contener numeros" , "Error", JOptionPane.ERROR_MESSAGE);
            
            
        } 
        catch(HeadlessException err) {
            // Ocurre otro error no identificado
            JOptionPane.showMessageDialog(this, "Ingrese los datos correctamente" , "Error", JOptionPane.ERROR_MESSAGE);
            
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_BtnCrearJugadorActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCrearJugador;
    private javax.swing.JTextField txtNombreJugador;
    // End of variables declaration//GEN-END:variables
}
