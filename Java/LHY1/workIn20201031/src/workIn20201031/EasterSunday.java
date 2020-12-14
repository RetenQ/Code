package workIn20201031;

public class EasterSunday {

	public static void main(String[] args) {
		
		int y = 2020 ;
		//STEP1
		int s1 = y %19 ;
		//STEP2
		int  s2_1 = y / 100 ;
		int  s2_2 = y % 100 ; 
		//STEP3
		int s3_1 = s2_1 / 4 ;
		int s3_2 = s2_1 % 4 ;
		//STEP4
		int s4 = (s2_1 * 8 + 13) /25 ;
		//STEP5 
		int s5 = (s1 * 19 +s2_1-s3_1-s4 +15)%30 ; 
		//STEP6 
		int s6_1 = s2_2 /4 ; 
		int s6_2 = s2_2 %4 ;
		//STEP7
		int s7 =(s1+11*s5)/319 ;
		//STEP8
		int s8 = (s3_2 *2 + 2*s6_1 - s6_2 - s5+s7 +32)%7 ;
	    //STEP9
		int s9 = (s5 -s7 +s8 + 90)/25 ; 
		//STEP10	
		int s10 = (s5 -s7 + s8 +s9 +19)%32 ;
        
        //FINAL
		int day = s10;
		int mon = s9 ; 
        
		System.out.println("The EasterSunday of 2020 is"+"2020 \n"+mon+"   Month\n "+day+"  Day\n");
		
	}

}
