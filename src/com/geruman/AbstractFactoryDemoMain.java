package com.geruman;

import com.geruman.chocolates.Chocolate;
import com.geruman.chocolates.ChocolateriaAbstracta;
import com.geruman.chocolates.Chocolaterias;

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
