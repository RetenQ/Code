package workIn1115;

public class SquareSum {

	public static void main(String[] args) {
	int x =100;
	int k1 = x;
	int sum1 = 0 ;
	int k2 = x; 
	int sum2 = 0 ;

	while(k1>1)
	{
	 if(k1%13 == 0) {	 
		 sum1=sum1+k1;	 
	 }
	 k1--;
	 
	}
	System.out.println("The sum of all numbers divisible by 13 is "+sum1);
	
	
	while(k2>0)
	{
		
		int k2_2 = (int) Math.pow(k2,2);
		sum2 =sum2 +k2_2;
		k2--;
	}
	System.out.println("The sum of all squares is "+sum2);	
		

	}

}
