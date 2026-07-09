package day5;

public class MethodReferencingDemo2 {

	public static void main(String[] args) {
		Printing p1= MethodReferencingDemo2::convertToUpper;
		p1.printUpperCase("full stack development Java");
		
		Factorial f1=MethodReferencingDemo2::myFactorial;
		f1.calculateFactorial(6);
	}
	
	public static void convertToUpper(String data)
	{
		System.out.println(data.toUpperCase());
	}
	
	public static void myFactorial(int n)
	{
		int fact=1;
		for(int i=1;i<=n;i++)
			fact=fact*i;
		
		System.out.println("Factorial of "+ n + " is " + fact);
	};
}


//replace a lambda expression with any existing function

//output 
//FULL STACK DEVELOPEMENT


