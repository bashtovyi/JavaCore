package edu.oop;

public class Ghost {

	public static void main(String[] args) {
		// Любой обьект можно преобразовать к родительскому типу данных

		Male firstMale = new Male();
		firstMale.setFirstName("Олег");
		firstMale.setAge(2);
		firstMale.setSureName("Анафьевич");
		firstMale.setLastName("Окда");

		// Преобразование снизу-вверх
		// Не типизированная переменная.
		final Object  mask = firstMale;
		System.out.println(mask);
	
		// Преобразуется не обьект, а тип данных обьекта. Как правило происходить уменьшение кол-ва действий.
		
		// При оброзовании обьектного типа данных сверху- вниз нужно указывать тип данных к которому преобразовывают. 
		Male unmasked = (Male) mask;
		System.out.println(unmasked);
		
		// Преобразование дает возможность создавать не типизированные обьекты и методы
		universalMethod(new Female("Olja",  20));
		universalMethod(unmasked.getLastName());
		forHumans(unmasked);
	
		
		
	}
	
	// Не типизированный метод
	private static void universalMethod(Object object) {
		System.out.println(object);
	}
	
	// Универсальный метод для Human  Male Female
	private static void forHumans(AbstractHuman human) {
		System.out.println(human.getSureName());
	
	}

}
