
	
	import java.util.Scanner;

	public class highestCandle {
		
		
		public static void main(String args[])
		{
			Scanner sc=new Scanner(System.in);
			int size=sc.nextInt();
			long arr[]=new long[size];
			long sum=0;
			long counter=0;
			long max=0;
			for(int i=0;i<size;i++)
			{
				arr[i]=sc.nextLong();
				if(i==0)
				{
					max=arr[i];
					counter=1;
				}
				else
				{
					if(arr[i]>max)
					{						
						max=arr[i];
						counter=0;
					}
					if(arr[i]==max)
						++counter;
								
				}			
				
				
			}
			
			System.out.println(counter);
			sc.close();
			
		}

	}


