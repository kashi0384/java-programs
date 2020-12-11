
public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a = 10, b = 30;

	        System.out.println("Before swap");
	        System.out.println("First number = " + a);
	        System.out.println("Second number = " + b);

	       
	        int temporary = a;

	        
	        a = b;


	        b = temporary;

	        System.out.println("After swap");
	        System.out.println("First number = " + a);
	        System.out.println("Second number = " + b);
	}

}
