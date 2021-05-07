public class Example22
{

public static int BinnaryToDecimal(int binarry)
{
int decimal=0;
int num=0;
while(true)
{
if(binarry==0)
{
break;
}

else
{
int temp=binarry%10;
decimal+= temp*Math.pow(2,num);
binarry = binarry/10;
num++;
}
}

return decimal;

}


public static void main(String args[])
{
System.out.println("Decimal of 100 is "+BinnaryToDecimal(100));

}
}