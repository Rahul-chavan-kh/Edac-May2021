import java.util.*;
public class TwoDArr {

	public static void main(String[] args) {
	
	int i,j;
	int a[][]=new int[2][2];
	Scanner sc=new Scanner(System.in);
	
System.out.println("Enter array values:");
    
	for(i=0;i<2;i++)
	{
	for(j=0;j<2;j++)
	{
	a[i][j]=sc.nextInt();
	}
	}
	
	for(i=0;i<2;i++)
	{
	for(j=0;j<2;j++)
	{
	System.out.print(a[i][j]+"\t");
	}
	System.out.println("");
	}
    
    
	
}
}	