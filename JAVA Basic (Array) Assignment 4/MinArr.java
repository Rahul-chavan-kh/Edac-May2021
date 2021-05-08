import java.util.*;
public class MinArr {

	public static void main(String[] args) {
		
		int a[]=new int[10];
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr array:");
		for(int i=0;i<=a.length-1;i++)
		{
			
			a[i]=sc.nextInt();
		}
       System.out.println("Array values are:");
       
        for(int i=0;i<=a.length-1;i++)  // for each  // for(int j=1;j<=a.length-1;j++)
       {  
          
    	   
    	   System.out.println(a[i]);
		   
	   }   
		
		int min=a[0];
		for(int i=1;i<=a.length-1;i++)
		{
			
			if(a[i]<min)
				min=a[i];
		}
		System.out.println("Maximum value= " +min);
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
