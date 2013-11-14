package edu.oop;

public class Autoboxing {

	public static void main(String[] args) {
		Object object = 1;
		
		// Оберточные классы
		// Byte, Short, Integer, Long, Float, Double, Character, Boolean

		// java 1.4
		// Boxing
		System.out.println((Integer) object < 2);
		Integer integer = new Integer(6);
		Object object2 =  new Integer(2);
		System.out.println((Integer) object2 < -1);
		// Unboxing
		System.out.println(integer.intValue() > 5);
		
		// 1.5 +
		// autoboxing
		integer = 6;
		System.out.println(integer  > 5);
	}

}
