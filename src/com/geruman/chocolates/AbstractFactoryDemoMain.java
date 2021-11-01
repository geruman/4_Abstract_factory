package com.geruman.chocolates;

public class AbstractFactoryDemoMain {
	public static void main(String[] args) {
		System.out.println(Chocolaterias.NESTLE);
		imprimirChocolate(ChocolateriaAbstracta.getFactory(Chocolaterias.NESTLE));
		System.out.println(Chocolaterias.ROCKLETS);
		imprimirChocolate(ChocolateriaAbstracta.getFactory(Chocolaterias.ROCKLETS));
	}

	private static void imprimirChocolate(ChocolateriaAbstracta factory) {
		Chocolate chocolate = factory.crearChocolatin();
		System.out.println(chocolate.agarrar());
		System.out.println(chocolate.degustar());

	}
}
