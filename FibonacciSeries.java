package week1.day1;

public class FibonacciSeries {
	
	public static void main (String[] args)
	{
	
		int  range = 8;
		int firstNum = 0;
		int secNum = 1;
		int sum;
		System.out.println(firstNum);

		for(range = 1;range<=8;range++)
		{
		sum = firstNum + secNum;		
		firstNum = secNum;
		secNum = firstNum;		
	    secNum = sum;		
		System.out.println(sum);
		}
		
	
	}
	

}
