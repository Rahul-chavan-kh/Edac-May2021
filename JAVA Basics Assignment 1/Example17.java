import java.util.*;
public class Example17
{
public static void main(String args[])
{
int num1;
int num2;
int digit1,digit2,sum=0,carry=0;
int arr[]=new int[10];

//---------------------------------------------------

Scanner sc = new Scanner(System.in);
System.out.println("Enter 1st binary number :");
num1=sc.nextInt();
System.out.println("Enter 1st binary number :");
num2=sc.nextInt();

//----------------------------------------------------
for(int i =arr.length-1; i>0;i--)
{

digit1 = num1 % 10;
digit2 = num2 % 10;
       
    
sum = digit1 + digit2 + carry ;

if(sum==0){
arr[i]=0;
carry=0;
}
else if(sum==1){
arr[i]=1;
carry=0;
}
else if(sum==2){
arr[i]=0;
carry=1;
}

else if(sum==3){
arr[i]=1;
carry=1;
}
num1=num1/10;
num2=num2/10;
}
//----------------------------------------------------------

for(int i=0;i<=arr.length-1;i++)
{
System.out.print(arr[i]);
}


}
}

/*
0100
0101
1-------
 0 0 1*/