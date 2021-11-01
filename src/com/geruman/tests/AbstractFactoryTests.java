package com.geruman.tests;

import org.junit.jupiter.api.Test;

import com.geruman.chocolates.Chocolate;
import com.geruman.chocolates.ChocolateriaAbstracta;
import com.geruman.chocolates.Chocolaterias;

class AbstractFactoryTests {

	@Test
	void abstractFactoryTest() {
		ChocolateriaAbstracta abstractFactory = ChocolateriaAbstracta.getFactory(Chocolaterias.NESTLE);
		Chocolate chocolate = abstractFactory.crearChocolatin();
		assert "se derrite en tu mano".equals(chocolate.agarrar());
		assert "mmmm, suave...".equals(chocolate.degustar());
		abstractFactory = ChocolateriaAbstracta.getFactory(Chocolaterias.ROCKLETS);
		chocolate = abstractFactory.crearChocolatin();
		assert "no se derrite en tu mano".equals(chocolate.agarrar());
		assert "crunchy crunchy chocolato!".equals(chocolate.degustar());
		
	}

}
