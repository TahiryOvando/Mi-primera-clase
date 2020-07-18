
public class MiSegundaClase {

	public static void main(String[] args) {
		//System.out.println("Hola Mundo");
		//System.out.print("Nuevo Texto");
		//System.out.println("Segundo Texto");
		/*
		 * Inicializacion de variable y new es igual a instanciar
		 */
		MiPrimeraClase miclase = new MiPrimeraClase();
		
		System.out.println("Valor de atributo 01 > " + miclase.getAtributo01());
		
		//Asignar un valor
		miclase.setAtributo01("Este valor");
		
		//Obteneru n valor
		miclase.getAtributo01();
		
		System.out.println("Valor de atributo 01 > " + miclase.getAtributo01());
		
	

	}

}
