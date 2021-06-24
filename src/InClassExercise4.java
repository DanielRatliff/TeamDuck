/*
 * Kevin Ong
 * InClassExercise4
 * June 24 2021
 * */
public class InClassExercise4 {
	public static void main(String[] args) {
		int[] intArray = new int[50]; //Create array
		int i = 0; //Set i =0 
		while (i < intArray.length -1) { //While loop from 1-50
			intArray[i] = i+1; //Set value to i + 1
			i++; //Increase i
		}
		i = 0; //Reset i counter to 0
		do {
			if ((i+1)%2 == 1) // Check if i is odd
			{
				intArray[i] += 5; //If i is odd, add 5 to the value
			} 
			i ++; //increment i
		}while ( i < 50); //do while loop ends while i < 50
		
		for(i=0;i < 50; i++) { //for loop from 0 - 49
			if ( intArray[i]%4 == 0 && intArray[i]%6 == 0) { //Check if intArray[i] is divisible by 4 and 6
				System.out.println("FOUR!!SIX!!!"); //Print FOUR!!SIX!!!
			}else if (intArray[i]%4 == 0 ) { //Check if intArray[i] is divisible by 4 and 6
				System.out.println("FOUR!!"); //Print FOUR!!
			}else if (intArray[i]%6 == 0) { //Check if intArray[i] is divisible by 4 and 6
				System.out.println("SIX!!!"); //Print SIX!!!
			}else {
				System.out.println(intArray[i]); //Print value
			}
				
		}
	}
}
