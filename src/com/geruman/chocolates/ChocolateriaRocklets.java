package com.geruman.chocolates;

public class ChocolateriaRocklets extends ChocolateriaAbstracta {
	private static ChocolateriaRocklets instance;
	private ChocolateriaRocklets() {

	}
	public static ChocolateriaRocklets getInstance() {
		if(instance == null) {
			instance = new ChocolateriaRocklets();
		}
		return instance;
	}
	@Override
	public Chocolate crearChocolatin() {
		return new ChocolateRocklets();
	}
}
