
public class CAplicacion {

    public static void main(String[] args) {
        //Creando un objrto de tipo grados
        CGrados g = new CGrados();
        //A este objeto le asignamos un valor a su atributo centigrados
        g.setCentigrados(20);
        //Creamos el objeto de la clase conversion
        CConversion c = new CConversion();
        c.setGrados(g);
        //Aplicar el modelo c.centigradosAFarenheit() despues se selecciona 
        //y se arrastra al sout
        System.out.println(c.centigradosAFarenheit());
        //Creando el objeto de tipo metros
        CLongitudes m = new CLongitudes();
        //Asignación de de valor a su atributo metros 
        m.setMetros(20);
        //creación del objeto de la clase conversion
        CConversion p = new CConversion();
        p.setMetros(m);
        System.out.println(p.metrosAPies());
        //instanciando a farenheit y convertirlos en centigrados 
        CGrados grados =new CGrados();
         grados.setFarenheit(20);
        CConversion f = new CConversion();         
        f.setGrados(grados);
        System.out.println(f.farenheitACentigrados());
        //Intanciando a objeto para convertir de pies a Metros
        CLongitudes pies = new CLongitudes();
        pies.setPies(20);
        CConversion metros = new CConversion();
        metros.setMetros(pies);
        System.out.println(metros.piesAMetros());
    }

}
