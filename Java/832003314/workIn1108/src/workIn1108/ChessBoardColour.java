package workIn1108;

public class ChessBoardColour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChessBoardColour cbc = new ChessBoardColour();
		cbc.checkColour('f',1);
		cbc.checkColour('G',7);
		cbc.checkColour('j',1);
	}
     
	private void checkColour (char letter,int number) {
		letter = Character.toUpperCase(letter);
		
          if(letter == 'A' ) {
		     if(number == 1 ||number == 3||number == 5||number == 7||number == 9) {
		    	System.out.println("Dark");
		     }else 	System.out.println("Light");
			
	}else if (letter == 'B' ) {
	     if(number == 1 ||number == 3||number == 5||number == 7||number == 9) {
		 System.out.println("Light");}
		 else System.out.println("Dark");
	}

	else if(letter == 'C' ) {
 		     if(number == 1 ||number == 3||number == 5||number == 7||number == 9) {
 		    	System.out.println("Dark");
 		     }else 	System.out.println("Light");
 			
 	}else if (letter == 'D' ) {
 	     if(number == 1 ||number == 3||number == 5||number == 7||number == 9) {
 		 System.out.println("Light");}
 		 else System.out.println("Dark");
 	}
    
 	else if(letter == 'E' ) {
 		     if(number == 1 ||number == 3||number == 5||number == 7||number == 9) {
 		    	System.out.println("Dark");
 		     }else 	System.out.println("Light");
 			
 	}else if (letter == 'F' ) {
 	     if(number == 1 ||number == 3||number == 5||number == 7||number == 9) {
 		 System.out.println("Light");}
 		 else System.out.println("Dark");
 	}
          
 	else if(letter == 'G' ) {
 		     if(number == 1 ||number == 3||number == 5||number == 7||number == 9) {
 		    	System.out.println("Dark");
 		     }else 	System.out.println("Light");
 			
 	}else if (letter == 'H' ) {
 	     if(number == 1 ||number == 3||number == 5||number == 7||number == 9) {
 		 System.out.println("Light");}
 		 else System.out.println("Dark");
 	} 
 	
 	else System.out.println("Wrong Code");
	   
	}
}
