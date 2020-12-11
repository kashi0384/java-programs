package arithmetic;

public class Equation2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a = 5;
		   int b = 10;
		   int preincrementNum1 = ++a;
		   int preincrementNum2 = ++b;
		   int postIncrementNum1 = a++;
		   int postIncrementNum2 = b++;
		   int equation = a+b+a++ +b++ + ++a+ ++b;
		   System.out.println("equation :" + equation);
	}

}
