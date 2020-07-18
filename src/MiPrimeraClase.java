
public class MiPrimeraClase {
	
	/**
	 * Constante
	 */
	private static final String CONSTANTE_01 = "VALOR 1";
		
	/*
	 * Atributo
	 */
	private String atributo01;
	
	/*
	 * Atributo Estatico
	 */
	private static String atributoStatic01;

	public static String getAtributoStatic01() {
		return atributoStatic01;
	}

	public static void setAtributoStatic01(String atributoStatic01) {
		MiPrimeraClase.atributoStatic01 = atributoStatic01;
	}

	public String getAtributo01() {
		return atributo01;
	}

	public void setAtributo01(String atributo01) {
		this.atributo01 = atributo01;
	}

	public static String getConstante01() {
		return CONSTANTE_01;
	}
	
	/*
	 * Metodo toString para imprimir los valores de los atributos de la clase
	 */
	@Override
	public String toString() {
		return "MiPrimeraClase [atributo01=" + atributo01 + ", atributoStatic01=" + atributoStatic01 + "]";
	}


}

