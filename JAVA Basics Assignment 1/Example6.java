import java.util.*;
public class Example6
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter two numbers : ");
int a=sc.nextInt();
int b=sc.nextInt();

System.out.printf("%d + %d = %d \n",a,b,a+b);
System.out.printf("%d - %d = %d \n",a,b,a-b);
System.out.printf("%d * %d = %d \n",a,b,a*b);
System.out.printf("%d / %d = %d \n",a,b,a/b);
System.out.printf("%d mod %d = %d \n",a,b,a%b);

}
}