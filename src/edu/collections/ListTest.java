package edu.collections;

import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

public class ListTest {

	public static void main(String[] args) {
		long startTime = System.nanoTime();
		List<String> list = new LinkedList<>();

		for (int i = 0; i < 1000; i++) {
			list.add(0, UUID.randomUUID().toString());
			
		}

		long stopTime = System.nanoTime();
		System.out.println((stopTime - startTime) / 1000000);

		System.out.println("Готово");
		System.out.println();
	}

}
