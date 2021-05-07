public class Pattern14 {

  public static void main(String[] args) {
   
    
    for (int i = 1; i <= 5; i++) {
      for (int j = 1; j <= 6 - i; j++) {
        System.out.print(j+" ");
      }
      for (int k = 1; k <= i; k++) {
        System.out.print(" ");
      }
      System.out.println("");
    }
  }
}

/*

C:\Kharghar\Assign\Assign2>javac Pattern14.java

C:\Kharghar\Assign\Assign2>java Pattern14
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1

*/