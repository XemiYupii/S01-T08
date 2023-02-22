package n3exercici1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class App {

	public static void main(String[] args) {
		
		List<Alumne>alumnes = new ArrayList<>(Arrays.asList(
				new Alumne ("Gemma", 36, "Java", 7.8),
				new Alumne ("Jordi", 6, "Java", 9f),
				new Alumne ("Júlia", 3, "Java", 6.3),
				new Alumne ("Maria", 25, "Java", 4.3),
				new Alumne ("Anna", 17, "Java", 2.75),
				new Alumne ("Sandra", 52, "PHP", 6f),
				new Alumne ("Lídia", 16, "PHP", 10f),
				new Alumne ("Santi", 23, "PHP", 5.5),
				new Alumne ("Cristina", 41, "PHP", 7.5),
				new Alumne ("Adrià", 60, "PHP", 3.75)
		));
		
		mostrarNomEdat(alumnes);
		mostrarAlumnesComencenA(alumnes);
		mostrarAlumnesAprobats(alumnes);
		mostrarAlumnesAprobatsNoPhp(alumnes);
		mostrarAlumnesJavaMajorsEdat(alumnes);
	}
	public static void mostrarNomEdat (List<Alumne>persones) {
		persones.forEach(alumne -> System.out.println(alumne.getNom()+"  "+alumne.getEdat()));
	}
	public static void  mostrarAlumnesComencenA (List<Alumne>persones) {
		List<Alumne>nomA = persones.stream().filter(alumne -> alumne.getNom().toLowerCase().startsWith("a")).collect(Collectors.toList());
		nomA.forEach(System.out::println);
	}
	public static void mostrarAlumnesAprobats (List<Alumne>persones) {
		persones.stream().filter(alumne ->alumne.getNota() >= 5).forEach(System.out::println);
	}
	public static void mostrarAlumnesAprobatsNoPhp (List<Alumne>persones) {
		persones.stream().filter(alumne -> alumne.getNota() >= 5 && !alumne.getCurs().equalsIgnoreCase("PHP")).forEach(System.out::println);
	}
	public static void mostrarAlumnesJavaMajorsEdat (List<Alumne>persones) {
		persones.stream().filter(alumne ->alumne.getEdat() >= 18 && alumne.getCurs().equalsIgnoreCase("Java")).forEach(System.out::println);
	}

}
