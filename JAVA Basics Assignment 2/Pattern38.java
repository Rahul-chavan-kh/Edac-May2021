class Pattern38{
public static void main(String args[]){
for(int i=9;i>=1;i--)
{
for (int j=9; j>=i; j--) 
{
System.out.print(" ");
}
for(int k=1;k<=i;k++)
{
System.out.print(i+" ");
}
System.out.println();
}
}
}


/*

C:\Kharghar\Assign\Assign2>javac Pattern38.java

C:\Kharghar\Assign\Assign2>java Pattern38
 9 9 9 9 9 9 9 9 9
  8 8 8 8 8 8 8 8
   7 7 7 7 7 7 7
    6 6 6 6 6 6
     5 5 5 5 5
      4 4 4 4
       3 3 3
        2 2
         1
		 
*/		 