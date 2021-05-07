import java.util.Scanner;
public class Example18 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st binary number :");
		String X = sc.next();
		System.out.println("Enter 1st binary number :");
		String Y = sc.next();
		
		int n1 = Integer.parseInt(X , 2);
		int n2 = Integer.parseInt(Y , 2);
		int n3 = n1*n2;
		
		System.out.println(" n1   :" +Integer.toBinaryString(n1));
		System.out.println(" n2   :" +Integer.toBinaryString(n2));
		System.out.println("n1*n2 :" +Integer.toBinaryString(n3));


	}

}


