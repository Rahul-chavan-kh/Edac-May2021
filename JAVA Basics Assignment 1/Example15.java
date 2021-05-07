import java.util.*;
public class Example15
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter value of a");
int a = sc.nextInt();
System.out.println("Enter value of b");
int b = sc.nextInt();

System.out.println("value of a is :"+a);
System.out.println("value of b is :"+b);

int temp=a;
a=b;
b=temp;

System.out.println("After swapping values are...... ");
System.out.println("value of a is :"+a);
System.out.println("value of b is :"+b);
}
}