package workIn1108;

public class ScheduleValidator {

	public static void main(String[] args) {

		
		String a_1s= new String("1215");
		int a1s = Integer.parseInt(a_1s);
		
		String a_1e= new String("2030");
		int a1e = Integer.parseInt(a_1e);
		
		String a_2s= new String("0820");
		int a2s = Integer.parseInt(a_2s);
		
		String a_2e= new String("1340");
		int a2e = Integer.parseInt(a_2e);


		
		 if(a1s<a2s) { 
				if(a1e<a2s) System.out.println("Perfectly scheduled!");
				else  System.out.println("Appointment1 - Appointment2");
			  }
		 
		 
		 
		 else if(a1s>=a2s) {
			 if(a2e<a1s) System.out.println("Perfectly scheduled!");
		   else  System.out.println("Appointment2 - Appointment");
		 }
		
	}

}
