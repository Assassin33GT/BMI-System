package projectm;


import java.util.*;

public class User extends Person {
	
	String id;
	String password;
	double weight;
	double height;
   
    int num;
    Scanner sc = new Scanner(System.in);
	HashMap<String,String> LoginInfo = new HashMap<>();
	
	

	public User()
	{
		LoginInfo.put(id , password);
		LoginInfo.put("Ahmed", "Ahmed1510");
		LoginInfo.put("Omar","omar1110");
		LoginInfo.put("Seif","seif79");
		LoginInfo.put("Khalil","Khalil69");
		LoginInfo.put("Mahmoud","7eda03");
		
	}
	public User(double weight , double height)
	{
		this.weight= weight;
		this.height= height;
	
	}


}
