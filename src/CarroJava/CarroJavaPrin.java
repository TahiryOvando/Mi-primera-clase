package CarroJava;

import java.util.ArrayList;

public class CarroJavaPrin {

	public static void main(String[] args) {

		// Declarar variable, asignar valor + instanciar lista
		ArrayList<CarroJava> listaDeCarros = new ArrayList<CarroJava>();

		// Inicializacion de variable y new es igual a instanciar
		CarroJava golf = new CarroJava();
		
		// Asignar los valores de los atributos + Instnacias de CarroJava
		golf.setModelo("Golf ");
		golf.setColor("Plateado ");
		golf.setA�o(2020);
		golf.setMarca(" volkswagen");
		

		// A�adir elemento a la lista
		listaDeCarros.add(golf);

		// Asignar los valores de los atributos + Instnacias de CarroJava
		CarroJava tsuru = new CarroJava();
		tsuru.setModelo("Tsuru");
		tsuru.setColor("Rojo ");
		tsuru.setA�o(2003);
		tsuru.setMarca(" Nissan");

		// A�adir elemento a la lista
		listaDeCarros.add(tsuru);

		// Recorrer Lista de Carros
		for (CarroJava carrojava : listaDeCarros) {
			// evaluar valor + get = obtenerValor a�o comprarlo con 2020
			if (carrojava.getA�o() == 2020) {
				// asignar valor
				carrojava.setColor("Negro");
			}
			// evaluar valor + get = obtenerValor a�o comprarlo con 2020
			if (carrojava.getA�o() == 2003) {
				// asignar valor
				//Concatenar a su modelo 1
				carrojava.setModelo(carrojava.getModelo() + "1");

			}

		}

		// Imprimir lista
		System.out.println(listaDeCarros);

	}

}
