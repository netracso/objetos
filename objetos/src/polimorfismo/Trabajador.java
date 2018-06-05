
package polimorfismo;


public abstract class Trabajador  {
  
    private int seguro;
    private String nombre;
    private float sueldoBase;
    //cuando varia un metodo se debe ser abstracta
    public abstract void pagar();
    //Implementar un metodo
    //metodos abstractos no deben llevar cuerpo
    

    public int getSeguro() {
        return seguro;
    }

    public void setSeguro(int seguro) {
        this.seguro = seguro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(float sueldoBase) {
        this.sueldoBase = sueldoBase;
    }
    
    
}
