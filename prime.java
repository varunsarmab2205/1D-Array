package Arrays;
import java.util.*;
public class Prime {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]=new int[6];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++) {
			int count=0;
			for(int j=1;j<=a[i];j++) {
				if(a[i]%j==0) {
					count=count+1;
				}
			}
			if(count==2) {
				System.out.println(a[i]+" is prime");
			}
			else {
				System.out.println(a[i]+" is not prime");
			}
		}
	}
}
