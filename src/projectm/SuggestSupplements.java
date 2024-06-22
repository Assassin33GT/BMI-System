package projectm;
import java.util.*;
public class SuggestSupplements {
    Scanner sc = new Scanner(System.in);
	Supplements s = new Supplements();
	int answer;
	int SS_Ctrl=0;
	
	
	
	public void categorySelect()
	{
		do 
		{
			SS_Ctrl=0;
			
	        System.out.println("Choose a category for supplement suggestion :-");
			
			System.out.println("\n");
			
			System.out.println("Enter 1 for weight Loss ");
			System.out.println("Enter 2 for weight gain ");
			System.out.println("Enter 3 for Pre Workout ");
			System.out.println("Enter 4 for Muscle Building ");	
			System.out.println("Enter 5 for Vitamin A ");
			System.out.println("Enter 6 for Vitamin B1 ");
			System.out.println("Enter 7 for Vitamin B2 ");
			System.out.println("Enter 8 for Vitamin C ");
			System.out.println("Enter 9 for Vitamin D ");
			System.out.println("Enter 10 for Vitamin E ");
			System.out.println("Enter 11 for Vitamin K ");
			answer= sc.nextInt();
		    
		    if(answer<1 || answer>11)
		    {
		    	System.out.println("**Input out of range**");
		    	System.out.println("\n");
		    	SS_Ctrl = 1;
		    }
		}while(SS_Ctrl == 1);
		
		
		if(answer == 1) 
		{
			s.addWeightlossing();
			System.out.println("Weight Loss Supplements : ");
			for(int i =0 ; i<s.weightLoss.size();i++){
				System.out.println(s.weightLoss.get(i));
			}
		}
		else if(answer == 2) 
		{
			s.addWeightGaining();
			System.out.println("Weight Gain Supplements : ");	
	    	for(int i=0;i<s.weightGaining.size();i++) {
	    		System.out.println(s.weightGaining.get(i));
	    	}
		}
		else if(answer == 3) 
		{
			s.addPreWorkout();
			System.out.println("Pre Workout Supplements : ");
	    	for(int i=0;i<s.preWorkout.size();i++){
	    		System.out.println(s.preWorkout.get(i));
	    	}
		}
		else if(answer == 4) 
		{
			s.addMuscleGaining();
			System.out.println("Muscle Building Supplements : ");
	    	for(int i=0;i<s.MuscleGaining.size();i++){
	    		System.out.println(s.MuscleGaining.get(i));
	    	}
		}
		else if(answer == 5) 
		{
			s.addVitaminA();
			System.out.println("Vitamin A : ");
	    	for(int i=0;i<s.vitaminA.size();i++){
	    		System.out.println(s.vitaminA.get(i));
	    	}
		}
		else if(answer == 6) 
		{
			s.addVitaminB1();
			System.out.println("Vitamin B1 : ");
	    	for(int i=0;i<s.vitaminB1.size();i++){ 
	    		System.out.println(s.vitaminB1.get(i));
	    	}
		}
		else if(answer == 7) 
		{
			s.addVitaminB2();
			System.out.println("Vitamin B2 : ");
	    	for(int i=0;i<s.vitaminB2.size();i++){
	    		System.out.println(s.vitaminB2.get(i));
	    	}
		}
		else if(answer == 8) 
		{
			s.addVitaminC();
			System.out.println("Vitamin C : ");
	    	for(int i=0;i<s.vitaminC.size();i++){
	    		System.out.println(s.vitaminC.get(i));
	    	}
		}
		else if(answer == 9) 
		{
			s.addVitaminD();
			System.out.println("Vitamin D : ");
	    	for(int i=0;i<s.vitaminD.size();i++){
	    		System.out.println(s.vitaminD.get(i));
	    	}
		}
		else if(answer == 10) 
		{
			s.addVitaminE();
			System.out.println("Vitamin E : ");
	    	for(int i=0;i<s.vitaminE.size();i++){
	    		System.out.println(s.vitaminE.get(i));
	    	}
		}
		else if(answer == 11) 
		{
			s.addVitaminK();
			System.out.println("Vitamin K : ");
	    	for(int i=0;i<s.vitaminK.size();i++){
	    		System.out.println(s.vitaminK.get(i));
	    	}
		}
		else
			System.out.println("Please pick only a number form 1 to 4");
		
		
		
		
	}
}
	

