package edu.oop;

public final class FinalExample {

	public static void main(String[] args) {
		// final в имени класса запрещает наследование
		// final в имени метода запрещает переопределение
		// final в имени примитива запрещает измение;
		// final в имени обьектного типа запрещает изменение ссылки на обьект
		// final в имени параметра и поля ведет себя так же как и в переменных
		final Male male = new Male();
		male.setAge(20.1);
		//male = new Male();
	}
}
