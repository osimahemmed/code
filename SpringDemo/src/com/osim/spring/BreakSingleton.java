package com.osim.spring;

import java.lang.reflect.Constructor;

public class BreakSingleton extends Singleton {

	public static void main(String[] args) throws Exception {
        Singleton singleton = Singleton.getInstance();
        Constructor constructor = singleton.getClass().getDeclaredConstructor(new Class[0]);
        constructor.setAccessible(true);
        Singleton singleton2 = (Singleton) constructor.newInstance();
        if (singleton == singleton2) {
            System.out.println("Two objects are same");
        } else {
            System.out.println("Two objects are not same");
        }
        singleton.setName("o112");
        singleton2.setName("45rth");
        System.out.println(singleton.getName());
        System.out.println(singleton2.getName());
    }

}
