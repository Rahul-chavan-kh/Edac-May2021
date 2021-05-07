public class Pattern34 {

  public static void main(String[] args) {
   
    
    for (int i = 1; i <= 9; i++) {
      for (int j = 1; j <= 9 - i; j++) {
        System.out.print(" ");
      }
      for (int k = 1; k <= i; k++) {
        System.out.print(i + " ");
      }
      System.out.println("");
    }
  }
}

/*

C:\Kharghar\Assign\Assign2>java Pattern34
        1
       2 2
      3 3 3
     4 4 4 4
    5 5 5 5 5
   6 6 6 6 6 6
  7 7 7 7 7 7 7
 8 8 8 8 8 8 8 8
9 9 9 9 9 9 9 9 9

*/