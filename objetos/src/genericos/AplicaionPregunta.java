package genericos;

import java.util.ArrayList;

public class AplicaionPregunta {
    
    public static void main(String[] args) {

        //Generamos las opciones
        Opcion o11 = new Opcion();
        o11.setTitulo("Mizcalco");
        o11.setCorrecta(false);
        Opcion o21 = new Opcion();
        o21.setTitulo("Texcoco");
        o21.setCorrecta(false);
        Opcion o31 = new Opcion();
        o31.setTitulo("Madrid");
        o31.setCorrecta(true);
        Opcion o41 = new Opcion();
        o41.setTitulo("Ecatepec");
        o41.setCorrecta(false);

        //Sigue la pregunta 
        Pregunta p11 = new Pregunta();
        p11.setTitulo("¿Cual es la capital de España?");
        //Antes generamos el ArrayList con las opciones de arriba
        //Objeto generico de tipo ArrayList
        ArrayList<Opcion> opcionesp11 = new ArrayList<>();
        opcionesp11.add(o11);
        opcionesp11.add(o21);
        opcionesp11.add(o31);
        opcionesp11.add(o41);
        //Ahora si este ArrayList lo agregamos a la primer pregunta
        p11.setOpciones(opcionesp11);

        //El cuestionario
        Cuestionario c1 = new Cuestionario();
        ArrayList<Pregunta> preguntas = new ArrayList<>();
        preguntas.add(p11);
        c1.setPreguntas(preguntas);
        
        for(Pregunta p:preguntas){
        
            System.out.println(p.getTitulo());
            for(Opcion o:p.getOpciones()){
                System.out.println(o.getTitulo()+" "+o.isCorrecta());
            
            }
        }
    }
    
}
