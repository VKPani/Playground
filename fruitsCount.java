import java.util.Scanner;
public class fruitsCount {
	public static void main(String args []){
		Scanner sc=new Scanner(System.in);
		int s=sc.nextInt();
		int t=sc.nextInt();
		int a=sc.nextInt();
		int b=sc.nextInt();
		int m=sc.nextInt();
		int n=sc.nextInt();
		int app=0;
		int appCount=0;
		int ora=0;
		int oraCount=0;
		for(int i=0;i<m;i++){
			app=sc.nextInt();
			appCount= (app+a)>=s && (app+a)<=t ?++appCount:appCount;
		}
		for(int i=0;i<n;i++){
			ora=sc.nextInt();
			oraCount= (ora+b)>=s && (ora+b)<=t ?++oraCount:oraCount;
		}	
		System.out.println(appCount+"\n"+oraCount);
		sc.close();	
	}
}
