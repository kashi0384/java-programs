
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("illustrating the factorial of a number using for loop");
		
		int fact=1,i;
		
		for(i=1; i<=9; i++) {
			fact*=i;
			
			//fact=fact*i
			//fact=1*1--->fact=1
			//fact=1*2--->fact=2
			//fact=2*3--->fact=6
			//fact=6*4--->fact=24
			//fact=24*5--->fact=120
			//fact=120*6--->fact=720
			//fact=720*7--->fact=5040
			//fact=5040*8--->fact=40320
			//fact=40320*9--->fact=362880
			
			
		}
		System.out.println("factorial of given number is" + fact);
		
	}

}
