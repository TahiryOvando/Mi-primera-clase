package PersonaJava;

import java.util.ArrayList;

public class PersonaJavaP {

	public static void main(String[] args) {

		// Declarar variable, asignar valor + instanciar lista
		ArrayList<PersonaJava> listaDePerso = new ArrayList<PersonaJava>();

		// Declarar variable, asignar valor + instanciar lista
		PersonaJava landy = new PersonaJava();
		AnimalJava gata = new AnimalJava();

		gata.setNombre("gata");
		gata.setRaza("felino");

		// Asignar los valores de los atributos + Instnacias de PersonaJava
		landy.setNombre("Landy");
		landy.setEmpleo("Abogado");
		landy.setAnimal(gata);
		landy.setEdad(23);

		PersonaJava sara = new PersonaJava();
		AnimalJava perra = new AnimalJava();

		perra.setNombre("perra");
		perra.setRaza("pitbull");
		sara.setNombre("Sara");
		sara.setEmpleo("Secretaria");
		sara.setAnimal(perra);
		sara.setEdad(20);

		PersonaJava juan = new PersonaJava();
		AnimalJava aguila = new AnimalJava();

		aguila.setNombre("Aguila");
		aguila.setRaza("Real");
		juan.setNombre("Juan");
		juan.setEmpleo("Plomero");
		juan.setAnimal(aguila);
		juan.setEdad(16);

		PersonaJava williams = new PersonaJava();
		AnimalJava tiburon = new AnimalJava();
		tiburon.setNombre("Tiburon");
		tiburon.setRaza("Real");
		williams.setNombre("WilTiburonlimas");
		williams.setEmpleo("Seguridad");
		williams.setAnimal(tiburon);
		williams.setEdad(25);

		PersonaJava irma = new PersonaJava();
		AnimalJava vaca = new AnimalJava();
		vaca.setNombre("Vaca");
		vaca.setRaza("Romagnola");
		irma.setNombre("Irma");
		irma.setEmpleo("Ama de Casa");
		irma.setAnimal(vaca);
		irma.setEdad(20);

		PersonaJava omar = new PersonaJava();
		AnimalJava caballo = new AnimalJava();
		caballo.setNombre("Caballo");
		caballo.setRaza("TENNESSEE WALKING HORSE");
		omar.setNombre("Omar");
		omar.setEmpleo("Desarrollador");
		omar.setAnimal(caballo);
		omar.setEdad(14);

		PersonaJava delfin = new PersonaJava();
		AnimalJava animalDelfin = new AnimalJava();
		animalDelfin.setNombre("Delfin");
		animalDelfin.setRaza(" Risso");
		delfin.setNombre("Delfin");
		delfin.setEmpleo("Telefonista");
		delfin.setAnimal(animalDelfin);
		delfin.setEdad(25);

		PersonaJava macky = new PersonaJava();
		AnimalJava culebra = new AnimalJava();
		culebra.setNombre("Culebra");
		culebra.setRaza(" Ophidia");
		macky.setNombre("Macky");
		macky.setEmpleo("Panadera");
		macky.setAnimal(culebra);
		macky.setEdad(20);

		PersonaJava katia = new PersonaJava();
		AnimalJava pez = new AnimalJava();
		pez.setNombre("Pez");
		pez.setRaza("guppy");
		katia.setNombre("Katia");
		katia.setEmpleo("Cocinera");
		katia.setAnimal(pez);
		katia.setEdad(20);

		PersonaJava david = new PersonaJava();
		AnimalJava mono = new AnimalJava();
		mono.setNombre("Mono");
		mono.setRaza("Mono Carablanca");
		david.setNombre("David");
		david.setEmpleo("Maestro");
		david.setAnimal(mono);
		david.setEdad(20);

		// Añadir elemento a la lista
		listaDePerso.add(landy);
		listaDePerso.add(sara);
		listaDePerso.add(juan);
		listaDePerso.add(williams);
		listaDePerso.add(irma);
		listaDePerso.add(omar);
		listaDePerso.add(delfin);
		listaDePerso.add(macky);
		listaDePerso.add(katia);
		listaDePerso.add(david);

		// Recorrer Lista de Persona
		for (PersonaJava personajava : listaDePerso) {

			if (personajava.getEdad() == 20) {
				// asignar valor
				personajava.setEmpleo("Corredor");
			}
			if (personajava.getEdad() == 25) {
				// asignar valor
				// Concatenar a su modelo 1
				personajava.setEmpleo("Vendedor");
			}

		}
		// Imprimir lista
		System.out.println(listaDePerso);

	}

}
