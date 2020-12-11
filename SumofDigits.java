
public class SumofDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0, num=123;
		   
		   do
		   {
			sum+=(num%10);
			num/=10;
		   }
		   while(num!=0);
		
		   
		   System.out.println("sum is:" + sum);
	}

}
