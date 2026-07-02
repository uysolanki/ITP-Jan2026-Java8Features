package day1;

public class OddEvenCount {
public static void main(String[] args) {
	int arr[]= {1,2,3,4,5};
	
	int oddCount=0;
	int evenCount=0;
	
	for(int n:arr)
	{
		if(n%2==0)
			evenCount++;
		else
			oddCount++;
	}
	
	System.out.println("Even Count  is "+evenCount);
	System.out.println("Odd Count  is "+oddCount);
}
}


//odd:3
//even:2