import java.util.*;
public class minimizingCoins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int sum=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		int dp[]=new int[sum+1];
		Arrays.fill(dp,1000001);
		dp[0]=0;
		for(int i=1;i<=sum;i++) {
			for(int j=0;j<n;j++) {
				if(i-arr[j]>=0)
				dp[i]=Math.min(dp[i], dp[i-arr[j]]+1);
			}
		}
		System.out.println(dp[sum]==1000001?-1:dp[sum]);
	}

}
