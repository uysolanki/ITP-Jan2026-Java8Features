package day2;

public class NormalFunctionDemo {

	public static void main(String[] args) {
		greet();
	}
	
	
	public static void greet()
	{
		System.out.println("Welcome to Pune, Virat");
	}
	
	public static void areaOfCircle(int radius)
	{
		double area=Math.PI*radius*radius;
		System.out.println("Area of Circle is "+area);
	}
	
	public static void areaOfRectangle(int length,int width)
	{
		double area=length*width;
		System.out.println("Area of Circle is "+area);
	}
	
	public static void factorial(int number)
	{
		int fact=1;
		for(int i=1;i<=number;i++)
		{
			fact=fact*i;
		}
		
		System.out.println("Factorial is "+fact);
	}
	
	public static void square(int number)
	{
		System.out.println("Sqaure is "+number*number);
	}
	
	public static int cube(int number)
	{
		return number*number*number;
	}
	
}



//lambda expression

/*
	()->  //non parameterised lambda expression
	{
		System.out.println("Welcome to Pune, Virat");
	}
	
substract  5 Access Speceifiers , Access Modifiers, return type , function name , parameters datatype
add        1  ->  arrow operator , semicolon 


variation 1:
single parameterised function

(radius)->
	{
		double area=Math.PI*radius*radius;
		System.out.println("Area of Circle is "+area);
	};
	
if we are having single parameter () is not mandatory

radius->
	{
		double area=Math.PI*radius*radius;
		System.out.println("Area of Circle is "+area);
	}
	

variation 2:
more than 1 parameters in function

(length,width)->
	{
		double area=length*width;
		System.out.println("Area of Circle is "+area);
	}
	
if we are having single parameter () is not mandatory

length,width->   //invalid syntax error
	{
		double area=Math.PI*radius*radius;
		System.out.println("Area of Circle is "+area);
	}
	
variation 3:
function body multiple lines then we have to give { } compulsory

(number)->
	{
		int fact=1;
		for(int i=1;i<=number;i++)
		{
			fact=fact*i;
		}
		
		System.out.println("Factorial is "+fact);
	};
	
variation 4:
function body multiple lines then we have to give { } compulsory  & 
			   if we wish to return value then we have to write the "return" keyword
					
(number)->
	{
		int fact=1;
		for(int i=1;i<=number;i++)
		{
			fact=fact*i;
		}
		
		return fact;
	};
	
variation 5:
function body single line then {} is not mandatory
			   if we wish to return value then we have to write the "return" keyword
					
(number)->System.out.println("Sqaure is "+number*number);

variation 6:
function body single line then return is by default added by java, programer 
			   need not add return keyword
					
number->number*number*number;
*/
