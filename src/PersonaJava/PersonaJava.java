package PersonaJava;

import Empleo.Trabajo;

public class PersonaJava {
	
	private String nombre;
	private String empleo;
	private Trabajo trabajo;
	private AnimalJava animal;
	private int edad;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEmpleo() {
		return empleo;
	}
	public void setEmpleo(String empleo) {
		this.empleo = empleo;
	}
	public Trabajo getTrabajo() {
		return trabajo;
	}
	public void setTrabajo(Trabajo trabajo) {
		this.trabajo = trabajo;
	}
	public AnimalJava getAnimal() {
		return animal;
	}
	public void setAnimal(AnimalJava animal) {
		this.animal = animal;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	@Override
	public String toString() {
		return "PersonaJava [nombre=" + nombre + ", empleo=" + empleo + ", trabajo=" + trabajo + ", animal=" + animal
				+ ", edad=" + edad + "]";
	}
	

}
