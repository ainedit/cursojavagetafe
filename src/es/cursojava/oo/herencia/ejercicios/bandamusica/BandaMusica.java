package es.cursojava.oo.herencia.ejercicios.bandamusica;

public class BandaMusica {
    private String nombre;

    public BandaMusica(String nombre) {
        this.nombre = nombre;
    }
    
    public static void main(String[] args) {
//    	Instrumento instrumento = new Tambor("Tambor de Don Nicanor","Membrana","");
////    	Tambor t2 = new Tambor("Tambor de Don Nicanor2","Membrana","");
//////    	t2.aporrear(); 
////    	instrumento = t2;
//    	Tambor t = (Tambor)instrumento;
//    	t.aporrear();
    	
        BandaMusica banda = new BandaMusica("Filarmónica de Getafe");
        banda.empezarConcierto();
    }

    private void empezarConcierto(){
        Instrumento[] instrumentos = crearInstrumentos();
        afinar(instrumentos);
        tocarConcierto(instrumentos);
    }

    private void tocarConcierto(Instrumento[] instrumentos){
        System.out.println("\nEmpiezan a tocar");
        for (Instrumento instrumento : instrumentos) {
        	String clase = instrumento.getClass().getName();
        	int ultimoPunto = clase.lastIndexOf(".");
        	clase.substring(ultimoPunto+1);
        	System.out.println(clase.substring(ultimoPunto+1));
        	//if (clase.substring(ultimoPunto+1).equals("Tambor")) {
        	if (instrumento instanceof Tambor) {	
        	
        		Tambor t = (Tambor)instrumento;
        		t.aporrear();
        	}
//        	instrumento.tocar();
//        	//instrumento.aporrear();

        }
        System.out.println("El concierto ha terminado");
    }


    private void afinar(Instrumento[] instrumentos){
        System.out.println("\nAfinando instrumentos");
        for (Instrumento instrumento : instrumentos) {
            instrumento.afinar();
        }
        System.out.println("Instrumentos afinados");
    }
    
    private Instrumento[] crearInstrumentos (){
        System.out.println("Creando instrumentos");
        Guitarra bajo = new Guitarra(4,"Bajo","Cuerda");
        Guitarra guitarra = new Guitarra("Guitarra1","Española");
        GuitarraElectrica guitarraElectrica = new GuitarraElectrica("Electrica1", "Eléctrica");
        Piano piano = new Piano(8,"Piano de cola", "Piano1", "Tipo2");
        Tambor tambor = new Tambor("Tambor de Don Nicanor","Membrana","");

        
        Instrumento[] instrumentos = {bajo, guitarra, guitarraElectrica, piano, tambor};

        System.out.println("Instrumentos creados, total "+instrumentos.length);
        return instrumentos;
    }

}
