import java.util.*;
public class Permutation{
	public static void beauty_permute(long n){
		 
		if( n<4)
			System.out.println("NO SOLUTION");
		else{
			 
			  for(long i=1;i<=n;i=i+2){
			    System.out.print(i);
		      }
		      for(long i=2;i<=n-1;i=i+2){
		     	System.out.print(i);
		     }
		      
		     }
			}
		  
		
	}
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		long n=input.nextLong();
		beauty_permute(n);
	}
}