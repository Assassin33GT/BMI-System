package projectm;

import java.util.*;

public class Meals implements Nutritions  {

	int calories;
	int protien;
	String mealName;
	Scanner sc = new Scanner(System.in);

    final String ANSI_RESET = "\u001B[0m";
    final String ANSI_PURPLE = "\u001B[35m";
	
  
	public Meals(int calories, int protien , String mealName) {
		
		this.calories = calories;
		this.protien = protien;
		this.mealName = mealName;
	}

    
	public Meals() {
		// TODO Auto-generated constructor stub
	}


	ArrayList <Meals> allmeals = new ArrayList<>();
 
	
    
    
    
    public void addmeals() {
 
 	    allmeals.add(new Meals(490, 68 , "Spinach Scramble (500gm) with 2 cups of blueberries (0.5L)"));
    	allmeals.add(new Meals(485, 72 ,"Strawberry Milkshake (0.5L) with oats (200gm)"));
    	allmeals.add(new Meals(512, 88 , "Goat Cheese, Tomato, and Parsley Scramble (261gm) with Whole Wheat Toast (56gm)"));
    	allmeals.add(new Meals(498, 112 ,"Tuna-Avocado Sandwich (310gm) with Cauliflower and Hummus Snack (240gm)"));
    	allmeals.add(new Meals(511, 49 ,"Avocado, Strawberry, and Spinach Salad(392gm) with Chocolate Avocado Smoothie(261gm)"));
    	allmeals.add(new Meals(488, 95 ,"Cinnamon Protein Oats(309gm) with Chicken Celery Sticks(349gm)"));
    	allmeals.add(new Meals(522, 74 , "2 apples with Lemon Berry Smoothie(423gm)"));
    	allmeals.add(new Meals(513, 71 ,"Spiced Sweet Potato and Goat Cheese Egg Skillet(438gm) with Corn Thins and Avocado(124gm)"));
    	allmeals.add(new Meals(502, 85 ,"egg cups(448gm)with Tuna-Avocado Sandwich(310gm)"));
    	allmeals.add(new Meals(497, 60 ,"turkey salad(210gm) with Banana Coconut Green Smoothie(404gm)"));
    	allmeals.add(new Meals(492, 92 ,"Eggs Baked in Avocado(338gm)with Tuna and Avocado Salad(343gm)"));
    	allmeals.add(new Meals(479, 60 ,"4 slices Cantaloupe with Cool Summer Cucumber Chicken and Tomato Toss(850)"));
    	allmeals.add(new Meals(475, 40 ,"Microwave Poached Eggs(257gm) with 1 cup of carrots"));
    	allmeals.add(new Meals(506, 111 ,"Salmon Wrapped Avocado(278gm) with Paleo Avocado Chicken Salad(263gm)"));
    	allmeals.add(new Meals(498, 94 , "Keto Spicy Tuna Roll(245gm) with Peppers Cucumber & Avocado Salad(386gm)"));
    }

	@Override
	public void getCalories() {
		addmeals();
		System.out.println("");
		  System.out.println(ANSI_PURPLE
		            + "enter 1 to show all meals 'Calories Value' or any number to skip"
		            + ANSI_RESET);
		int num = sc.nextInt();
		
		if (num ==1)
		{
			
		for(int i = 0 ; i<allmeals.size();i++)
		{
			
		System.out.println("Meal : "+ allmeals.get(i).mealName+", Calories : "+ allmeals.get(i).calories+" ");
		}
		while(num != 1) {
			break;
		}
		}
		
			
		
	}


	@Override
	public void getProtien() {
		
		
		System.out.println("");
		  System.out.println(ANSI_PURPLE
		            + "enter 2 to show all meals 'Protien Value' or any number to skip"
		            + ANSI_RESET);
		int num = sc.nextInt();
		
		if (num ==2)
		{
		for(int i = 0 ; i<allmeals.size();i++)
		{
			
		System.out.println("Meal : "+ allmeals.get(i).mealName+", Protien : "+ allmeals.get(i).protien+" g");
		}
		while(num != 2) {
			break;
		}
		}
	}



    
    
   
    
			

}
