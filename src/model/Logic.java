package model;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;

import processing.core.PApplet;

public class Logic {
	private PApplet app;
	private String[] info1;
	private String[] info2;
	private LinkedList<Dog> ListOfDogs;
	public Logic(PApplet app) {
		this.app = app;
		info1 = app.loadStrings("../texts/TXT1.txt");
		info2 = app.loadStrings("../texts/TXT2.txt");
		ListOfDogs = new LinkedList<Dog>();
	}
	public void TextDogs() {
		for (int i = 0; i < info1.length; i++) {

			String[] dogAttributes1 = info1[i].split(" ");
			
			int id = Integer.parseInt(dogAttributes1[0]);
			String name = dogAttributes1[1];
			for (int j = 0; j < info2.length; j++) {	
				String[] dogAttributes2 = info2[i].split(" ");
				if(id==Integer.parseInt(dogAttributes2[0])) {
					String breed = dogAttributes1[1];
					String birth = dogAttributes1[2];
					//String[] birthday= birth.split("-");
	    LocalDate dogBirth = LocalDate.parse(birth);
	    LocalDate date = LocalDate.now();
	    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/YYYY");
	  int age = calculateAge(dogBirth,date);
					ListOfDogs.add(new Dog(id, name, age, breed,app));
				}
				
			}
		}
	}


	 public  int calculateAge(LocalDate birthDate, LocalDate currentDate) {
	        if ((birthDate != null) && (currentDate != null)) {
	            return Period.between(birthDate, currentDate).getYears();
	        } else {
	            return 0;
	        }
	    }
	}

