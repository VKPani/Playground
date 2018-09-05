import java.util.Scanner;
public class gridSearch {
	
	static Scanner sc = new Scanner(System.in);
public static String checkPattern()	
{
	int m=sc.nextInt();
	int n=sc.nextInt();
	sc.nextLine();
	int [][]primaryArray=new int[m][n];
	 String str="";
	 char []chArray=new char[n];
	for(int i=0;i<m;i++){
		str=sc.nextLine();
    	chArray=str.toCharArray();
		for(int j=0;j<n;j++){
			
			primaryArray[i][j]=Character.getNumericValue(chArray[j]);
		
		}
    }
		
    int a=sc.nextInt();
    int b=sc.nextInt();
    int [][]secondaryArray=new int[a][b];
    sc.nextLine();
    str="";
    chArray=new char[b];
    for(int i=0;i<a;i++){
    	str=sc.nextLine();
    	chArray=str.toCharArray();
		for(int j=0;j<b;j++)
			secondaryArray[i][j]=Character.getNumericValue(chArray[j]);
    }
    Boolean flag=true;
    int i=0;
    int j=0;
    int k=0;
    int l=0;
    for(i=0;i<=(m-a);i++){
    	for(j=0;j<=(n-b);j++){
    		for( k=0;k<a && flag && i+k<m;k++)
				for( l=0;l<b && flag && l+j<n;l++)
						if(primaryArray[i+k][j+l]-secondaryArray[k][l]!=0) flag=false;
		if(flag) return "YES"; else flag=true;
    }
    }
    return "NO";
}
	
public static void main(String []args){
	String temp="";
	String retValue="";
	sc=new Scanner(System.in);
	int cnt=sc.nextInt();
	for(int i=0;i<cnt;i++){
	temp=checkPattern();
	retValue=retValue+temp+"\n";
	}
	System.out.print(retValue);
	sc.close();
}
}
