import java.util.*;
public class Example11
{
public static void main(String args[])
{

Scanner sc =new Scanner(System.in);
System.out.println("Enter Radius : ");
double radius = sc.nextDouble(); 
double Perimeter=2*Math.PI*radius;
double Area=Math.PI*radius*radius;
System.out.println("Perimeter is = "+Perimeter);
System.out.println("Area is = "+Area);
}
}