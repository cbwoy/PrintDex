package io.github.cbwoy.printdex;

public class Disenno {
	private static int siguienteId = 1;

	private int idDisenno;
	private String nombre;
	private Licencia licencia;

	public Disenno(String nombre, Licencia licencia) {

		idDisenno = siguienteId;
		siguienteId++;
		this.nombre = nombre;
		this.licencia = licencia;
	}

	@Override
	public String toString() {
		return String.format("#%3d · %-20s · %-12s", idDisenno, nombre, licencia);
	}

	public int getIdDisenno() {
		return idDisenno;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Licencia getLicencia() {
		return licencia;
	}

	public void setLicencia(Licencia licencia) {
		this.licencia = licencia;
	}

}
