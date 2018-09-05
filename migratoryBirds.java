import java.util.Scanner;
public class migratoryBirds {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int size=sc.nextInt();
		int birdType=0;
		int []counter={0,0,0,0,0};
		int maxBirdType=0;
		for(int i=0;i<size;i++){
			birdType=sc.nextInt();
            counter[birdType-1]++;
		}
		int max=counter[0];
		for(int j=1;j<5;j++)
			if(counter[j]>max){max=counter[j];maxBirdType=j+1;}
		System.out.println(maxBirdType);
	}
}
