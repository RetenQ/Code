package lab1213;

public class task1 {

	public static void main(String[] args) {
		String S1="1022473578476949426110832338899437170338449409627474102214022150928";
		//Create a String to save the data and we will count frequency of occurrence of number by it		
		int len=S1.length();
		//get the length of s1 and we can find the size of a array by it
		
		char[] S=new char [len];
		//create a char array
		
		for(int c=0;c<S1.length();c++)
		{
			S[c]=S1.charAt(c);
			//make evert number(char) in the String to the array S
		}
		
		int [] A=new int [10];
		for(int a=0;a<S1.length();a++)
		{
			//make a array A to count the frequency of occurrence of number 
			if(S[a]=='0')A[0]++;
			if(S[a]=='1')A[1]++;
			if(S[a]=='2')A[2]++;
			if(S[a]=='3')A[3]++;
			if(S[a]=='4')A[4]++;
			if(S[a]=='5')A[5]++;
			if(S[a]=='6')A[6]++;
			if(S[a]=='7')A[7]++;
			if(S[a]=='8')A[8]++;
			if(S[a]=='9')A[9]++;
			}
			
			int maxc =0;	
			for (int i=1; i<10; i++)
			{
			if (A[i] >maxc) maxc = A[i];
			//Find the biggest count 
			}
			
			
			//print ,and we print form "high" to "low"
			
			for(len=maxc;len>0;len--)
			{
				for(int y=0;y<10;y++)
				{
					if(A[y]>=len) System.out.print("["+y+"]  ");
						//if the count of this number is bigger than this row, we will print it
					else System.out.print("     ");
					   //if not ,we just put blank		
					
					//every time we get the end of this row,we need Line break,and when y=9,we do it
					if(y==9) System.out.println();
			 }

		}
	}

}