package edu.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
		// Set - множество уникальных елементов.
		// HashSet - не гарантирует порядок хранения.
		Set<String> hashSet = new HashSet<>();
		hashSet.add("Notebook");
		hashSet.add("Milk");
		hashSet.add("Bread");
		hashSet.add("Bear");
		hashSet.add("Sugar");
		hashSet.add("Notebook");
		System.out.println(hashSet);

		for (String each : hashSet) {
			// System.out.println(each);
		}
		System.out.println();
		// Порядок хранения гарантируется.
		Set<String> linkedHashSet = new LinkedHashSet<>();
		linkedHashSet.add("Notebook");
		linkedHashSet.add("Milk");
		linkedHashSet.add("Bread");
		linkedHashSet.add("Bear");
		linkedHashSet.add("Sugar");
		linkedHashSet.add("Notebook");
		System.out.println(linkedHashSet);

		System.out.println();
		// Данные сортируются. 
		// reverseOrder -  меняет порядок сортировки
		SortedSet<String> sortedSet = new TreeSet<>(Collections.reverseOrder());
		sortedSet.add("Notebook");
		sortedSet.add("Milk");
		sortedSet.add("Bread");
		sortedSet.add("Bear");
		sortedSet.add("Sugar");
		sortedSet.add("Notebook");
		System.out.println(sortedSet);
		
		List<String> list = new ArrayList<>();
		list.add("Молоко");
		list.add("Вино");
		list.add("Молоко");
		
		// Один из способов уникализации по необходимости. То есть хранить постянно во множестве нет необходимости.
		System.out.println(list);
		list = new ArrayList<>(new LinkedHashSet<>(list));
		System.out.println(list);
		
	}

}
