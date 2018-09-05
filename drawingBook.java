import java.util.Scanner;
public class drawingBook {
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int p=sc.nextInt();
		int turns=0;
		turns=(p<=n/2)?p/2:((n%2==0)?(n-p+1)/2:(n-p)/2);
		System.out.println(turns);	
	}
}
