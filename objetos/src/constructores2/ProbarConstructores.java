/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructores2;

import javax.swing.JFrame;

/**
 *
 * @author T-101
 */
public class ProbarConstructores {
    public static void main(String[] args) {
        //VAMOS A CREAR UN OBJETO 
        Persona p1=new Persona("oscar");
        Persona p2=new Persona();
        JFrame ventana= new JFrame("Hola Mundo");
        ventana.setSize(300,300);
        ventana.setVisible(true);
    }
}
