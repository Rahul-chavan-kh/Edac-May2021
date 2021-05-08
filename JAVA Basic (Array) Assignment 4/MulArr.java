import java.util.*;
public class MulArr {

	public static void main(String[] args) {
	
	int i,j;
	int a[][]=new int[2][2];
	int b[][]=new int[2][2];
	int c[][]=new int[2][2];
	
	
	Scanner sc=new Scanner(System.in);
	
System.out.println("Enter Matrix 1 values:");
    
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
    
 System.out.println("Enter Matrix 2 values:");
    
	for(i=0;i<2;i++)
	{
	for(j=0;j<2;j++)
	{
	b[i][j]=sc.nextInt();
	}
	}
	
	for(i=0;i<2;i++)
	{
	for(j=0;j<2;j++)
	{
	System.out.print(b[i][j]+"\t");
	}
	System.out.println("");
	}   

System.out.println("MULTIPLICATION of two matrix :");

    for(i=0;i<2;i++)
    {
	for(j=0;j<2;j++)
	{
	for(int k=0;k<2;k++)
	{
	c[i][j]=a[i][k]*b[k][j];
	System.out.print(c[i][j]+" ");
	}
	}
	System.out.println("");
	}	
}
}	