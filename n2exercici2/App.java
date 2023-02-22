package n2exercici2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class App {

	public static void main(String[] args) {
		
		List<Integer>numeros = Arrays.asList(3,55,44);
		System.out.println(crearStringDeLlista(numeros));
	}

	public static String crearStringDeLlista (List<Integer>nums) {
		return nums.stream().map(num -> (num % 2 == 0 ? "e" : "o")+ num).collect(Collectors.joining(","));
	}

}
