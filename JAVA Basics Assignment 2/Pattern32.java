public class Pattern32
{
public static void main(String args[])
{

for(int i=1; i<=5; i++){//parent for loop lterate rows
  for(int j=1; j<=i; j++){
  
  if(j==1 || j==i || i==5){
     System.out.print("*");  //print star, when the condiiton is true
     }
     else{
     System.out.print(" ");
}
}
System.out.println();//move to next line
}
}
}