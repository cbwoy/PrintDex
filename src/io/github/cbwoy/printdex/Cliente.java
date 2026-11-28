package io.github.cbwoy.printdex;

public class Cliente {
	private static int siguienteId = 1;

	private int idCliente;
	private String nombre;
	private String etiqueta;
	private TipoCliente tipo;

	public Cliente(String nombre,String etiqueta, TipoCliente tipo) {
		this.idCliente = siguienteId;
		siguienteId++;
		this.nombre = nombre;
		this.etiqueta=etiqueta;
		this.tipo = tipo;
	}

	public Cliente(String nombre, TipoCliente tipo) {
	    this(nombre, null, tipo);
	    
	}
	public String getNombre() {
		
		return nombre;
	}
	public String getEtiqueta() {
		return etiqueta;
	}
	public int getId() {
		return idCliente;
	}

	public TipoCliente getTipo() {
		return tipo;
	}

	@Override
	public String toString() {
		if(etiqueta == null) {
			etiqueta="----------";
		}
			return String.format("#%3d · %-20s · %-10s · %s", idCliente, nombre, etiqueta, tipo);
	}

}	
