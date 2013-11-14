package edu.collections;

import java.util.Comparator;

import edu.oop.Male;

public class MalesComparator implements Comparator<Male> {

	@Override
	public int compare(Male male1, Male male2) {
		return male1.getAge() - male2.getAge();
	}

}
