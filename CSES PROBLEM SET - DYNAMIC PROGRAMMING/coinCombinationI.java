import java.util.*;
import java.io.*;
class coinCombinationI {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st= new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int sum = Integer.parseInt(st.nextToken());
    StringTokenizer st2= new StringTokenizer(br.readLine());
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=Integer.parseInt(st2.nextToken());
		}
		Arrays.sort(arr);
		double mod=Math.pow(10, 9)+7;
		double dp[]=new double[sum+1];
		dp[0]=1;
		for(int i=arr[0];i<=sum;i++) {
			for(int j=0;j<n;j++) {
				if(i-arr[j]>=0) {
					
					dp[i]+=dp[i-arr[j]];
					dp[i]%=mod;
				}
			}
		}
		System.out.println((int)dp[sum]);
	}

}
