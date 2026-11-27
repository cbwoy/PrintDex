package io.github.cbwoy.printdex;

public class Menu {
	private String titulo;
	private String[] opciones;
	
	public Menu(String titulo, String[] opciones) {
		
		this.titulo = titulo;
		this.opciones = opciones;
	}
	
	public void mostrar() {
		System.out.println(titulo);
		for (int i = 1;i < opciones.length;i++) {
			System.out.println(i+"."+opciones[i]);
		}
		System.out.println("0."+opciones[0]);
		System.out.print("Elige tu opción: ");
		
	}
	
	
}
