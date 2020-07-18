package Empleo;

import java.util.ArrayList;

import PersonaJava.AnimalJava;
import PersonaJava.PersonaJava;

public class Persona {

	public static void main(String[] args) {
		
		ArrayList<PersonaJava> ListEmpleoPerso = new ArrayList<PersonaJava>();
		
		PersonaJava regina = new PersonaJava();
		AnimalJava perro = new AnimalJava();
		Trabajo abogado = new Trabajo ();
		
		abogado.setNombreEmpresa("conagua");
		abogado.setSalario(24000);
		abogado.setDireccionEmpresa("insurgentes sur");
		
		regina.setNombre("Regina");
		regina.setEmpleo("abogado");
		regina.setTrabajo(abogado);
		regina.setAnimal(perro);
		regina.setEdad(20);
		
		PersonaJava oscar = new PersonaJava();
		AnimalJava leon = new AnimalJava();
		Trabajo desarrollador = new Trabajo ();
		
		desarrollador.setNombreEmpresa("Inbursa");
		desarrollador.setSalario(35000);
		desarrollador.setDireccionEmpresa("polanco 1er seccion");
		
		oscar.setNombre("Oscar");	
		oscar.setEmpleo("desarrollador");
		oscar.setTrabajo(desarrollador);
		oscar.setAnimal(leon);
		oscar.setEdad(36);
		
		ListEmpleoPerso.add(regina);
		ListEmpleoPerso.add(oscar);
		System.out.println(ListEmpleoPerso);
		

	}

}
