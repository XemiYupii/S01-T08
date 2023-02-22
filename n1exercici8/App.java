package n1exercici8;

public class App {

	public static void main(String[] args) {
		
		Reves girarCadena = cadena -> new StringBuilder (cadena).reverse().toString();
		
//		Reves girarCadena = cadena -> {
//			StringBuilder girar = new StringBuilder (cadena);
//			return girar.reverse().toString();
//		};
		
		System.out.println(girarCadena.reverse("cantimplora"));
	}
}
