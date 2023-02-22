package n1exercici3;

import java.util.Arrays;
import java.util.List;

public class App {
	public static void main(String[]args) {
		
		List<String> mesos = Arrays.asList("Gener", "Febrer", "Març", "Abril", "Maig", "Juny", "Juliol", "Agost", "Setembre", "Octubre", "Novembre", "Decembre");
		
		mesos.forEach(mes -> System.out.println(mes));
	}

}
