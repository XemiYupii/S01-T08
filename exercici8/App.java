package exercici8;

public class App {

	public static void main(String[] args) {
		
		Reves girarCadena = cadena -> { 
			String reves ="";
			for (int i = cadena.length() -1; i >= 0; i--) {
				reves += cadena.charAt(i);
			}
			return reves;
		};
		System.out.println(girarCadena.reverse("cantimplora"));
	}
}
