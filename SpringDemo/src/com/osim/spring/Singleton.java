package com.osim.spring;

public class Singleton {
	
	@SuppressWarnings("unused")
	private static final long serialVersionUID = 4720735313563383966L;
	
	private static volatile Singleton instance = null;
	//private static volatile Singleton instance = new Singleton();
	private Singleton() {
		if (instance != null) {
	           throw new IllegalStateException("Singleton instance already created.");
		}
	}
	
	public static Singleton getInstance() {
		if(instance == null) {
			synchronized (Singleton.class) {
				if(instance == null) {
					instance = new Singleton();
				}
			}
		}
		
		return instance;
	}
	
	private Object readResolve() {
		return instance;
	}
	
	public Object clone() throws CloneNotSupportedException {
		return new CloneNotSupportedException();
	}
	
	/*public Object clone() throws CloneNotSupportedException {
		return new CloneNotSupportedException();
	}*/
	
	private String name;
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		//System.out.println(name);
		return this.name;
	}
}
