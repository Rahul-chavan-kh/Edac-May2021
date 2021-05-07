class Pattern3{
public static void main(String args[]){
for (int i = 1; i <= 5; i++)
        {
            for (int j = 5; j > i; j--)
            {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++)
            {
                System.out.print(k + " ");
            }
            System.out.println();
        }
}
}

/*

C:\Kharghar\Assign\Assign2>javac Pattern16.java

C:\Kharghar\Assign\Assign2>java Pattern16
5 5 5 5 5
4 4 4 4
3 3 3
2 2
1

*/