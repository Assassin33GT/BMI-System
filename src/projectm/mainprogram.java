package projectm;
import java.io.FileNotFoundException;
import java.util.*;
public class mainprogram {

	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner input = new Scanner(System.in);
		double w ;
		double h ;
	    int Prog_ctrl = 0;
	    int Menu_Ctrl=0;
	    int answer;
	    int ansBMI;
		Login log = new Login();
		
	    final String ANSI_RESET = "\u001B[0m";
	    final String ANSI_PURPLE = "\u001B[35m";
	    final String ANSI_RED = "\u001B[31m";
		
	    System.out.println(ANSI_PURPLE
                + "*****Welcom to WECARE :)*****"
                + ANSI_RESET);
		System.out.println("\n");
		
		
	while(Prog_ctrl == 0) {
		
		log.Signup();
		while(log.checkLoginForUser() == false)
		{
				log.checkLoginForUser();
		}
		
		System.out.println("\n");
		//System.out.println("out 2nd while");
		while(Menu_Ctrl == 0)
		{
			//System.out.println("in 2nd while");
			System.out.println(ANSI_PURPLE
                    + "Choose a category"
                    + ANSI_RESET);
		
		System.out.println("\n");
		
		System.out.println("Enter 1 --> BMI");
		System.out.println("Enter 2 --> Diet Plan");
		System.out.println("Enter 3 --> Supplement Suggestion");
		System.out.println("Enter 4 --> Workout Plan");
		System.out.println("Enter 5 --> Mineral Consumption");
		
		System.out.println("");
		do
		{
			System.out.println(ANSI_PURPLE
	                + "Choose from 1 to 5 :"
	                + ANSI_RESET);
		    answer = input.nextInt();
		}while(answer<1 || answer>5);
		
		System.out.println("\n");
		
		if (answer == 1)
		{
		do
		{
			ansBMI=0;
		System.out.println("Enter your weight in kilograms : ");
		w = input.nextDouble();
		System.out.println("Enter your height in cm : ");
		h= input.nextDouble();
		if ((w<30 || w>300))
		{
			System.out.println("**Input out of range**");
			System.out.println("*Weight should be from 30 to 300");
			ansBMI = 1;
		}
		else if((h<100 || h>250))
		{
			System.out.println("**Input out of range**");
			System.out.println("*Hight should be from 100 to 250");
			ansBMI = 1;
		}
		System.out.println("\n");
		}while(ansBMI == 1);
		
		
		BMI b = new BMI(w , h);
		b.bmiCalculator();
		b.printBMICategory();
		System.out.println("\n");
		}
		
	
		if (answer == 2)
		{
			MealPLanner mp = new MealPLanner(); 
			Meals me = new Meals();
	        mp.eatthismuch();
			me.getCalories();
			me.getProtien();
		
	    System.out.println("\n");
		}
		
	    
		
	    if(answer == 3)
	    {
		SuggestSupplements ss = new SuggestSupplements();
		ss.categorySelect();
		System.out.println("\n");
	    }
	    
		
		
		if(answer == 4)
		{
		SuggestExercises se = new SuggestExercises();
		se.categorySelectE();
		System.out.println("\n");
		}
		
		
		if(answer == 5)
		{
		MineralsRegulator mr = new MineralsRegulator();
		mr.calcMinerals();
		System.out.println("\n");
		}
		
		
		
		System.out.println("Enter 0 -> Menu or any number -> Exit Menu");
		Menu_Ctrl = input.nextInt();
		}
		System.out.println("Enter 0 -> Login again or any number -> End");
		Prog_ctrl = input.nextInt();
		if(Prog_ctrl == 0)
		{
			Menu_Ctrl=0;
		}
	   }
	System.out.println(ANSI_RED
            + "Thank you for using WECARE :)"
            + ANSI_RESET);
	   


	}
}
