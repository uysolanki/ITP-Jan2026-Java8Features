package day2;

public class GeometryDriverApp {

	public static void main(String[] args) {
		
		Shape c2=new Circle();   //P p = new C  - Upcasting - Preferable
		
		c2.area();
		
		
		Shape r1=()->{
			int length=5;
			int breadth=10;
		double area=length*breadth;
		System.out.println("Area of Rectangle is "+area);
		};
		
		r1.area();

	}

}
