package projectm;

import java.util.*;
public class Login extends Person {

Scanner sc = new Scanner(System.in);

String ID , pass;

 User us = new User();
 

 public void Signup() {
		System.out.println("Enter 1 to Sign Up");
		System.out.println("Enter any other number Login");
		int num = sc.nextInt();
		 
		 
		if (num==1)
		{
			System.out.println("Enter your name");
			 name =sc.next();
			 
			 
			 
			 System.out.println("Enter your Phone Number");
			 phone =sc.next();
			 
			 
			 System.out.println("Enter your age");
			 age =sc.nextInt();
			 
			System.out.println("Please enter a username");
			ID = sc.next();
			
			System.out.println("Please enter a strong password");
			pass = sc.next();
			us.LoginInfo.put(ID , pass);
		    
		}
		while(num!=1)
		{
			break;
		}
		
	}

public boolean checkLoginForUser()
{
	
System.out.println("Enter ID :");
ID = sc.next();
System.out.println("Enter Password : ");
pass = sc.next();

if(us.LoginInfo.containsKey(ID))
{
    if(us.LoginInfo.containsValue(pass))
    {
       System.out.println("Login Successful");
       System.out.println("Hello , "+ ID);
       return true;
    }
    
}
else 
    System.out.println("ID or Password may be Wrong");
return false;
}
}

