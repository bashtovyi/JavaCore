package edu.oop;

public class StaticExample {
	
	// точка входа - entry point
	public static void main(String[] args) {
		for (int i =0; i < args.length; i++) {
			System.out.print(args[i] + " ");
		}
		
		// static  ключевое слово которое указывает  на принаджелность поля к методу или классу.
		//	тоесть, поле класса ,  метод класса.
		// static позволяет вызывать методы или поля без создания обьекта.
		
		// statiс в имени метода.
		Clock.printInformation();
		// Для вызова static метода не нужен обьект. Из static метода нельзя обращатсья к обычным методам.
		// Из обычных методов можно обращаться к static методам  и полям.
		// int intValue = Integer.valueOf("10")
		
		Clock firstClock =  new Clock();
		firstClock.setHours(20);
		firstClock.setMinutes(25);
		
		Clock secondClock = new Clock();
		secondClock.setHours(12);
		secondClock.setMinutes(33);
		
		System.out.println(firstClock);
		System.out.println(secondClock);
	}
	
}
