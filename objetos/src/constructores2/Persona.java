
package constructores2;


public class Persona {
    
    String nombre;
    int edad;
    int peso;

    public Persona() {
    }

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Persona(String nombre) {
        this.nombre = nombre;
    }
    
    public Persona(int peso, String nombre){
    this.nombre=nombre;
    this.peso=peso;
    }
    
    
}
