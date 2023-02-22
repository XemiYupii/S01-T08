package n2exercici4;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class App {

	public static void main(String[] args) {
		
		List<String>cadenesNumerosText = Arrays.asList("Gemma", "8910", "0123", "123","Alba","ajuntament","llibreta", "escola", "lletres", "9874");
		
		//Oredenar llista alfabèticament pel 1er caràcter -- 2 maneres
		Collections.sort(cadenesNumerosText, (cadena1, cadena2) -> Character.compare(cadena1.charAt(0), cadena2.charAt(0)));
		
		cadenesNumerosText.sort((o1, o2) -> String.valueOf(o1.charAt(0)).compareTo(String.valueOf(o2.charAt(0))));
		//cadenesNumerosText.forEach(System.out::println);
		
		//Oredenar llista 1er les cadenes que contenen la e i després la resta de cadenes
		 cadenesNumerosText.sort((o1, o2) -> o1.contains("e") && o2.contains("e") ? 0 : (o1.contains("e") && !o2.contains("e") ? -1 : 1));
		// cadenesNumerosText.forEach(System.out::println);
		 
		 //Canviar les a per 4
		cadenesNumerosText.stream().filter(cadena -> cadena.contains("a")).map(cadena -> cadena.replace("a","4")).forEach(System.out::println);
		
		 //Mostrar elements que són numèrics 
		cadenesNumerosText.stream().filter(cadena -> cadena.matches("\\d+")).forEach(System.out::println);
		
	}

}
