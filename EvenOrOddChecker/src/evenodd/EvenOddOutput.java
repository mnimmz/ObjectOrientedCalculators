package evenodd;

import java.util.Scanner;

public class EvenOddOutput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public void eoOutput(){
		
		Scanner evenorodd = new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int x = evenorodd.nextInt();
		
		if (x % 2 == 0){
			System.out.println("The number is EVEN.");
		}
		
		else {
			
			System.out.println("The number is ODD.");
		}
	}

}
