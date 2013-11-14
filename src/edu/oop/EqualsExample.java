package edu.oop;


public class EqualsExample {

	public static void main(String[] args) {
		Female firstFemale = new Female();
		firstFemale.setFirstName("Оля");
		firstFemale.setLastName("Олегович");
		firstFemale.setSureName("Олеговна");
		firstFemale.setAge(15);
		firstFemale.setPregnant(false);

		Male firstMale = new Male();
		firstMale.setSpause(firstFemale);
		firstMale.setFirstName("Борис");
		firstMale.setSureName("Валютин");
		firstMale.setLastName("Буратович");
		firstMale.setAge(21);

		Female secondFemale = new Female();
		secondFemale.setFirstName("Оля");
		secondFemale.setLastName("Олегович");
		secondFemale.setSureName("Олеговна");
		secondFemale.setAge(15);
		secondFemale.setPregnant(false);

		Male secondMale = new Male();
		secondMale.setSpause(secondFemale);
		secondMale.setFirstName("Борис");
		secondMale.setSureName("Валютин");
		secondMale.setLastName("Буратович");
		secondMale.setAge(21);

		// Если обьекты равны то их поля равны
		// Если обьекты хотя бы в одном поле равны тогда они не равны
		System.out.println(firstMale.equals(secondMale));
		System.out.println(new Male().equals(new Male()));
	}

}
