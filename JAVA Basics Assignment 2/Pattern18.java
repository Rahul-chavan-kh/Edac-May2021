class Pattern18{
public static void main(String args[]){
int A=64;
for(int i=5;i>=1;i--)
{
for(int j=1;j<=i;j++)
{
System.out.print((char)(A+j)+" ");
}
System.out.println();
}
}
}


/*
C:\Kharghar\Assign\Assign2>javac Pattern18.java

C:\Kharghar\Assign\Assign2>java Pattern18
A B C D E
A B C D
A B C
A B
A
*/