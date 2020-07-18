package PerroJava;

public class PerroJavaP {

	public static void main(String[] args) {
		
		/*
		 * Inicializacion de variable y new es igual a instanciar
		 */
		PerroJava perro = new PerroJava();
		PerroJava williams = new PerroJava();

		StringBuilder perrito = new StringBuilder("El perro se llama ");
		StringBuilder sara = new StringBuilder("El perro se llama ");
	
		perro.setNombre("Pretul");
		perro.setEdad(3);
		perro.setColor("Negro");
		
		//Normalizacio
       System.out.println("El perro se llama " + perro.getNombre() + " tiene " + perro.getEdad() + " años" + " y es de color " + perro.getColor());
     
       //String Builder
       perrito.append(perro.getNombre());
       perrito.append(" tiene ");
       perrito.append(perro.getEdad());
       perrito.append(" años y es de color ");
       perrito.append(perro.getColor());
       System.out.println(perrito);
       
       //El segundo que hice
       williams.setNombre("Juan");	
       williams.setEdad(4);
       williams.setColor("cafe");
       
       //Nomralizao
       System.out.println("El perro se llama " + williams.getNombre() + " tiene " + williams.getEdad() + " años" + " y es de color " + williams.getColor());
       
       //Strin Builder
       sara.append(williams.getNombre());
       sara.append(" tiene ");
       sara.append(williams.getEdad());
       sara.append(" años y es de color ");
       sara.append(williams.getColor());
       System.out.println(sara);

       
	}

}
