package workIn1108;

public class SquareIntersection {

	public static void main(String[] args) {
	//Square1
		int x1 =6 ;int y1 = 7;int l1 = 3 ;
		
	//Square2
	int x2 =4 ;int y2 = 5;int l2 = 7 ;
	
	
	int d_x = x1-x2;int d_y = y1 - y2;
	double d_x2= Math.pow(d_x, 2);
	double d_y2= Math.pow(d_y, 2);
	double d = Math.sqrt(d_x2 + d_y2);
	System.out.println("两个正方形中心的距离是： " + d);
	
	double r = (l1+l2)/2 ; 
	
  if(r>=d_x & r>=d_y) {
	  if(l1>l2) {
		  if(d_x<l1/2 &d_y<l1/2) 	System.out.println("Square1 contains Square2 " );
		  else System.out.println("Square1 intersects with Square2" );

	  }else
		  if(d_x<l2/2 &d_y<l2/2) 	System.out.println("Square2 contains Square1 " );
		  else System.out.println("Square1 intersects with Square2" );	  
	  
  }else  System.out.println("The two squares are apart from each other." );

	
	}

}
