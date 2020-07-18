package CarroJava;

public class CarroJava {

	private String modelo;
	private int año;
	private String color;
	private String marca;
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAño() {
		return año;
	}
	public void setAño(int año) {
		this.año = año;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	@Override
	public String toString() {
		return "CarroJava [modelo=" + modelo + ", año=" + año + ", color=" + color + ", marca=" + marca + "]";
	}
	
	
	
	
}
