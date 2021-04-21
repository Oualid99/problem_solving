import java.util.*;
public class SpecialPermutation{
	public static void Special(int n){
		int[] tab=new int[n];
		for(int i=0;i<n;i++){
			tab[i]=i+1;
		}

		for(int i=0;i<n-1;i++){
			int tmp;
			tmp=tab[i];
			tab[i]=tab[i+1];
			tab[i+1]=tmp;
		}
		for(int i=0;i<n;i++){
			System.out.print(tab[i]);
			System.out.print("\t");
		}
	}
    public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int k=input.nextInt();
		while(k>0){
			int n=input.nextInt();
			Special(n);
			k--;
		}
	}
}