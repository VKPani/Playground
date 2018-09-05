import java.util.Scanner;
public class breakingTheRecords {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int score=0;
		int max=0;
		int maxCount=0;
		int min=0;
		int minCount=0;		
		for(int i=0;i<size;i++){
		     score = sc.nextInt();
		     if(i==0){max=score; min=score;}
			else{if(score>max){max=score; ++maxCount;}if(score<min){min=score; ++minCount;}}
		}
		System.out.println(maxCount+" "+minCount);
	}
}
