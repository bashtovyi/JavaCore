package edu.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class MapsExample {

	public static void main(String[] args) {
		// Map - пара ключ/значение.
		// HashMap - не гарантирует порядок ключей.
		Map<Integer, String> cloakroomMap = new HashMap<>();

		cloakroomMap.put(100, "Пальто");
		cloakroomMap.put(56, "Куртка");
		cloakroomMap.put(45, "Свитер");
		cloakroomMap.put(43, "Шапка");
		// LinkedHashMap - порядок ключей гарантируется.
		// TreeMap - ключи сортируются.
		System.out.println("Забрать: " + cloakroomMap.get(43));
		System.out.println(cloakroomMap);

		SortedMap<Integer, String> cloakSortMap = new TreeMap<>();
		cloakSortMap.put(100, "Пальто");
		cloakSortMap.put(56, "Куртка");
		cloakSortMap.put(45, "Свитер");
		cloakSortMap.put(43, "Шапка");
		System.out.println(cloakSortMap);

		// Иттерация по Хэш таблицам.
		// По Map нельзя иттерироваться.
		// Медленный способ иттерации.
		long startTime = System.nanoTime();
		for (Integer each : cloakSortMap.keySet()) {
			//System.out.println(each + " " + cloakSortMap.get(each));
		}
		System.out.println(System.nanoTime() - startTime);
		
		System.out.println();
		startTime = System.nanoTime();
		Set<Entry<Integer, String>> entrySet = cloakSortMap.entrySet();
		for (Entry<Integer, String> each : entrySet) {
			//System.out.println(each.getKey() + " " + each.getValue());
		}
		System.out.println(System.nanoTime() - startTime);
	}

}
