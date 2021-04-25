package model;



import processing.core.PApplet;

public class Dog implements Comparable<Dog> {
	private PApplet app;
	String name,breed;
	int age,id;
	public Dog(int id, String name, int age, String breed,PApplet app) {
		this.id=id;
		this.name=name;
		this.age=age;
		this.breed=breed;
		this.app=app;
	}
	public String getName() {
		return name;
	}
	public String getBreed() {
		return breed;
	}
	public int getAge() {
		return age;
	}
	public int getId() {
		return id;
	}
	@Override
	public int compareTo(Dog nextDog) {
		// TODO Auto-generated method stub
		return this.id - nextDog.getId();
	}
}
