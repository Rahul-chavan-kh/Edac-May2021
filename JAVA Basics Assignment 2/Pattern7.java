public class Pattern7 {

  public static void main(String[] args) {
   
    
    for (int i = 1; i <= 5; i++) {
      for (int j = 1; j <= 5 - i; j++) {
        System.out.print(" ");
      }
      for (int k = 1; k <= i; k++) {
        System.out.print(k + " ");
      }
      System.out.println("");
    }
  }
}


/*

C:\Kharghar\Assign\Assign2>javac Pattern7.java

C:\Kharghar\Assign\Assign2>java Pattern7
     1
    1 2
   1 2 3
  1 2 3 4
 1 2 3 4 5
 
 */