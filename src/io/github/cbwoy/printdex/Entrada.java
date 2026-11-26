package io.github.cbwoy.printdex;

import java.util.Scanner;

public class Entrada extends Main {
	private static Scanner sc = new Scanner(System.in);

	public static int leerOpcion() {
		while (!sc.hasNextInt()) {
			System.out.println("Error: Por favor, introduce un número válido.");
			sc.nextLine();
			System.out.print("Inténtalo de nuevo: ");
		}

		int option = sc.nextInt();
		sc.nextLine();
		return option;
	}

	public static double leerDecimal() {
		while (!sc.hasNextDouble()) {
			System.out.println(
					"Error: Por favor, introduce los decimales con coma [,] no con un punto [.] si no dará fallo.");
			sc.nextLine();
			System.out.print("Inténtalo de nuevo: ");
		}
		double price = sc.nextDouble();
		sc.nextLine();
		return price;

	}

	public static String leerTexto() {
		String texto = null;
		do {
			 texto = sc.nextLine().trim();
			 if(texto.isEmpty()) {
				 System.out.println("El texto no puede estar vacío. Introduce un texto válido");
			 }
		}while(texto.isEmpty());
		
		return texto;
	}
}
