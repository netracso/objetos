
package constructores2;

import javax.swing.JFrame;


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
