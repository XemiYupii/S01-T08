package exercici1;

import java.util.Arrays;
import java.util.List;

public class App {

	public static void main(String[] args) {
		
		List <String> paraules = Arrays.asList("Gemma", "Jordi", "Julia", "Toni", "taula", "cadira", "pilota", "camisa", "gos", "televisio","cantimplora");
		List<String> conteO = filtrarO(paraules);
		conteO.forEach(System.out::println);

	}
	public static List<String> filtrarO (List<String> paraules){
		return paraules.stream().filter(paraula -> paraula.contains("o")).toList();
	}

}
