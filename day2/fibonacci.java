package week1.day2;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value = 10;
		int i = 0;
		int j = 1;
		int k;
		for (int x=0;x<value-1;x++)
		{
			if ( x==0)
			{
				System.out.print(i +"," + j);
				
			}
			k = i + j;
			System.out.print("," + k);
			i=j;
			j = k;
			//System.out.println(j);
		}
	}

}