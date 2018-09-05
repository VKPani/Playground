import java.util.Scanner;

public class birthdayChoclate {
	public static void main(String args[]) 
	{
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int choc[] = new int[size];
		int m = 0;
		int d = 0;
		int sum = 0;
		int counter = 0;
		for (int i = 0; i < size; i++)
			choc[i] = sc.nextInt();
		d = sc.nextInt();
		m = sc.nextInt();
		for (int i = 0; i < size - m + 1; i++){
			sum = 0;
			for (int j = m - 1; j >= 0; j--)
				sum = sum + choc[i + j];
			if (sum == d)
				++counter;
		}
		System.out.println(counter);
		sc.close();
	}

}


