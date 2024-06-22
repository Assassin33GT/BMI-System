package projectm;

import java.util.*;
import java.io.*;
import java.nio.*;

public class Exercises  {
	

public void addABSWorkout() throws FileNotFoundException
{
	File file = new File("ABSWorkout.txt");
	Scanner sc1 = new Scanner(file);

	while(sc1.hasNextLine()){
		System.out.println(sc1.nextLine());
	}

}
public void addBicepsWorkout() throws FileNotFoundException 
{
	File file = new File("BicepsWorkout.txt");
	Scanner sc2 = new Scanner(file);

	while(sc2.hasNextLine()){
		System.out.println(sc2.nextLine());
	}
}
public void addTricepsWorkout() throws FileNotFoundException 
{
	File file = new File("TricepsWorkout.txt");
	Scanner sc3 = new Scanner(file);

	while(sc3.hasNextLine()){
		System.out.println(sc3.nextLine());
	}
}
public void addChestWorkout() throws FileNotFoundException
{
	File file = new File("ChestWorkout.txt");
	Scanner sc4 = new Scanner(file);
	
	while(sc4.hasNextLine()){
		System.out.println(sc4.nextLine());
	}
}
public void addBackWorkout() throws FileNotFoundException
{
	File file = new File("BackWorkout.txt");
	Scanner sc5 = new Scanner(file);	
	
	while(sc5.hasNextLine()){
		System.out.println(sc5.nextLine());
	}
}
public void addLegsWorkout() throws FileNotFoundException
{
	File file = new File("LegsWorkout.txt");
	Scanner sc6 = new Scanner(file);
	
	while(sc6.hasNextLine()){
		System.out.println(sc6.nextLine());
	}
}
public void addShouldersWorkout() throws FileNotFoundException
{
	File file = new File("ShouldersWorkout.txt");
	Scanner sc7 = new Scanner(file);	
	
	while(sc7.hasNextLine()){
		System.out.println(sc7.nextLine());
	}

}
public void addCardioWorkout() throws FileNotFoundException
{
	File file = new File("CardioWorkout.txt");
	Scanner sc8 = new Scanner(file);

	while(sc8.hasNextLine()){
		System.out.println(sc8.nextLine());
	}
			
}


}




