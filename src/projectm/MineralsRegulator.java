package projectm;
import java.util.*;
public class MineralsRegulator {
	int answer;
	double sugar;
	double salt;
	double maxSugar=36;
	double maxSalt=3;
	double saltCount=0,sugarCount=0;
    Scanner sc = new Scanner(System.in);
    
	public void calcMinerals() {
		
		do 
		{
			answer=0;
			
			System.out.println("Enter your usage of Sugar :");
			sugar = sc.nextDouble();
			System.out.println("Enter your usage of Salt :");
			salt = sc.nextDouble();
			
			System.out.println("\n");
			
		    if(sugar<0)
		    {
		    	System.out.println("**Your cunsumption of Sugar should be 0 or above**");
		    	System.out.println("\n");
		    	answer = 1;
		    }
		    if(salt<0)
		    {
		    	System.out.println("**Your cunsumption of Salt should be 0 or above**");
		    	System.out.println("\n");
		    	answer = 1;
		    }
		}while(answer == 1);
		
	sugarCount+=sugar;
	if(sugarCount>maxSugar) 
		System.out.println("Sugar --> You exceeded limit by " + (sugarCount-maxSugar)+" grams");
	else if(sugarCount == maxSugar)
		System.out.println("Sugar --> You reached the limit of which is 36g");
	else
		System.out.println("Sugar --> You still can have "+(maxSugar-sugarCount)+ " grams");

	saltCount+=salt;
	if(saltCount>maxSalt)
		System.out.println("Salt --> You exceeded limit by " + (saltCount-maxSalt)+" grams");
	else if(saltCount == maxSalt)
		System.out.println("Salt --> You reached the limit which is 3g");
	else
		System.out.println("Salt --> You still can have "+(maxSalt-saltCount)+ " grams");
		
	}

}
