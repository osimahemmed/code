package com.sape.common.thread;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		for(int i=0;i<2;i++){

			System.out.println("ThreadName="+Thread.currentThread().getName()
					+" > "+
			AtomicIntegerCustomExample.sharedAtomicIntegerCustom.compareAndSet(0,20));

		}
	}
}
