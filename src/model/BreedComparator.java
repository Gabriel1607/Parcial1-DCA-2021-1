package model;

import java.util.Comparator;

public class BreedComparator implements Comparator<Dog> {
	public int compare(Dog d1, Dog d2) {
		return d1.getBreed().compareTo(d2.getBreed());
	}
}
