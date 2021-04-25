package view;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import controller.Controller;
import processing.core.PApplet;

public class Main extends PApplet{
	Controller controller;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main(Main.class.getName());
	}
	public void settings() {
		size(700, 700);
	}
public void setup() {
		
		controller= new Controller(this);
	}
public void draw() {
	LocalDate date = LocalDate.now();
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
	System.out.println(date.format(formatter));
}
public void keyPressed() {
	
}
}
