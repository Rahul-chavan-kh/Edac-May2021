
public class Example21
{

public static void toOctal(int num)
{	
int Octal[] = new int[10];

int index=0;

while(num>0)
{
Octal[index++] = num%8;
num=num/8;
}

for(int i=index-1;i>=0;i--)
{
System.out.print(Octal[i]);
}
System.out.println();
}
public static void main(String args[])
{
	System.out.println("Value of decimal 15:");
	toOctal(15);
}
}