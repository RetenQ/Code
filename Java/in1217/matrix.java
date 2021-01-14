package lecture13;

public class matrix {
	public static void main(String[] args) {
	int [][] a = {{8,1,2,2,9},{1,9,4,0,3},{0,3,0,0,7}};
    int r = a.length, c = a[0].length;
	double mean = 0, std = 0;
	int min = a[0][0], max = a[0][0];
	for(int i=0;i<r;i++)
		for(int j=0;j<c;j++) {
			min = min<a[i][j]? min:a[i][j];
		    max = max>a[i][j]? max:a[i][j];
		    mean+=a[i][j];
		   }
	mean/=(r*c);
		  
	for(int i=0;i<r;i++)
		for(int j=0;j<c;j++)
		    std += Math.pow((a[i][j]-mean), 2);
	
		  std = Math.pow(std, 0.5)/(r*c-1);
		  System.out.println("Min:"+min);
		  System.out.println("Max:"+max);
		  System.out.println("mean:"+mean);
		  System.out.println("std:"+std);
		 }
}
