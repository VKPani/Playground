import java.util.Scanner;
public class bonAppetite {
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int []items=new int[n];
		int sum=0;
		for(int i=0;i<n;i++)
		{	
			items[i]=sc.nextInt();
			if(i!=k) sum=sum+items[i];
		}
		int splitCharged=sc.nextInt();
		int splitActual=sum/2;
		if(splitCharged>splitActual)
			System.out.println(splitCharged-splitActual);
		else
			System.out.println("Bon Appetit");
		
	}
}
