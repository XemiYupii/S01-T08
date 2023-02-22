package n2exercici3;

public class App {

	public static void main(String[] args) {

		Calculadora calculadora = (num,  num2, operador) -> {
			float resultat = 0;
			if (operador == '+')
				resultat = num + num2;
			else if (operador == '-')
				resultat = num - num2;
			else if (operador == '*')
				resultat = num * num2;
			else if (operador == '/')
				resultat = num / num2;
			return resultat;
		};
		System.out.println(calculadora.operacio(2.3f, 4f, '+'));
		System.out.println(calculadora.operacio(2.76f, 2.5f, '-'));
		System.out.println(calculadora.operacio(7.9f, 0, '*'));
		System.out.println(calculadora.operacio(4, 2.3f, '/'));

	}

}
