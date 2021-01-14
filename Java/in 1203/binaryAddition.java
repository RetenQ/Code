package lecture11;
import java.util.*;
class binaryAddition
{
 public static void main (String[] args)
 	{
	Scanner sc = new Scanner(System.in);
	String ans = new String("");
	int i,m,n,sum,carry=0;
	System.out.println ("enter 1st binary number");
	int n1 = sc.nextInt();
	System.out.println ("enter 2nd binary number");
	int n2 = sc.nextInt();

	while(n1 > 0 || n2 > 0)
	 {
		m=n1%10;
		n=n2%10;
		n1=n1/10;
		n2=n2/10;
		sum=m+n+carry;

		if(sum==1)
		{
		  System.out.println("Sum = 1: " + (m+n+carry));
		  System.out.println("m + n + carry: " + (m+n+carry));
		  ans= (m+n+carry) + ans;
		  System.out.println("Ans: " + ans);

		}

		else if(sum==2)
		{
			System.out.println("Sum = 2: " );
			ans = 0 + ans;
			System.out.println("Ans: " + ans);
			carry=1;
		}

		else if(sum==3)
		{
			System.out.println("Sum = 3: " );
			ans = 1 + ans;
			System.out.println("Ans: " + ans);
			carry=1;
		}
		else
		{
			System.out.println("ELSE: " );
			ans= (m+n+carry) + ans;
		}
	}

		System.out.print("result: " + ans);

	   }
	}