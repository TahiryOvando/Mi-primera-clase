package PersonaJava;

public class AnimalJava {
	

	private String nombre;
	private String raza;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
	@Override
	public String toString() {
		return "AnimalJava [nombre=" + nombre + ", raza=" + raza + "]";
	}
}
