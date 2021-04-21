import java.util.*;
public class Missing{
	public static int miss_nbr(int [] T,int n){
		int k=0;
		int s=0;
		int [] tab=new int[n];
		for(int i=0;i<n;i++){
			tab[i]=i+1;
			s+=tab[i];
		}
		for(int i=0;i<n-1;i++){
			
			k+=T[i];
		}
		return s-k;
	}
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int[] miss=new int[n];
		for(int i=0;i<n-1;i++){
			miss[i]=input.nextInt();
		}
		System.out.println(miss_nbr(miss,n));

	}
}