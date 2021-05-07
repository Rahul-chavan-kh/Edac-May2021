public class Pattern13{

  public static void main(String[] args) {
   
    int A=64;
    for (int i = 1; i <= 5; i++) {
      for (int j = 1; j <= 5 - i; j++) {
        System.out.print(" ");
      }
      for (int k = 1; k <= i; k++) {
        System.out.print((char)(A+i) + " ");
      }
      System.out.println("");
    }
  }
}

/*

C:\Kharghar\Assign\Assign2>javac Pattern13.java

C:\Kharghar\Assign\Assign2>java Pattern13
    A
   B B
  C C C
 D D D D
E E E E E

*/