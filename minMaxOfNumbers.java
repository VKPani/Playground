import java.util.Scanner;

public class minMaxOfNumbers {
	
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int size=5;
		long arr[]=new long[size];
		long sum=0;
		long min=0;
		long max=0;
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextLong();
			if(i==0)
			{
				min=arr[i];
				max=arr[i];
			}
			else
			{
				if(arr[i]>=max)
					max=arr[i];
				if(arr[i]<=min)
					min=arr[i];
							
			}			
			
			sum=sum+arr[i];
		}
		
		System.out.println((sum-max)+" "+(sum-min));
		sc.close();
		
	}

}
