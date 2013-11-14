package edu.primitive;

public class Primitive {

	public static void main(String[] args) {
		// Примитивные типы данных
		// Целые - byte, short, int, long
		// Плавающие - float, double
		// Символьные - char
		// Логические - boolean

		// Обьявление переменной примитивного типа
		// Тип данных Название
		int i;
		// иннициализация переменной
		i = 1;
		// Тип данных и значение
		int j = 1;

		// -128 - +127
		byte b = 127;
		// -32000 - +32000
		short s = 32000;
		int i1 = 2000000000;
		long l = 400000000000000000L;
		// c Плавающей
		float f = 4.9f;
		double d = 2.9;

		// +, -, /, * , ++ , --, %
		// System.out.println(2147483647 + 1);

		// %
		// System.out.println(8 % 3);

		// Префиксный/постфиксный инкремент /декремент
		i = 0;
		System.out.println(i++);
		// System.out.println(i);
		// i = i + 1;
		// System.out.println(i); //1

		System.out.println(++i);

		// обьявление переменной логического типа
		boolean bool = true;

		// Логические операции

		// Логическое И, AND &&
		// Если 2 операнда выражения истинны тогда выражение истинно.
		// 1 1 = 1
		// 1 0 = 0
		// 0 1 = 0
		// 0 0 = 0

		// Логическое ИЛИ, OR ||
		// Если хотя бы 1 истинно - тогда все выражение истинно
		// 1 1 = 1
		// 1 0 = 1
		// 0 1 = 1
		// 0 0 = 0

		System.out.println();
		System.out.println(true && false);// false
		System.out.println(false && false);// false
		System.out.println(false && true);// false
		System.out.println(true && true);// true

		System.out.println();
		System.out.println(true || true); // true
		System.out.println(true || false);// true
		System.out.println(false || false);// false
		System.out.println(false || true);// true
		System.out.println();
		// Результаты числового сравнения всегда логическое
		System.out.println(1 <= 0);// false
		System.out.println(1 >= 1);// true
		System.out.println(1 == 0);// false
		System.out.println(1 != 0); // true
		System.out.println(1 != 1); // false

		System.out.println("Преобразование примитивных типов");
		int a = 2000000000;
		long b1 = a;

		a = (int) 2147483648L;
		System.out.println("a: " + a);

		System.out.println("Другие системы исчисления");
		// 0 0
		// 1 1
		// 10 2
		// 11 3
		int binary = 0b11;
		System.out.println(binary);
		// 8-я форма
		// 0 0
		// 1 1
		// . .
		// 7 7
		// 10 8
		// 11 9
		int octal = 07;
		int decimal = 7;
		System.out.println(octal);

		// 0 0
		// 1 1
		// . .
		// A 10
		// F 15
		int hexadecimal = 0xF;
		System.out.println(hexadecimal);

		// 12 & 10 = 8
		// 12 001010
		// 10 101011
		// 8 001010
		// >>

		char c = 'c';
		// 256 01010111 2^8 = 16 * 16 = 256
		// ~65000 0010101010001 256 * 256 = ~65000
		// при нажатиии клавиши на клаве ОС преобразует числовой код клавиши
		// клавиатуры в картинку символа.
		for (int k = 0; k < 256 * 256; k++) {
			if (k % 150 == 0) {
				System.out.println();
			}
			System.out.print((char) k);
		}
	}

}
