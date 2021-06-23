//Kevin Ong
//Working on Lab 7 and 8
//6/23/2021

public class Lab_ConditionalBlocks{
	public static void main(String[] args) {
		
		/*This is lab Writing conditional Block Variables*/
		boolean b = true;
		/*This is the variant conditional Block Variables*/
		boolean firstCondition = true;
		boolean secondCondition = true;
		
		System.out.println("This is Kevin Ong working on Lab 7 and 8. \n" );
		System.out.println("This covers Writing Conditional Blocks and Variant Conditional Blocks. \n");
						
		if (b) {
			System.out.println("Inside the if-statement");		
			}
		System.out.println("Outside of the if-statement");
		/* This is lab Variant Conditional Blocks*/
		System.out.println("b = " + b);
		
		
	    if (firstCondition){
	        System.out.println("inside the if-statement");
	
	        if (secondCondition){
	          System.out.println("inside the nested if-statement");
	        }
	      }else {
	        System.out.println("inside the else-statement");
	    }
	
	      System.out.println("Outside of the if-statement");
	}
}
