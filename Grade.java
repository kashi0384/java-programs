
public class Grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
char grade='A';
		
		switch(grade) {
		
		case 'A' : System.out.println("your percentage is between 85 to 100");
				   break;
		case 'B' : System.out.println("your percentage is between 65 to 85");
				   break;
		case 'C' : System.out.println("your percentage is between 35 to 65");
				   break;
		case 'D' : System.out.println("your percentage is below 35");
				   break;
		default  : System.out.println("you need to enter the percentage between 0 to 100");	
				   break;
		}
	}

}
