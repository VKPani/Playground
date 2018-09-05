import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class datFormmater {
	
	public static void main(String args[]) throws ParseException
	{
		Scanner sc= new Scanner(System.in);
		String inpTimestamp= sc.nextLine();
		SimpleDateFormat inpFormat = new SimpleDateFormat("hh:mm:ssaa");
		Date parsreInp = inpFormat.parse(inpTimestamp);
		
		SimpleDateFormat outFormat = new SimpleDateFormat("HH:mm:ss");
		String output = outFormat.format(parsreInp);		
		System.out.println(output);
	}

}
