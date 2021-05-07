
public class Example21
{

public static void toBinary(int num)
{	
int binary[] = new int[10];

int index=0;

while(num>0)
{
binary[index++] = num%8;
num=num/8;
}

for(int i=index-1;i>=0;i--)
{
System.out.print(binary[i]);
}
System.out.println();
}
public static void main(String args[])
{
	System.out.println("Value of decimal 10:");
	toBinary(15);
}
}