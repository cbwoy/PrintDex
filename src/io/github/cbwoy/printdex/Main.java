package io.github.cbwoy.printdex;

import java.util.Scanner;

public class Main {
	private static Scanner sc = new Scanner(System.in);
	private static final String[] MENU_PRINTDEX = { "Salir", "Calculadora", "Pedidos", "Impresiones", "Inventario",
			"Registro", "Estadísticas", "Configuración" };
	private static final String[] MENU_PEDIDO = { "Volver al menú anterior", "Registrar pedido", "Pedidos en curso",
			"Historial de pedidos" };
	private static final String[] MENU_IMPRESION = { "Volver al menú anterior", "Marcar como terminada",
			"Registrar impresión fallida", "Ver impresiones de un pedido" };
	private static final String[] MENU_INVENTARIO = { "Volver al menú anterior", "Filamentos", "Materiales extra" };
	private static final String[] MENU_FILAMENTO = { "Volver al menú anterior", "Ver filamento", "Añadir filamento",
			"Reponer filamento" };
	private static final String[] MENU_MATERIAL_EXTRA = { "Volver al menú anterior", "Ver material", "Añadir material",
			"Reponer material" };
	private static final String[] MENU_REGISTRO = { "Volver al menú anterior", "Clientes", "Diseños" };
	private static final String[] MENU_CLIENTE = { "Volver al menú anterior", "Ver cliente", "Añadir cliente",
			"Editar cliente" };
	private static final String[] MENU_DISENNO = { "Volver al menú anterior", "Ver diseño", "Añadir diseño",
			"Editar diseño" };

	public static void main(String[] args) {
		int option = 0;
		do {
			mostrarMenu("PRINTDEX", MENU_PRINTDEX);
			option = leerOpcion();
			ejecutaMenu(option);
		} while (option != 0);

	}

	public static void ejecutaMenu(int option) {
		switch (option) {
		case 1 -> System.out.println("Proximamente calculadora");
		case 2 -> abrirSubmenuPedidos();
		case 3 -> abrirSubmenuImpresiones();
		case 4 -> abrirSubmenuInventario();
		case 5 -> abrirSubmenuRegistro();
		case 6 -> System.out.println("Proximamente estadísticas");
		case 7 -> System.out.println("Proximamente configuración");
		case 0 -> System.out.println("Muchas gracias por venir");
		default -> System.out.println("Has elegido una opción invalida");

		}
	}

	public static void abrirSubmenuPedidos() {
		int option = 0;
		do {
			mostrarMenu("PEDIDOS", MENU_PEDIDO);
			option = leerOpcion();
			ejecutaSubmenuPedidos(option);
		} while (option != 0);
	}

	public static void ejecutaSubmenuPedidos(int option) {

		switch (option) {
		case 1 -> System.out.println("Proximamente");
		case 2 -> System.out.println("Proximamente");
		case 3 -> System.out.println("Proximamente");
		case 0 -> System.out.println("Vuelves al menu anterior");
		default -> System.out.println("Has elegido una opción incorrecta");

		}
	}

	public static void abrirSubmenuImpresiones() {
		int option = 0;
		do {
			mostrarMenu("IMPRESIONES", MENU_IMPRESION);
			option = leerOpcion();
			ejecutaSubmenuImpresiones(option);
		} while (option != 0);
	}

	public static void ejecutaSubmenuImpresiones(int option) {
		switch (option) {
		case 1 -> System.out.println("Proximamente");
		case 2 -> System.out.println("Proximamente");
		case 3 -> System.out.println("Proximamente");
		case 0 -> System.out.println("Vuelves al menu anterior");
		default -> System.out.println("Has elegido una opción incorrecta");
		}
	}

	public static void abrirSubmenuRegistro() {
		int option = 0;
		do {
			mostrarMenu("REGISTRO", MENU_REGISTRO);
			option = leerOpcion();
			ejecutaSubmenuRegistro(option);
		} while (option != 0);

	}

	public static void ejecutaSubmenuRegistro(int option) {
		switch (option) {
		case 1 -> System.out.println("Proximamente");
		case 2 -> System.out.println("Proximamente");
		case 0 -> System.out.println("Vuelves al menu anterior");
		default -> System.out.println("Has elegido una opción incorrecta");
		}
	}

	public static void abrirSubmenuInventario() {
		int option = 0;
		do {
			mostrarMenu("INVENTARIO", MENU_INVENTARIO);
			option = leerOpcion();
			ejecutaSubmenuInventario(option);
		} while (option != 0);
	}

	public static void ejecutaSubmenuInventario(int option) {
		switch (option) {
		case 1 -> System.out.println("Proximamente");
		case 2 -> System.out.println("Proximamente");
		case 0 -> System.out.println("Vuelves al menu anterior");
		default -> System.out.println("Has elegido una opción incorrecta");
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

	public static void mostrarMenu(String titulo, String[] opciones) {
		System.out.println(titulo);
		for (int i = 1; i < opciones.length; i++) {
			System.out.println(i + "." + opciones[i]);

		}
		System.out.println("0." + opciones[0]);
		System.out.print("Elige tu opción:");
	}

}
