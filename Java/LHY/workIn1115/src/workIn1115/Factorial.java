package workIn1115;

public class Factorial {

	public static void main(String[] args) {
		
		long x = 17;
		long x_1 = x;
		long k = 1 ;
		long sum = 1;
		
		if(x==0) System.out.println("The factorial of 0 is 1");
		else {
		 while (x>0)
		 {
			 sum =sum*k;
			k++;
			x--;
			}
		 
		 System.out.println("The factorial of "+x_1+" is "+sum);
		}
	}

}
