package com.design.builder;

public class TestBuilderpattern {

	public static void main(String[] args) {
		
		
		Computer comp = new Computer.ComputerBuilder(
				"500 GB", "2 GB").setBluetoothEnabled(true)
				.build();
				

	}

}
