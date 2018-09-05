import java.util.Scanner;

public class sumOfArray {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size : ");
		int arrlength = sc.nextInt();
		long arr[] = new long[arrlength];
		System.out.println("Enter the the array elements :");
		sc.nextLine();
		long sum = 0;
		for (int i = 0; i < arrlength; i++) {
			arr[i] = sc.nextLong();

			sum = sum + arr[i];

		}

		System.out.println(sum);
	}

}
