public class Pattern9 {

  public static void main(String[] args) {
   
    int A=64;
    for (int i = 1; i <= 5; i++) {
      for (int j = 1; j <= 5 - i; j++) {
        System.out.print(" ");
      }
      for (int k = 1; k <= i; k++) {
        System.out.print((char)(A+k) + " ");
      }
      System.out.println("");
    }
  }
}

/*

C:\Kharghar\Assign\Assign2>javac Pattern9.java

C:\Kharghar\Assign\Assign2>java Pattern9
    A
   A B
  A B C
 A B C D
A B C D E

*/