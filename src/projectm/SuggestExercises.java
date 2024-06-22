package projectm;
import java.io.FileNotFoundException;
import java.util.*;
public class SuggestExercises {
	Scanner sc = new Scanner(System.in);
	Exercises e = new Exercises();
	public int answer;
	public int SE_Ctrl=0;
	public void categorySelectE() throws FileNotFoundException
	{
		do 
		{
			SE_Ctrl=0;
			
			System.out.println("Choose a category for exercises suggestion :-");
			
			System.out.println("\n");
			
			System.out.println("Enter 1 for Abs ");
			System.out.println("Enter 2 for Biceps ");
			System.out.println("Enter 3 for Triceps ");
			System.out.println("Enter 4 for Chest ");	
			System.out.println("Enter 5 for Back");
			System.out.println("Enter 6 for Legs ");
			System.out.println("Enter 7 for Shoulders ");
			System.out.println("Enter 8 for Cardio ");
			answer= sc.nextInt();
		    
		    if(answer<1 || answer>8)
		    {
		    	System.out.println("**Input out of range**");
		    	System.out.println("\n");
		    	SE_Ctrl = 1;
		    }
		}while(SE_Ctrl == 1);
		
		
		
		
		
		if(answer == 1) 
		{
			
			System.out.println("ABS Exercises : ");
			e.addABSWorkout();
			
			
		}
		else if(answer == 2) 
		{
			
			System.out.println("Biceps Exercises : ");	
			e.addBicepsWorkout();
	    	
	    	
		}
		else if(answer == 3) 
		{
			System.out.println("Triceps Exercises : ");	
			e.addTricepsWorkout();
		}
		else if(answer == 4) 
		{
			System.out.println("Chest Exercises : ");
			e.addChestWorkout();
	    	
		}
		else if(answer == 5) 
		{
			System.out.println("Back Exercises : ");
			e.addBackWorkout();
		}
		else if(answer == 6) 
		{
			System.out.println("Legs Exercises : ");
			e.addLegsWorkout();
		}
		else if(answer == 7) 
		{
			System.out.println("Shoulders Exercises : ");
			e.addShouldersWorkout();
	    	
		}
		else if(answer == 8) 
		{
			System.out.println("Cardio Exercises : ");
			e.addCardioWorkout();
	    	
		}
		else
			System.out.println("Please pick only a number form 1 to 8");
	}
		
}

