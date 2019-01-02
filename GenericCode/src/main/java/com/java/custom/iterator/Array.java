package com.java.custom.iterator;

import java.security.NoSuchAlgorithmException;
import java.util.Iterator;

public class Array<T> implements CustomIterable<T> {
	
	T[] values;
	
	public Array(T[] values) {
		this.values = values;
	}
	
	class ArrayIterator implements CustomIterator<T> {
		
		int current = values.length-1;

		@Override
		public boolean hasPrevious() {
			if(current >= 0 ) {
				return true;
			} else {
				return false;
			}
		}

		@Override
		public T next() {
			if(!hasPrevious()) {
				try {
					throw new NoSuchAlgorithmException();
				} catch (NoSuchAlgorithmException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			return values[current--];
		}
		
	}
	
	public T get(int index) {
		return values[index];
	}
	
	@Override
	public CustomIterator<T> iterator() {
		return new ArrayIterator();
	}

	public static void main(String[] args) {
        // create an array of strings
        String[] strings = new String[]{"Hello", "World", "Osim", "Ahemmed"};

        // create a new array to hold these strings
        Array<String> array = new Array<String>(strings);

        // get and print the first values (prints "Hello")
        //System.out.println(array.get(0));

        // set the second value
        //array.set(1, "Javaland!");

        // iterate over the array, printing "Hello\nJavaland!"
       /* for (String s : array) {
            System.out.println(s);
        }*/
    }
	
}
