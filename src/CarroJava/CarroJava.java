package CarroJava;

public class CarroJava {

	private String modelo;
	private int a�o;
	private String color;
	private String marca;
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getA�o() {
		return a�o;
	}
	public void setA�o(int a�o) {
		this.a�o = a�o;
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
		return "CarroJava [modelo=" + modelo + ", a�o=" + a�o + ", color=" + color + ", marca=" + marca + "]";
	}
	
	
	
	
}
