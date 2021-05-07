public class Pattern3
{
public static void main(String args[])
{
for(int i=1;i<=5;i++)
{
for(int j=1;j<=i;j++)
{
System.out.print("*" +" ");
}
System.out.println(" ");
}
}
}

/*

C:\Kharghar\Assign\Assign2>javac Pattern3.java

C:\Kharghar\Assign\Assign2>java Pattern3
*
* *
* * *
* * * *
* * * * *

*/