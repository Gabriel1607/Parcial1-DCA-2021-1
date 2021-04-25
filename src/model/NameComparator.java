package model;

import java.util.Comparator;

public class NameComparator implements Comparator<Dog> {
	public int compare(Dog d1, Dog d2) {
		return d1.getName().compareTo(d2.getName());
	}
}