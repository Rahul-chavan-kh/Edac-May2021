public class Pattern1
{
public static void main(String args[])
{
for(int i=1;i<=5;i++)
{
for(int j=1;j<=i;j++)
{
System.out.print(j+" ");
}
System.out.println(" ");
}
}
}

/*

C:\Kharghar\Assign\Assign2>javac Pattern1.java

C:\Kharghar\Assign\Assign2>java Pattern1
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5

*/