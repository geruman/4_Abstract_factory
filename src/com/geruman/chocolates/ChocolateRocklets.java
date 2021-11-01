package com.geruman.chocolates;

public class ChocolateRocklets implements Chocolate {

	@Override
	public String agarrar() {
		return "no se derrite en tu mano";
	}

	@Override
	public String degustar() {
		return "crunchy crunchy chocolato!";
	}

}
