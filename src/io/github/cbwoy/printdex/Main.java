package io.github.cbwoy.printdex;

import java.util.Scanner;

public class Main {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int option = 0;
		do {
			mostrarMenu();
			System.out.print("Elige tu opción:");
			leerOpcion();
			ejecutaMenu(option);
		} while (option != 0);
		
	}

	public static void mostrarMenu() {
		System.out.println("PrintDex menu:\n" + "1.Calculadora\n" + "2.Pedidos\n" + "3.Impresiones\n" + "4.Inventario\n"
				+ "5.Registro\n" + "6.Estadísticas\n" + "7.Configuración\n" + "0.Salir");
	}

	public static void ejecutaMenu(int option) {
		switch (option) {
		case 1 -> System.out.println("Proximamente calculadora");
		case 2 -> System.out.println("Proximamente pedidos");
		case 3 -> System.out.println("Proximamente impresiones");
		case 4 -> System.out.println("Proximamente inventario");
		case 5 -> System.out.println("Proximamente registro");
		case 6 -> System.out.println("Proximamente estadísticas");
		case 7 -> System.out.println("Proximamente configuración");
		case 0 -> System.out.println("Muchas gracias por venir");
		default -> System.out.println("Has elegido una opción invalida");
		
		}
	}
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
	
	
}
