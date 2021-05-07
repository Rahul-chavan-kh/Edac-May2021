import java.util.*;
public class Example7
{
public static void main(String args[])
{
int num,i;
Scanner sc= new Scanner(System.in);
System.out.println("Enetr a number : ");
num=sc.nextInt();
for(i=1;i<=10;i++)
{
	
System.out.println(num+"X"+i +"="+num*i);
}
}
}