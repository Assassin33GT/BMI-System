package projectm;

public class BMI extends User {
	
	double bmi;
	
	
	
	
	public BMI(double weight, double height) {
		super(weight, height);
		// TODO Auto-generated constructor stub
	}

	public double  bmiCalculator()	{
	return bmi = (100*100*weight)/(height*height);
	}
	
	public  void printBMICategory() {
        if(bmi < 18.5) {
            System.out.println("You are underweight");
        }else if (bmi < 25) {
            System.out.println("You are normal");
        }else if (bmi < 30) {
            System.out.println("You are overweight");
        }else {
            System.out.println("You are obese");
        }
    }

}