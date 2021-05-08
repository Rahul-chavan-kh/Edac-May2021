import java.util.*;
public class Arr {

	public static void main(String[] args) {
		
		int a[]=new int[10];
		int sum=0;
		float Avg;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr array:");
		for(int i=0;i<=a.length-1;i++)
		{
			
			a[i]=sc.nextInt();
		}
       System.out.println("Array values are:");
       
        for(int i=0;i<=a.length-1;i++)  // for each  // for(int j=1;j<=a.length-1;j++)
       {  
           sum=sum+a[i];
    	   
    	   System.out.println(a[i]);
		   
	   }   
	   System.out.println("Addition = "+sum);
	   
	   System.out.println("Enter numb of subjects :");
		
		Avg=sc.nextFloat();
		
		Avg=sum/Avg;
		
		System.out.println("Average ="+Avg);
		
		int max=a[0];
		for(int i=1;i<=a.length-1;i++)
		{
			
			if(a[i]>max)
				max=a[i];
		}
		System.out.println("Maximum value= " +max);
		/*float a[]=new float[10];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr array:");
		for(int i=0;i<=a.length-1;i++)
		{
			
			a[i]=sc.nextFloat();
		}
       System.out.println("Array values are:");
       
        for(float X:a)  // for each  // for(int j=1;j<=a.length-1;j++)
       {
    	   
    	   System.out.println(X);
       }*/
	   
	   
	}

}
