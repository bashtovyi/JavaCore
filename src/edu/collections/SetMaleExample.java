package edu.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

import edu.oop.Female;
import edu.oop.Male;

public class SetMaleExample {

	public static void main(String[] args) {
		HashSet<Male> malesSet = new HashSet<>();
		// Для добавления обьектов в множество и HashTable нужно что бы в
		// обьектах были правильно! реализованы
		// hashCode и equals.
		Female firstFemale = new Female();
		firstFemale.setFirstName("Оля");
		firstFemale.setLastName("Олегович");
		firstFemale.setSureName("Олеговна");
		firstFemale.setAge(25);
		firstFemale.setPregnant(false);

		Male firstMale = new Male();
		firstMale.setSpause(firstFemale);
		firstMale.setFirstName("Борис");
		firstMale.setSureName("Валютин");
		firstMale.setLastName("Буратович");
		firstMale.setAge(18);

		Female secondFemale = new Female();
		secondFemale.setFirstName("Оля");
		secondFemale.setLastName("Олегович");
		secondFemale.setSureName("Олеговна");
		secondFemale.setAge(25);
		secondFemale.setPregnant(false);

		Male secondMale = new Male();
		secondMale.setSpause(secondFemale);
		secondMale.setFirstName("Борис");
		secondMale.setSureName("Валютин");
		secondMale.setLastName("Буратович");
		secondMale.setAge(15);

		Female thirdFemale = new Female();
		thirdFemale.setFirstName("Оля");
		thirdFemale.setLastName("Олегович");
		thirdFemale.setSureName("Олеговна");
		thirdFemale.setAge(25);
		thirdFemale.setPregnant(false);

		Male thirdMale = new Male();
		thirdMale.setSpause(thirdFemale);
		thirdMale.setFirstName("Борис");
		thirdMale.setSureName("Валютин");
		thirdMale.setLastName("Буратович");
		thirdMale.setAge(14);

		malesSet.add(firstMale);
		malesSet.add(secondMale);
		malesSet.add(thirdMale);


		for (Male male : malesSet) {
			if (male.getFirstName() == "Борис") {
				System.out.println(male);
			}
		}

		System.out.println(malesSet.toString());
		System.out.print("[");
		for (Male male : malesSet) {
			System.out.print(male.getFirstName() + " ");
			System.out.print(male.getSureName() + " ");
			System.out.print(male.getAge());
			System.out.print(", ");
		}
		System.out.println("]");

		System.out.println("Compare: ");
		// Для нормальной работы нужны качественно! реализованы методы hashCode,
		// equals. compareTo
		SortedSet<Male> sortedSet = new TreeSet<>();

		sortedSet.add(firstMale);
		sortedSet.add(secondMale);
		sortedSet.add(thirdMale);
		System.out.println(sortedSet);

		// Comparator Example

		List<Male> maleList = new ArrayList<>();
		maleList.add(firstMale);
		maleList.add(secondMale);
		maleList.add(thirdMale);

		Collections.sort(maleList, new Comparator<Male>() {
			@Override
			public int compare(Male o1, Male o2) {
				return o2.getAge() - o1.getAge();
			}
		});
		System.out.println(maleList);
		
	}

}
