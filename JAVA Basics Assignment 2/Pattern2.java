public class Pattern2
{
public static void main(String args[])
{
int A=64;
for(int i=1;i<=5;i++)
{
for(int j=1;j<=i;j++)
{
System.out.print((char)(A+j) +" ");
}
System.out.println(" ");
}
}
}

/*

C:\Kharghar\Assign\Assign2>javac Pattern2.java

C:\Kharghar\Assign\Assign2>java Pattern2
A
A B
A B C
A B C D
A B C D E

*/