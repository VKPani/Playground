import java.text.DecimalFormat;
import java.util.Scanner;

public class calculateFraction {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int arr[] = new int[size];
		int pos = 0;
		int neg = 0;
		int zero = 0;
		for (int i : arr) {
			arr[i] = sc.nextInt();
			if (arr[i] < 0)
				++neg;
			else if (arr[i] > 0)
				++pos;
			else if (arr[i] == 0)
				++zero;
		}
		DecimalFormat df = new DecimalFormat("#.######");
		System.out.println(df.format((double) pos / (double) size));
		System.out.println(df.format((double) neg / (double) size));
		System.out.println(df.format((double) zero / (double) size));

	}

}
