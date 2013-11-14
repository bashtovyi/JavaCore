package edu.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;

import edu.oop.Female;
import edu.oop.Male;

public class ListExample {

	public static void main(String[] args) {
		Object object = 1;

		// Нетипизированный массив.
		Object[] objectsArray = new Object[5];
		objectsArray[0] = "1";
		objectsArray[1] = new Male();
		objectsArray[2] = 32;
		objectsArray[3] = new Female();

		// Динамический нетипизированный массив - ArrayList (старая версия)
		ArrayList list = new ArrayList();
		list.add("Молоко");
		list.add("Хлеб");
		list.add("Вино");
		list.add("Мясо");
		list.add(0, "Сметана");
		// System.out.println(list);
		// System.out.println(list.get(3));

		list.remove(0);
		list.remove(0);
		list.remove(0);
		// System.out.println(list);
		// System.out.println(list.size());

		// Динамический массив
		// <>- параметризация нужна для указания типа данных которые будут
		// хранится.
		List<String> stringsList = new ArrayList<>();
		stringsList.add("Молоко");
		stringsList.add("Вино");
		stringsList.add("Мясо");
		stringsList.add(0, "Сметана");
		stringsList.add("Молоко");
		stringsList.add("Хлеб");
		stringsList.add("Вино");
		stringsList.add("Мясо");
		stringsList.add(0, "Сметана");
		stringsList.add("Молоко");
		stringsList.add("Хлеб");
		stringsList.add("Вино");
		stringsList.add("Мясо");
		stringsList.add(0, "Сметана");

		stringsList.remove(0);
		stringsList.remove(0);
		stringsList.remove(0);
		stringsList.remove(0);
		stringsList.remove(0);
		stringsList.remove(0);
		stringsList.remove(0);
		stringsList.remove(0);
		stringsList.remove(0);
		stringsList.remove(0);
		stringsList.remove(0);
		stringsList.remove(0);
		stringsList.remove(0);

		List<String> stringsList2 = new LinkedList<>();
		stringsList2.add("Молоко");
		stringsList2.add("Вино");
		stringsList2.add("Мясо");
		stringsList2.add(0, "Сметана");
		stringsList2.add("Молоко");
		stringsList2.add("Хлеб");
		stringsList2.add("Вино");
		stringsList2.add("Мясо");
		stringsList2.add(0, "Сметана");
		stringsList2.add("Молоко");
		stringsList2.add("Хлеб");
		stringsList2.add("Вино");
		stringsList2.add("Мясо");
		stringsList2.add(0, "Сметана");
		
		// Comparator Для сортировки
		Collections.sort(stringsList2, Collections.reverseOrder());
 		
		for (int i = 0; i < stringsList2.size(); i++) {
			System.out.println(stringsList2.get(i));
		}
		System.out.println();
		for (String each : stringsList2) {
			System.out.println(each);
		}

		stringsList2.remove(0);
		stringsList2.remove(0);
		stringsList2.remove(0);
		stringsList2.remove(0);
		stringsList2.remove(0);
		stringsList2.remove(0);
		stringsList2.remove(0);
		stringsList2.remove(0);
		stringsList2.remove(0);
		stringsList2.remove(0);
		stringsList2.remove(0);
		stringsList2.remove(0);
		stringsList2.remove(0);
		

		printListSize(stringsList);
		printListSize(stringsList2);
	}

	public static void printListSize(List<String> list) {
		System.out.println(list.size());
	}

}
