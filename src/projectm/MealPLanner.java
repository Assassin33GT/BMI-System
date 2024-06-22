package projectm;
import java.util.*;
public class MealPLanner  {

	
	
	Scanner sc = new Scanner(System.in);
	Meals m = new Meals();
	public int ansMP;
	public int calories;
	public void eatthismuch()
	{
		
		do 
		{
			ansMP=0;
			
			System.out.println("Enter calories from :-");
			System.out.println("(1000,1500,2000,2500,3000)");
			calories= sc.nextInt();
		    
		    if(calories!=1000 & calories!=1500 & calories!=2000 & calories!=2500 & calories!=3000)
		    {
		    	System.out.println("**Input out of range**");
		    	System.out.println("\n");
		    	ansMP = 1;
		    }
		}while(ansMP == 1);
		
		if (calories == 1000 )
		{
			
			System.out.println("Meals Recommended : ");
			m.addmeals();
			
			for(int i =0 ; i<m.allmeals.size()-13;i++){
				Collections.shuffle(m.allmeals);
				System.out.println(m.allmeals.get(i).mealName);
			}
			
			
		}
		
		if (calories == 1500 )
		{
			
			System.out.println("Meals Recommended : ");
			m.addmeals();
			
			for(int i =0 ; i<m.allmeals.size()-12;i++){
				Collections.shuffle(m.allmeals);
				System.out.println(m.allmeals.get(i).mealName);
			}
			
			
		}
		if (calories == 2000 )
		{
			
			System.out.println("Meals Recommended : ");
			m.addmeals();
			
			for(int i =0 ; i<m.allmeals.size()-11;i++){
				Collections.shuffle(m.allmeals);
				System.out.println(m.allmeals.get(i).mealName);
			}
			
			
		}
		
		if (calories == 2500)
		{
			
			System.out.println("Meals Recommended : ");
			m.addmeals();
			
			for(int i =0 ; i<m.allmeals.size()-10;i++){
				Collections.shuffle(m.allmeals);
				System.out.println(m.allmeals.get(i).mealName);
			}
			
			
		}
		if (calories == 3000)
		{
			
			System.out.println("Meals Recommended : ");
			m.addmeals();
			
			for(int i =0 ; i<m.allmeals.size()-9;i++){
				Collections.shuffle(m.allmeals);
				System.out.println(m.allmeals.get(i).mealName);
			}
			
			
		}
		
		
		
	}
	

}
