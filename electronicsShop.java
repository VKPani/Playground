import java.util.Scanner;

public class electronicsShop {
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		long amt=sc.nextInt();
		int n=sc.nextInt();
		int m=sc.nextInt();
		long []arrKey=new long[n];
		for(int i=0;i<n;i++)
			arrKey[i]=sc.nextInt();
		long []arrMou=new long[m];
		for(int j=0;j<m;j++)
			arrMou[j]=sc.nextInt();
		long max=-1;
		for(int i=0;i<n;i++)
			for(int j=0;j<m;j++)
				max=((arrKey[i]+arrMou[j])<=amt && (arrKey[i]+arrMou[j])>max)?(arrKey[i]+arrMou[j]):max;
		System.out.println(max);
		sc.close();
	}

}
