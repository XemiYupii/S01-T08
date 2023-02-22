package n2exercici1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class App {

	public static void main(String[] args) {
		
		List <String>noms = Arrays.asList("Gemma", "Ana", "Jordi", "Julia", "Aina", "Alba", "Pep", "Aura", "Ara");
		crearLlistaNoms3LletresA(noms).forEach(System.out::println);
	}
	
	public static List<String> crearLlistaNoms3LletresA ( List<String>nomPropis){
		List<String>nomsPropis = nomPropis.stream().filter(nom -> nom.charAt(0) == 'A' && nom.length() == 3).collect(Collectors.toList());
		return nomsPropis;
	}

}
