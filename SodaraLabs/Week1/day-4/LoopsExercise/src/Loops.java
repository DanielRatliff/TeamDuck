public class Loops {
	public static void main(String[] args) {
		
		//Create a while loop that stores the numbers one through fifty in an array.
		//Start
		int[] arr = new int [50];		
		int i = 0;		
		while (i < 50 ) {
			arr[i] = i+1;
			//System.out.println(arr[i]);
			i++;
		}
		//End
		
		//Use a do while loop to add five to all the odd numbers in the array.
		//Start
		i = 0;		
		do {
			if (arr[i] % 2 !=0) {
				arr[i]= arr[i]+5;
			}
			//System.out.println(arr[i]);
			i++;
		}
		while(i<arr.length -1);
		//End
				
		//Use a for loop to print each element of the array. Unless that element is a multiple of four or six. 
		//If it's a multiple of four print FOUR!!. If it's a multiple of six print SIX!!!. 
		//If it's a multiple of both print FOUR!!SIX!!!.
		//Start
		for (i = 0; i < arr.length-1; i++ ) {			
			if ((arr[i] % 4 == 0) && (arr[i] % 6 == 0) ) {
				System.out.println("FOUR!!SIX!!!");
			} else if(arr[i] % 4 == 0) {
				System.out.println("FOUR!!");				
			} else if(arr[i] % 6 == 0) {
				System.out.println("SIX!!!");				
			} else {
				System.out.println(arr[i]);
			}			
		}
		//End
	}
}
