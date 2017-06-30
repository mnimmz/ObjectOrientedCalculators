package evenodd;

import java.util.Scanner;

public class WhichIsIt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		ChooseEorO resultsmethod = new ChooseEorO();
		
		Scanner randomclass = new Scanner (System.in);
		
		System.out.println("Enter 1 for even or 2 for odd:");
		int x = randomclass.nextInt();		
			
		if (x == 1){
			
			resultsmethod.evenanswer();
		}
		
		else if (x == 2) {
			
			resultsmethod.oddanswer();
		}
		
		else {
			
		}
		
			
			
		}
	
		
	}

