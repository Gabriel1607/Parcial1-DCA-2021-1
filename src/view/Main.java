package view;


import controller.Controller;
import processing.core.PApplet;
import processing.core.PImage;

public class Main extends PApplet{
	PImage bg;
	Controller controller;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main(Main.class.getName());
	}
	public void settings() {
		size(1100, 700);
	}
public void setup() {
		bg= loadImage("../img/fondo.jpg");
		controller= new Controller(this);
	}
public void draw() {
	//controller.prueba();
	background(bg);
	for (int i = 0; i < controller.dog().size(); i++) {

		textSize(15);
		controller.dog().get(i).drawAttributes(150+(185*i),300);
	}
	
}
public void keyPressed() {
	controller.sortList(key);
}
}
