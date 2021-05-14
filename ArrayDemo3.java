package Lab2;
import java.util.*;
public class ArrayDemo3 {

	public int [] getSorted(int[] arr)
	{
		int n = arr.length;
		for(int i=0;i<n;i++)
		{
			
			StringBuffer s = new StringBuffer(String.valueOf(arr[i]));
			arr[i]= Integer.parseInt(String.valueOf(s));

			
		}
		System.out.println("The array in reversed order is:");
		for(int i=arr.length-1;i>=0;i--) {
		System.out.println(arr[i]);
		}
		Arrays.sort(arr);
		System.out.println("The array in sorted order is:");
		return arr;
		
		
	}

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the array ");
		
		n = sc.nextInt();
		int [] arr = new int[n];
		System.out.println("Enter the element of the array ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		ArrayDemo3 ad = new ArrayDemo3();
		int [] result_array = new int[arr.length];
		result_array = ad.getSorted(arr);
		for(int i=0;i<result_array.length;i++)
		{
			System.out.println(result_array[i] + " ");
		}
		sc.close();

	}

}