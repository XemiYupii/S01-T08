package n1exercici6;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class App {

	public static void main(String[] args) {
		
		List<String> llistaNumerosParaules = Arrays.asList("Gemma", "36", "Jordi", "7", "Julia", "3", "java", "104938", "cantimplora", "393038835"); 
		Collections.sort(llistaNumerosParaules, (s1, s2) -> s1.length() - s2.length());
		llistaNumerosParaules.forEach(System.out::println);
		
		
		llistaNumerosParaules.sort(Comparator.comparing(String::length));
		llistaNumerosParaules.forEach(System.out::println);
	}

}
