import java.util.Scanner;
public class countingValleys {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int steps=sc.nextInt();
		sc.nextLine();
		String str=sc.nextLine();
		char []arr=str.toCharArray();
		int direction=0;
		int counter=0;
		for(int i=0;i<steps;i++)
		{
			if(arr[i]=='D'){
				--direction;
				counter=(direction==-1)?++counter:counter;
			 }
			else ++direction;
			
		}
		System.out.println(counter);		
	}

}
