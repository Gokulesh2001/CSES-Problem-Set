
import java.util.*;
public class repetitions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int arr[]=new int[26];
		int max=0;
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			int temp=0;
			while(i<str.length()&&str.charAt(i)==c) {
			temp++;
			i++;
			}
			if(max<=temp) {
				max=temp;
			}
			i--;
		}
//		max=0;
//		for(int i=0;i<26;i++) {
//			max=Math.max(max, arr[i]);
//		}
		
		System.out.println(max);
	}

}
