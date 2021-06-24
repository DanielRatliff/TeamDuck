import java.util.Arrays;
public class loopExercise {
	public static void main(String[]Args) {
		//create instaces of necessary arry/variables
		
		int[] testarray = new int[50];
		int i = 0;
		
		// while-loop to populate the array with necessary values ie(1-50)
		while(i!=50) {
			testarray[i] = i+1;
			i++;
		}
		//printing array to make sure population was a success
		System.out.println(Arrays.toString(testarray));
		//reseting the loop tracking variable
		i=0;
		//do-while-loop to modify odd values to 5
		do {
			if(!(testarray[i]%2==0)) {
				testarray[i]+=5;
			}
			i++;
		}while(i!=testarray.length);
		//printing array to test if the modification was correctly carried out.
		System.out.println(Arrays.toString(testarray));
		//creating a placeholer String variable for fenceposting to make output look like previous prints
		// create it x to hold array value in order to make boolean expressions easier
		String ar = "[";
		int x;
		//for-loop to print array with conditions
		for(int y=0;y< testarray.length; y++){
			x=testarray[y];
			if(!((x%4==0)||(x%6==0))) {
				ar += ""+x;
			}else if(x%4==0) {
				if(x%6==0) {
					ar+= "FOUR!!SIX!!!";
				}else {
					ar+="FOUR!!";
				}
				
			}else {
				ar+="SIX!!!";
			}
			if(y==26) {
				ar+="\n";
			}
			if(y!=testarray.length-1) {
				ar+=", ";
			}else {
				ar+="]";
			}
		}
		System.out.println(ar);
	}
}
