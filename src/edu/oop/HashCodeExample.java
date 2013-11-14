package edu.oop;

import java.util.HashSet;
import java.util.Set;

public class HashCodeExample {

	public static void main(String[] args) {
		Male firstMale = new Male();
		firstMale.setFirstName("Иван");
		firstMale.setLastName("Иванов");
		firstMale.setSureName("Иванович");
		firstMale.setAge(21);

		Male secondMale = new Male();
		secondMale.setFirstName("Иван");
		secondMale.setLastName("Иванов");
		secondMale.setSureName("Иванович");
		secondMale.setAge(21);

		// Число которое уникально характеризует обьект
		// У двух разных немного разных обьектов - hashcode разный.
		// deep hashCode
		System.out.println(new Male().hashCode() == new Male().hashCode());
		System.out.println(firstMale.hashCode() == secondMale.hashCode());

		for (int i = 0; i < 1000; i++) {
			Set<Object> set = new HashSet<>();
			for (int j = 0; j < 1000000; j++) {
				set.add(new Object());
			}
			if (set.size() != 1000000) {
				System.out.println(set.size());
			}
		}
	}

}
