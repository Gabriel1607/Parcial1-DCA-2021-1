package model;


import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Collections;
import java.util.LinkedList;

import processing.core.PApplet;

public class Logic {
	private PApplet app;
	private String[] info1;
	private String[] info2;
	private LinkedList<Dog> ListOfDogs;
	AgeComparator ageComp;
	BreedComparator breedComp;
	NameComparator nameComp;
	public Logic(PApplet app) {
		this.app = app;
		info1 = app.loadStrings("../texts/TXT1.txt");
		info2 = app.loadStrings("../texts/TXT2.txt");
		ListOfDogs = new LinkedList<Dog>();
		ageComp = new AgeComparator();
		breedComp = new BreedComparator();
		nameComp = new NameComparator();
		TextDogs();
	}
	public void TextDogs() {

		for (int i = 0; i < info1.length; i++) {
			
			String[] dogAttributes1 = info1[i].split(" ");
			
			int id = Integer.parseInt(dogAttributes1[0]);
			String name = dogAttributes1[1];
			for (int j = 0; j < info2.length; j++) {	
				
				String[] dogAttributes2 = info2[j].split(" ");
				if(id == Integer.parseInt(dogAttributes2[0])) {
				
					String breed = dogAttributes2[1];
					String birth = dogAttributes2[2];
					String[] birthday= birth.split("-");
					String dogBirthday= birthday[2] +"-"+ birthday[1] +"-"+ birthday[0] ;
	    LocalDate dogBirth = LocalDate.parse(dogBirthday);
	   // dogBirth.format(DateTimeFormatter.ofPattern("dd-MMM-yy"));
	    LocalDate date = LocalDate.now();
	   // date.format(DateTimeFormatter.ofPattern("dd-MMM-yy"));
	  int age = calculateAge(dogBirth,date);
					ListOfDogs.add(new Dog(id, name, age, breed,app));
				}
				
			}
		}
		
		}
	public void prueba() {
		for (int i = 0; i < ListOfDogs.size(); i++) {
			System.out.println(ListOfDogs.get(i).id);
			System.out.println(ListOfDogs.get(i).name);
			System.out.println(ListOfDogs.get(i).breed);
			System.out.println(ListOfDogs.get(i).age);
		}
		}
	public void sortList(char key) {
		switch (key) {
		case 'i':
			Collections.sort(ListOfDogs);
			break;
		case 'n':
			Collections.sort(ListOfDogs,nameComp);
			break;
		case 'b':
			Collections.sort(ListOfDogs,breedComp);
			break;
		case 'a':
			Collections.sort(ListOfDogs,ageComp);
			break;
		}
	}


	 public  int calculateAge(LocalDate birthDate, LocalDate currentDate) {
	        if ((birthDate != null) && (currentDate != null)) {
	            return Period.between(birthDate, currentDate).getYears();
	        } else {
	            return 0;
	        }
	    }
	 public LinkedList<Dog> getList(){
		 return ListOfDogs;
	 }
	}

