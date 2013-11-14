package edu.oop;

public class OOP {

	public static void main(String[] args) {
		// Обьект и класс- ключевые понятия ООП
		// Класс - чертеж, рецепт, пресс это информация и способы управления этой 
		// информацией.
		// Информация - это поля, а способы - методы.
		// Обьект - это Экземпляр класса. Форма для выпечки - класс. Кекс-
		// обьект. Экземпляр класса - обьект - instance.

		// 
		// ассоциации слова обьект - мой дачный дом, утренний кекс, мою зубную
		// щетку
		// состояние обьекта выражается в его полях. То как со временем меняется
		// обьект.

		// Обьявление обьектной переменной типа Male
		Male male;
		// инициализация перменной обьектного типа
		// Конструктор - может ускорять инициализацию обьекта(инстанса)
		// Конструктор с аргументами может сделать возможным создание обьекта только при наличии определенных данных.
		male = new Male("Vovakin", 29);
		
		// Method - это действия или действие над полями обьекта.
		// Поля это характерисики обьекта.
		// Синонимы - поле - field, свойство - property, характеристика.
		// Метод - это действие, функция, процедура, подпрограмма.
		
		//male.setLastName("Иванов");
		//male.setFirstName("Иван");
		//male.setSureName("Иванович");
		//male.setAge(40.1);
		male.setPlayHockey(true);
		male.setFirstName("Олег");
		
		Female female = new Female("Алена", 21);
		female.setFirstName("Аня");

		System.out.println(male.getLastName());
		System.out.println(male.getFirstName());
		System.out.println(male.getSureName());
		System.out.println(male.getAge());
		System.out.println(female.getAge());
		
		//System.out.println(male.toString());
		// по-умолчанию метод print* вызывает toString
		System.out.println(male);
		System.out.println(female);
		
		
	}

}
