public class Example24
{

public static int OctalToDecimal(int Octal)
{
int decimal=0;
int num=0;
while(true)
{
if(Octal==0)
{
break;
}

else
{
int temp=Octal%10;
Octal+= temp*Math.pow(8,num);
decimal = decimal/10;
num++;
}
}

return Octal;

}


public static void main(String args[])
{
System.out.println("octal of 111 is "+OctalToDecimal(111));

}
}