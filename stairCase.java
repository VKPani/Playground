import java.util.Scanner;

public class stairCase {

	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		int steps = sc.nextInt();
		for (int i = steps; i >= 0; i--) {
			for (int j = steps; j > 0 ; j--) {
				if (steps - j >= i) { 
					System.out.print("#");
				} else {
					if (i < steps)
						System.out.print(" ");
				}
			}
            if (i < steps && i > 0)
				System.out.println("");

		}

		sc.close();
	}

}
