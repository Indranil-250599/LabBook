package Lab2;
import java.util.*;
public class Excercise1 {

	
	
		 static int getExcercise1(int arr[],int n)
		 {
			 int i,j,t;
			 n=arr.length;
			 for(i=0;i<n;i++) {
				 for(j=0;j<n;j++)
				 {
					 if(arr[i]>arr[j])
					 {
						 t=arr[i];
						 arr[i]=arr[j];
						 arr[j]=t;
					 }
				 }
			 }
			 return arr[2];
		 }
		 
			public static void main(String[] args) {
				Scanner sc=new Scanner(System.in);
				int i;
				System.out.println("Enter the no. of elements");	int n=sc.nextInt();
				int a[]=new int[n];
				System.out.println("enter the elements of array:-");
				for(i=0;i<n;i++)
				{
					a[i] = sc.nextInt();
				}
				Excercise1  num= new Excercise1();
				
				 num.getExcercise1(a,n);
			
				System.out.println(" "+a[n-2]);
				
			sc.close();	
			}
		}