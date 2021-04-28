import java.io.*;
import java.util.*;
public class increasingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc=new Scanner(System.in);

   int n=sc.nextInt();
   long arr[]=new long[n];
   for(int i=0;i<n;i++) {
	   arr[i]=sc.nextLong();
   }
   
   long sum=0;
   for(int i=0;i+1<n;i++) {
	   if(arr[i]>arr[i+1]) {
		   sum+=Math.abs(arr[i]-arr[i+1]);
                   arr[i+1]=arr[i];
	   }
   }
   System.out.println(sum);
	}

}
