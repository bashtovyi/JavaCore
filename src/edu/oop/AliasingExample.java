package edu.oop;

public class AliasingExample {

	public static void main(String[] args) throws CloneNotSupportedException {
		// Aliasing - это ссылочная природа обьекта.
		// Примитывные типа передаются по-значению.
		// Обьектные типы - по-ссылке.

		Female firstFemale = new Female();
		firstFemale.setFirstName("Оля");
		firstFemale.setLastName("Олегович");
		firstFemale.setSureName("Олеговна");
		firstFemale.setAge(15);
		firstFemale.setPregnant(false);
		
		Male firstMale = new Male();
		firstMale.setSpause(firstFemale);
		firstMale.setAge(2);
		firstMale.setSureName("Анафьевич");
		firstMale.setLastName("Окда");

		//Male secondMale = firstMale;
		 //secondMale.setAge(10);
		//
		// System.out.println(firstMale);

		// Получаем 2 независимых одинаковых обьекта
		Male copyMale = new Male(firstMale);

		// Вася без спросу испортил обьект.
		makeMale(copyMale);

		// copyMale.setAge(10);

		System.out.println(firstMale);
		System.out.println(copyMale);

		// метод clone();
		Male swapMale = firstMale.clone();
		swapMale.setFirstName("man");
		swapMale.getSpause().setAge(20);
		System.out.println(swapMale.getSpause().getAge());
		System.out.println(firstMale.getSpause().getAge());
		System.out.println(swapMale);
		System.out.println(firstMale);
		//firstMale.flyInTheSky();
		
		// Mutable - изменяемый. Unmutable - неизменяеммый.
	}

	private static void makeMale(Male m) {
		m.setAge(11);
	}

}
