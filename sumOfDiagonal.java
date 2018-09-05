
import java.util.*;

public class sumOfDiagonal {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int a[][] = new int[n][n];
		for (int a_i = 0; a_i < n; a_i++) {
			for (int a_j = 0; a_j < n; a_j++) {
				a[a_i][a_j] = in.nextInt();
			}
		}
		int sum = 0;
		int sum1 = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == j) {
					sum = sum + a[i][j];
					sum1 = sum1 + a[n - i - 1][j];
				}

			}

		}
		if (sum >= sum1)
			System.out.println(sum - sum1);
		else
			System.out.println(sum1 - sum);
	}

}
