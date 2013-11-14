package edu.primitive;

public class ArraysExample {

	public static void main(String[] args) {
		// Массив - переменная которая имеет множевство значений.
		// Массив- множевство значений доступных под одним именем.
		int[] array = {};// статическая иннициализация массива
		System.out.println(array.length);
		int[] array2 = { 1, 2, 3, 4, 5 };
		array2[0] = -1;
		System.out.println(array2[0]);
		System.out.println(array2[1]);
		System.out.println(array2[2]);
		System.out.println(array2[3]);
		System.out.println(array2[4]);

		// обьявление и иннициализация переменной счетчика
		// условие работы цикла
		// приращение цикла
		for (int i = 0; i < array2.length; i++) {
			System.out.println(array2[i]);
		}
		int sum = 0;

		for (int i = 0; i < array2.length; i++) {
			sum = sum + array2[i];
		}
		System.out.println(sum);

		int[] dynamicArray = new int[10];
		dynamicArray[0] = -1;
		System.out.println(dynamicArray[0]);
	}

}
