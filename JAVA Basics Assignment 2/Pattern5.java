public class Pattern5
{
public static void main(String args[])
{
int A=64;
for(int i=1;i<=5;i++)
{
for(int j=1;j<=i;j++)
{
System.out.print((char)(A+i) +" ");
}
System.out.println(" ");
}
}
}

/*

C:\Kharghar\Assign\Assign2>javac Pattern5.java

C:\Kharghar\Assign\Assign2>java Pattern5
A
B B
C C C
D D D D
E E E E E

*/