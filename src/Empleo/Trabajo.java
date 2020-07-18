package Empleo;

public class Trabajo {

	private String nombreEmpresa;
	private int salario;
	private String direccionEmpresa;
	
	public String getNombreEmpresa() {
		return nombreEmpresa;
	}
	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}
	public int getSalario() {
		return salario;
	}
	public void setSalario(int salario) {
		this.salario = salario;
	}
	public String getDireccionEmpresa() {
		return direccionEmpresa;
	}
	public void setDireccionEmpresa(String direccionEmpresa) {
		this.direccionEmpresa = direccionEmpresa;
	}
	@Override
	public String toString() {
		return "Empleo [nombreEmpresa=" + nombreEmpresa + ", salario=" + salario + ", direccionEmpresa="
				+ direccionEmpresa + "]";
	}
	
}
