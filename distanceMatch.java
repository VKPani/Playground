import java.util.Scanner;

public class distanceMatch {

	public static void main(String args[]) throws ArithmeticException
	{
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int av=sc.nextInt();
		int b=sc.nextInt();
		int bv=sc.nextInt();
		
		String res = (av-bv>0 || bv-av>0)?(((b-a)%(av-bv)==0 && ((b-a)/(av-bv))>=1)?"YES":"NO"):"NO";
		System.out.println(res);
	}
}
