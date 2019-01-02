package com.sape.generic.program;

public class PrintSequenceMain {

	public static void main(final String[] args) {
		
		final Thread t1 = new Thread(new PrintSequence(0, "T1", "One"));
		final Thread t2 = new Thread(new PrintSequence(1, "T2", "Two"));
		final Thread t3 = new Thread(new PrintSequence(2, "T3", "Three"));
		
		t1.start();
		t2.start();
		t3.start();

	}

}
