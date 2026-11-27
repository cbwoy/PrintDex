package io.github.cbwoy.printdex;

public class Navegacion {

	private static final String[] OPCIONES_PRINTDEX = { "Salir", "Calculadora", "Pedidos", "Impresiones", "Inventario",
			"Registro", "Estadísticas", "Configuración" };
	private static final Menu MENU_PRINTDEX = new Menu("PRINTDEX", OPCIONES_PRINTDEX);
	private static final String[] OPCIONES_PEDIDO = { "Volver al menú anterior", "Registrar pedido", "Pedidos en curso",
			"Historial de pedidos" };
	private static final Menu MENU_PEDIDO = new Menu("PEDIDOS", OPCIONES_PEDIDO);
	private static final String[] OPCIONES_IMPRESION = { "Volver al menú anterior", "Marcar como terminada",
			"Registrar impresión fallida", "Ver impresiones de un pedido" };
	private static final Menu MENU_IMPRESION = new Menu("IMPRESIONES", OPCIONES_IMPRESION);
	private static final String[] OPCIONES_INVENTARIO = { "Volver al menú anterior", "Filamentos", "Materiales extra" };
	private static final Menu MENU_INVENTARIO = new Menu("INVENTARIO", OPCIONES_INVENTARIO);
	private static final String[] OPCIONES_FILAMENTO = { "Volver al menú anterior", "Ver filamento", "Añadir filamento",
			"Reponer filamento" };
	private static final Menu MENU_FILAMENTO = new Menu("FILAMENTOS", OPCIONES_FILAMENTO);
	private static final String[] OPCIONES_MATERIAL_EXTRA = { "Volver al menú anterior", "Ver material",
			"Añadir material", "Reponer material" };
	private static final Menu MENU_MATERIAL_EXTRA = new Menu("MATERIALES EXTRA", OPCIONES_MATERIAL_EXTRA);
	private static final String[] OPCIONES_REGISTRO = { "Volver al menú anterior", "Clientes", "Diseños" };
	private static final Menu MENU_REGISTRO = new Menu("REGISTRO", OPCIONES_REGISTRO);
	private static final String[] OPCIONES_CLIENTE = { "Volver al menú anterior", "Ver cliente", "Añadir cliente",
			"Editar cliente" };
	private static final Menu MENU_CLIENTE = new Menu("CLIENTES", OPCIONES_CLIENTE);
	private static final String[] OPCIONES_DISENNO = { "Volver al menú anterior", "Ver diseño", "Añadir diseño",
			"Editar diseño" };
	private static final Menu MENU_DISENNO = new Menu("DISEÑOS", OPCIONES_DISENNO);

	public static void abrirMenuPrincipal() {
		int option = 0;
		do {
			System.out.println();
			MENU_PRINTDEX.mostrar();
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

	private static void abrirSubmenuPedidos() {
		int option = 0;
		do {
			MENU_PEDIDO.mostrar();
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
			MENU_IMPRESION.mostrar();
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
			MENU_REGISTRO.mostrar();
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
			MENU_CLIENTE.mostrar();
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
			MENU_DISENNO.mostrar();
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
			MENU_INVENTARIO.mostrar();
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
			MENU_FILAMENTO.mostrar();
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
			MENU_MATERIAL_EXTRA.mostrar();
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
