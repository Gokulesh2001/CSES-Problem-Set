import java.util.*;

public class diceCombination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		double dp[]=new double[n+1];
		dp[0]=1;
		for(int i=1;i<=n;i++) {
			
			for(int j=1;j<=6;j++) {
				if(i<j) {
					break;
				}
				dp[i]=(dp[i]+dp[i-j])%(Math.pow(10, 9)+7);
			}
		}
		System.out.println((int)dp[n]);
	}

}
