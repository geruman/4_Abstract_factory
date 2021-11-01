package com.geruman.chocolates;

public abstract class ChocolateriaAbstracta {
	public static ChocolateriaAbstracta getFactory(Chocolaterias nombreDelVendedor) {
		switch(nombreDelVendedor) {
		case NESTLE:
			return ChocolateriaNestle.getInstance();
		case ROCKLETS:
			return ChocolateriaRocklets.getInstance();
		default:
			return null;
		}
	}
	public abstract Chocolate crearChocolatin();
}
