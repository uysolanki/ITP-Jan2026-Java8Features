package day2;

public class AppDriver {

	public static void main(String[] args) {
	Wishes goodMorn=	new GoodMorning();

	goodMorn.greet();
	
	Wishes goodEve= new GoodEvening();
	
	goodEve.greet();
	
	
	Wishes goodNight= ()->System.out.println("Good Night, have a nice sleep!!");
	goodNight.greet();		
	}

}
