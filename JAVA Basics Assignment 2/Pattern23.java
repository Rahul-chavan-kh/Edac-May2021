class Pattern23{
public static void main(String args[]){
for(int i=1;i<=5;i++)
{
for(int j=1;j<=i;j++)
{
System.out.print(" ");
}
for(int k=5;k>=i;k--)
{
System.out.print("*");
}
for(int l=4;l>=i;l--)
{
System.out.print("*");
}
System.out.println();
}
}
}

/*

C:\Kharghar\Assign\Assign2>javac Pattern23.java

C:\Kharghar\Assign\Assign2>java Pattern23
 *********
  *******
   *****
    ***
     *
	 
*/	 