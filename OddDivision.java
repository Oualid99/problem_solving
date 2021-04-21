import java.util.*;
public class OddDivision{
	public static String division(long  n){
		if(n%2==1)
			return "YES";
		while(n>1){
			 n=n/2;
		   if(n!=1 && n%2==1 )
				return "YES";
		}
		return "NO";
		
	}
	public static void main(String[] args ){
		Scanner input=new Scanner(System.in);
		int k=input.nextInt();
		while(k>0){
			long n=input.nextLong();
			System.out.println(division(n));
			k--;
		}
	}
}