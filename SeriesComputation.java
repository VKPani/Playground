import java.util.Scanner;

public class SeriesComputation {

	public static void main(String args[]) {
		Scanner inp = new Scanner(System.in);
		int q = inp.nextInt();
		int a[] = new int[q];
		int b[] = new int[q];
		int n[] = new int[q];
		for (int i = 0; i < q; i++) {
			a[i] = inp.nextInt();
			b[i] = inp.nextInt();
			n[i] = inp.nextInt();
		}
		inp.close();
		int series = 0;
		for (int i = 0; i < q; i++) {
			for (int iN = 0; iN < n[i]; iN++) {
				if (iN == 0)
					series = a[i] + b[i];
				else
					series = (int) (series + Math.pow(2, iN) * b[i]);
				System.out.print(series + " ");
			}
			System.out.println("");
			series = 0;
		}

	}

}
