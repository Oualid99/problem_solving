import java.util.*;
public class Increasing{
	public static long increase(long[] T){
		long min=0;
		for(int i=0;i<T.length-1;i++){
			if(T[i]>T[i+1]){
				min+=T[i]-T[i+1];
	            T[i+1]=T[i];
			}

				
		}
		return min;
	}
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		long[] tab=new long[n];
		for(int i=0;i<n;i++){
			tab[i]=input.nextLong();
		}
		System.out.println(increase(tab));

	}
}