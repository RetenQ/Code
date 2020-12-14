package workIn20201031;

public class WCTCalculator {

	public static void main(String[] args) {
		//V=20m/h  T=31.4
		double v = 20;
		double T_f = 31.4;
	    double T_wc1 ; //Fahrenheit
	    double T_wc2 ; //Celsius
	    double v1 = Math.pow(v,0.16);
	    
	    T_wc1 = 35.74+0.6215 * T_f-35.75*v1+0.4275 * T_f * v1;
	    if(v<2)
	    {
	    	System.out.println("Error");

	    }else if(T_wc1>-51 & T_wc1<41)
	    {
		    T_wc2 = (T_wc1 - 32)*5/9 ; 
	    	System.out.println("Wind-chill temperature in degrees Celsius is " + (T_wc2));
	    }
	    
	    else {
	   
  	         System.out.println("Error,the formula does NOT work when  the reported temperature is below -51 degree Fahrenheit or above 41degrees Fahrenheit.");

	    }
	    

	}

}
