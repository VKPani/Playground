import java.util.Scanner;

public class divisibleSumPairs {

	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int k=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++)
			arr[i]=sc.nextInt();
		int counter=0;
		for(int i=size-1;i>=0;i--)
			for(int j=i-1;j>=0;j--)
					counter=((arr[i]+arr[j])%k==0)?++counter:counter;
	    System.out.println(counter);
		
	}
}
