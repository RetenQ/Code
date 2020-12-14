package workIn20201031;

public class VolumeCalculator {

	public static void main(String[] args) {
		
		double h,r,rs,rx,r2,r3; 
		double v1,v2,v3,v4,v5,v ;
		double pi = Math.PI ;  
		//Setting
		
		
		//Get cylinder
		h = 24.3293 ; 
		r = 23.5 ;
		r2 = Math.pow(r,2);
		v1 = pi*r2*h;
		System.out.println("V1 = "+v1);
		
		h = 31.0; 
		r = 17.39 ;
		r2 = Math.pow(r,2);
		v3 = pi*r2*h;
		System.out.println("V3 = "+v3);
		
		h = 11.9999 ; 
		r = 4.39 ;
		r2 = Math.pow(r,2);
		v5 = pi*r2*h;
		System.out.println("V5 = "+v5);
		
	//Get cone
		h = 23.16 ; 
		rx = 23.5 ; 
		rs = 17.39 ; 
		r2 = Math.pow(rx, 2) ; 
		r3 = Math.pow(rs, 2) ;
		v2 = (pi * (r2 + r3 + rx * rs) * h) / 3 ; 
		System.out.println("V2 = "+v2);
				
		h = 20.0 ; 
		rx = 17.39 ; 
		rs = 4.39 ; 
		r2 = Math.pow(rx, 2) ; 
		r3 = Math.pow(rs, 2) ;
		v4 = (pi * (r2 + r3 + rx * rs) * h) / 3 ; 
		System.out.println("V4 = "+v4);
				
		//SUM
		v= v1+v2+v3+v4+v5 ; 
		System.out.println("Finally, we get the sum of v is  "+v);

		
		
	}

}
