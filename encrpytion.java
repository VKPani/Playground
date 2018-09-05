import java.util.Scanner;
public class encrpytion {
public static void main(String []args){
	Scanner sc=new Scanner(System.in);
	String str=sc.nextLine();
	String strStrip=str.replace(" ", "");
	int len=strStrip.length();
	int size = (int)(Math.ceil((float) Math.sqrt(len)));
	char []arrSingle=strStrip.toCharArray();
	char[][] arrMulti=new char[size][size];
	int itr=0;
	for(int i=0;i<size;i++)
	{
		for(int j=0;j<size;j++)
		{
			if(itr<len){arrMulti[i][j]=arrSingle[itr];}
			else
				arrMulti[i][j]=' ';
				            ++itr;
		}
		
	}
	String str1="";
	for(int i=0;i<size;i++)
		for(int j=0;j<size;j++){
			if(!Character.isSpace(arrMulti[j][i]))
			{
				if(j==0 && i>0)
					str1=str1+" "+arrMulti[j][i];
				else
					str1=str1+arrMulti[j][i];
			}
		}
	System.out.println(str1);
}
}
