package arithmetic;

public class Equation3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int y = 7;
		   int preIncrementNum = ++y;
		   int preDecrementNum = --y;
		   int postIncrementNum1 = y++;
		   int postDecrementNum2 = y--;
		   int equation = y++ - --y + ++y - y--;
		   System.out.println("equation :" + equation);
	}

}
