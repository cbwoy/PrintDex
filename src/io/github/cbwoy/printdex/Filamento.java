package io.github.cbwoy.printdex;

public class Filamento {
	private static int siguienteId = 1;

	private int idFilamento;
	private String material;
	private String color;
	private String marca;
	private double precioPorKilogramo;
	private double gramosDisponibles;

	public Filamento(String material, String color, String marca, double precioPorKilogramo, double gramosDisponibles) {

		this.idFilamento = siguienteId;
		siguienteId++;
		this.material = material;
		this.color = color;
		this.marca = marca;
		this.precioPorKilogramo = precioPorKilogramo;
		this.gramosDisponibles = gramosDisponibles;
	}

	public int getIdFilamento() {
		return idFilamento;
	}

	public void setIdFilamento(int idFilamento) {
		this.idFilamento = idFilamento;
	}

	public boolean reponer(double gramosRepuestos) {
		if (gramosRepuestos <= 0) {

			return false;
		}
		gramosDisponibles += gramosRepuestos;

		return true;

	}

	public String getMaterial() {
		return material;
	}

	public String getColor() {
		return color;
	}

	public String getMarca() {
		return marca;
	}

	public double getPrecioPorKilogramo() {
		return precioPorKilogramo;
	}

	public double getGramosDisponibles() {
		return gramosDisponibles;
	}

	public boolean consumir(double gramosConsumidos) {
		if (gramosConsumidos > gramosDisponibles || gramosConsumidos <= 0) {
			return false;
		}
		gramosDisponibles -= gramosConsumidos;
		return true;
	}

	@Override
	public String toString() {
		return String.format("#%d · %s %s · %.0f g · %s · %.2f €/kg", idFilamento, material, color, gramosDisponibles,
				marca, precioPorKilogramo);
	}

}
