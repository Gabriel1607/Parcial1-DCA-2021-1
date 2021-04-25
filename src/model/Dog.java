package model;

import java.util.Date;

import processing.core.PApplet;

public class Dog {
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
}
