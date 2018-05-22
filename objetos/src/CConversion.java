 // Clase modelo contiene la lógica u operaciones con los objetos 

public class CConversion {

    //Se declara la clase Cgrados y clase CLongitudes
    private CGrados grados;
    private CLongitudes metros;
//Metodo CentigrasAFarenheit

    public float centigradosAFarenheit() {
        //Este metodo tiene lógica
         //error lo marca ya que por default el 1.8 lo lee como double
        //Ponerle una f al final para identificar  que es un flotante

        float resultado = grados.getCentigrados() * 1.8f + 32;
        return resultado;
    }
//Metodo para las longitudes de metros a pies

    public float metrosAPies() {
        //Este metodo tiene lógica
        float resultado = metros.getMetros() * 2.28f;
        return resultado;
    }

    //Comienzan los metos Get and Set

    public CGrados getGrados() {
        return grados;
    }

    public void setGrados(CGrados grados) {
        this.grados = grados;
    }

    public CLongitudes getMetros() {
        return metros;
    }

    public void setMetros(CLongitudes metros) {
        this.metros = metros;
    }

}
