package week1.day2;

public class primeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input=89;
		boolean pNumber = true;
		for (int i = 2;i<input; i++)
		{
			if (input%i == 0)
			{
				pNumber = false;
				System.out.println( input + " is not prime number");
				break;
			}
		}
		if (pNumber)
		{
			System.out.println( input + " is prime Number");
		}
	}

}
