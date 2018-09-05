import java.math.BigInteger;
import java.util.Scanner;
public class factorial {
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		long n=sc.nextInt();
		BigInteger res=new BigInteger("1");
		for(int i=1;i<=n;i++) res=res.multiply(new BigInteger(String.valueOf(i)));		
		System.out.println(res);
	}

}
