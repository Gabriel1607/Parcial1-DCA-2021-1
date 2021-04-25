package view;


import controller.Controller;
import processing.core.PApplet;

public class Main extends PApplet{
	Controller controller;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main(Main.class.getName());
	}
	public void settings() {
		size(900, 700);
	}
public void setup() {
		
		controller= new Controller(this);
	}
public void draw() {
	//controller.prueba();
	background(255);
	for (int i = 0; i < controller.dog().size(); i++) {

		textSize(15);
		controller.dog().get(i).drawAttributes(23+(185*i),300);
	}
	
}
public void keyPressed() {
	controller.sortList(key);
}
}
