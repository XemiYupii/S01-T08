package n1exercici2;

import java.util.Arrays;
import java.util.List;

public class App {

	public static void main(String[] args) {
		
		List<String> paraules = Arrays.asList("Gemma", "Jordi", "Julia", "Toni", "taula", "cadira", "pilota", "camisa", "gos", "televisio","cantimplora");
		List<String> conteOMes5lletres = filtrarO5lletres(paraules);
		conteOMes5lletres.forEach(System.out::println);

	}
	public static List<String> filtrarO5lletres (List<String> paraules){
		return paraules.stream().filter(paraula -> paraula.contains("o") && paraula.length() >5).toList();
	}

}
