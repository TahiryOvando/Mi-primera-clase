package mi.primer.paquete;

public class Clase1 {

	public static void main(String[] args) {
		Integer a = 10;
		Integer b = 1;
		
		//Condiccionador if
		if((a/b) == 1){
			
			//Codigo
			System.out.println("Codigo....");
		} else {
			System.out.println("2 Codigo....");
		}
		switch (a/b) {
		case 5:
			System.out.println("Primer Case Codigo....");
			break;
		case 2:
			System.out.println("Segundo Case Codigo....");
			break;
		case 10:
			System.out.println("10 Case Codigo....");
			break;

		default:
			System.out.println("Tercer Case Codigo....");
			break;
		}
		
	} 

}
