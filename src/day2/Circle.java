package day2;

public class Circle implements Shape{

	@Override
	public void area() {
		int radius=5;
		double area=Math.PI*radius*radius;
		System.out.println("Area of Circle is "+area);
		
	}

}
