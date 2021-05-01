import java.util.Scanner;

public class permutations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    
    if(n==2 || n==3) {
    	System.out.println("NO SOLUTIONS");
    }
    else {
    	if((n&1)==0) {
    		for(int i=n-1;i>0;i-=2) {
    			System.out.print(i+" ");
    		}
    		for(int i=n;i>0;i-=2) {
    			System.out.print(i+" ");
    		}
    	}
    	else {
    		
    		for(int i=n-1;i>0;i-=2) {
    			System.out.print(i+" ");
    		}
    		for(int i=n;i>0;i-=2) {
    			System.out.print(i+" ");
    		}
    	}
    }
    
	}

}
