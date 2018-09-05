import java.util.Iterator;
import java.util.Hashtable;
import java.util.Scanner;
import java.util.Set;

public class stockMerchant {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int key = 0;
		String skey = "";
		int temp = 0;
		Hashtable stocks = new Hashtable(size);
		for (int i = 0; i < size; i++) {
			key = sc.nextInt();
			skey = Integer.toString(key);
			if (stocks.get(skey) != null) {
				temp = ((Integer) stocks.get(skey)).intValue();
				stocks.put(skey, new Integer(key + temp));
			} else
				stocks.put(skey, new Integer(key));

		}
		Set<String> sets = stocks.keySet();
		Iterator itr = sets.iterator();
		String str = "";
		int counter = 0;

		while (itr.hasNext()) {
			str = (String) itr.next().toString();
			counter = counter + ((Integer.parseInt(stocks.get(str).toString()) / Integer.parseInt(str)) / 2);
		}

		System.out.println(counter);

	}
}
