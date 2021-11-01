package com.geruman.chocolates;

public class ChocolateriaNestle extends ChocolateriaAbstracta {
	private static ChocolateriaNestle instance;
	private ChocolateriaNestle() {
		
	}
	public static ChocolateriaNestle getInstance() {
		if(instance==null) {
			instance = new ChocolateriaNestle();
		}
		return instance;
	}
	@Override
	public Chocolate crearChocolatin() {
		return new ChocolateNestle();
	}
	
}
