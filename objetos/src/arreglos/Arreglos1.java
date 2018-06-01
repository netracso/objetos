
package arreglos;


public class Arreglos1 {
    public static void main(String[] args) {
        
        int []valores={1,-20,4}; //Declaración de un arreglo
        
        for(int i=0;i<valores.length;i++){
            System.out.println(valores[i]);
        }
    
    //Este siclo FOR es el mejorado y se recomienda siempre
        for (int v : valores) {
            System.out.println(v);
                    
        }
        //Segunda forma de inicializar los arrglos
        int otro[]=new int[4];
        
        for(int valor:otro){
            System.out.println(valor);
        }
        
        
        
    }
}
