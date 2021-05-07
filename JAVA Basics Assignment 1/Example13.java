import java.util.*;
public class Example13
{
public static void main(String args[])
{

Scanner sc =new Scanner(System.in);
System.out.println("Enter Length and width : ");
float length1 = sc.nextFloat(); 
float width1 = sc.nextFloat(); 
float Area= length1*width1;
float perimeter= 2*(length1 + width1);
System.out.printf("Area is %.0f * %f = %.2f\n",length1,width1,Area);
System.out.printf("perimeter is 2 * (%f * %f) =%.2f",length1,width1,perimeter);
}
}
