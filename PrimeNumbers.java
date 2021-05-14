package Lab1;
import java.util.Scanner;
public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int flag;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		for(int i=2; i<num ;i++)
		{
			flag = 0;
			for(int j=2;j<i;j++)
			{
				if(i%j == 0)
					flag = 1;
			}
			if(flag == 0)
				System.out.println(i);
		}
		sc.close();
	}

}
