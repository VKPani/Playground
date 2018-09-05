import java.util.Scanner;
public class dayOfProgrammer {

	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int year=sc.nextInt();
		String str="";
		if(year==1918)
			str="26.09."+year;
		else if(year%400==0 || (year%4==0 && year%100!=0))
			str="12.09."+year;
		else
			str="13.09."+year;
		System.out.println(str);
		
	}
}
