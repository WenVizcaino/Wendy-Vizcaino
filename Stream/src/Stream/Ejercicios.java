package Stream;

import java.util.List;

public class Ejercicios {

	public static void main(String[] args) {
		int num = 10;
		int suma = 0;

		for (int i = 0; i < num; i++) {
			suma += i;
			System.out.println(i + " ");

		}
		System.out.println("La suma " + suma);
		System.out.println();

		int[] array = { 27, 78, 5, 36, 8 };

		for (int i = 0; i < array.length; i++) {

			System.out.println(array[i] + " ");

		}
		System.out.println();

		for (int x : array) {
			System.out.println(x + " ");
		}
		System.out.println();

		var frutas = List.of("Pera", "Mango", "Manzana", "Fresa");

		for (String i : frutas) {
			System.out.println(i + "");
		}
	}

}
