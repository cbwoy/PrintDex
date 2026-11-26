package io.github.cbwoy.printdex;

public class Menu {

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

	public static void abrirMenuPrincipal() {
		int option = 0;
		do {
			mostrarMenu("PRINTDEX", MENU_PRINTDEX);
			option = Entrada.leerOpcion();
			ejecutaMenu(option);

		} while (option != 0);
	}

	private static void ejecutaMenu(int option) {
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

	private static void mostrarMenu(String titulo, String[] opciones) {
		System.out.println(titulo);
		for (int i = 1; i < opciones.length; i++) {
			System.out.println(i + "." + opciones[i]);

		}
		System.out.println("0." + opciones[0]);
		System.out.print("Elige tu opción:");
	}

	private static void abrirSubmenuPedidos() {
		int option = 0;
		do {
			mostrarMenu("PEDIDOS", MENU_PEDIDO);
			option = Entrada.leerOpcion();
			ejecutaSubmenuPedidos(option);
		} while (option != 0);
	}

	private static void ejecutaSubmenuPedidos(int option) {

		switch (option) {
		case 1 -> System.out.println("Proximamente");
		case 2 -> System.out.println("Proximamente");
		case 3 -> System.out.println("Proximamente");
		case 0 -> System.out.println("Vuelves al menu anterior");
		default -> System.out.println("Has elegido una opción incorrecta");

		}
	}

	private static void abrirSubmenuImpresiones() {
		int option = 0;
		do {
			mostrarMenu("IMPRESIONES", MENU_IMPRESION);
			option = Entrada.leerOpcion();
			ejecutaSubmenuImpresiones(option);
		} while (option != 0);
	}

	private static void ejecutaSubmenuImpresiones(int option) {
		switch (option) {
		case 1 -> System.out.println("Proximamente");
		case 2 -> System.out.println("Proximamente");
		case 3 -> System.out.println("Proximamente");
		case 0 -> System.out.println("Vuelves al menu anterior");
		default -> System.out.println("Has elegido una opción incorrecta");
		}
	}

	private static void abrirSubmenuRegistro() {
		int option = 0;
		do {
			mostrarMenu("REGISTRO", MENU_REGISTRO);
			option = Entrada.leerOpcion();
			ejecutaSubmenuRegistro(option);
		} while (option != 0);

	}

	private static void ejecutaSubmenuRegistro(int option) {
		switch (option) {
		case 1 -> abrirSubmenuClientes();
		case 2 -> abrirSubmenuDisennos();
		case 0 -> System.out.println("Vuelves al menu anterior");
		default -> System.out.println("Has elegido una opción incorrecta");
		}
	}

	private static void abrirSubmenuClientes() {
		int option = 0;
		do {
			mostrarMenu("CLIENTES", MENU_CLIENTE);
			option = Entrada.leerOpcion();
			ejecutaSubmenuClientes(option);
		} while (option != 0);
	}

	private static void ejecutaSubmenuClientes(int option) {
		switch (option) {
		case 1 -> System.out.println("Proximamente");
		case 2 -> System.out.println("Proximamente");
		case 3 -> System.out.println("Proximamente");
		case 0 -> System.out.println("Vuelves al menu anterior");
		default -> System.out.println("Has elegido una opción incorrecta");
		}
	}

	private static void abrirSubmenuDisennos() {
		int option = 0;
		do {
			mostrarMenu("DISEÑOS", MENU_DISENNO);
			option = Entrada.leerOpcion();
			ejecutaSubmenuDisennos(option);
		} while (option != 0);
	}

	private static void ejecutaSubmenuDisennos(int option) {
		switch (option) {
		case 1 -> System.out.println("Proximamente");
		case 2 -> System.out.println("Proximamente");
		case 3 -> System.out.println("Proximamente");
		case 0 -> System.out.println("Vuelves al menu anterior");
		default -> System.out.println("Has elegido una opción incorrecta");
		}
	}

	private static void abrirSubmenuInventario() {
		int option = 0;
		do {
			mostrarMenu("INVENTARIO", MENU_INVENTARIO);
			option = Entrada.leerOpcion();
			ejecutaSubmenuInventario(option);
		} while (option != 0);
	}

	private static void ejecutaSubmenuInventario(int option) {
		switch (option) {
		case 1 -> abrirSubmenuFilamentos();
		case 2 -> abrirSubmenuMaterialesExtra();
		case 0 -> System.out.println("Vuelves al menu anterior");
		default -> System.out.println("Has elegido una opción incorrecta");
		}

	}

	private static void abrirSubmenuFilamentos() {
		int option = 0;
		do {
			mostrarMenu("FILAMENTOS", MENU_FILAMENTO);
			option = Entrada.leerOpcion();
			ejecutaSubmenuFilamentos(option);

		} while (option != 0);

	}

	private static void ejecutaSubmenuFilamentos(int option) {
		switch (option) {
		case 1 -> System.out.println("Proximamente");
		case 2 -> System.out.println("Proximamente");
		case 3 -> System.out.println("Proximamente");
		case 0 -> System.out.println("Vuelves al menu anterior");
		default -> System.out.println("Has elegido una opción incorrecta");
		}

	}

	private static void abrirSubmenuMaterialesExtra() {
		int option = 0;
		do {
			mostrarMenu("MATERIALES EXTRA", MENU_MATERIAL_EXTRA);
			option = Entrada.leerOpcion();
			ejecutaSubmenuMaterialesExtra(option);

		} while (option != 0);

	}

	private static void ejecutaSubmenuMaterialesExtra(int option) {
		switch (option) {
		case 1 -> System.out.println("Proximamente");
		case 2 -> System.out.println("Proximamente");
		case 3 -> System.out.println("Proximamente");
		case 0 -> System.out.println("Vuelves al menu anterior");
		default -> System.out.println("Has elegido una opción incorrecta");
		}
	}

}
