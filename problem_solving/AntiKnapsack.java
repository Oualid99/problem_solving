import java.util.*;
public class AntiKnapsack{
	public static void Anti(int n,int k){
		ArrayList<Integer> A=new ArrayList<Integer>();
		for(int i=1;i<=n;i++){
			if(i!=k)
              A.add(i);
		}
		for(int i=0;i<k-1;i++){
         for(int j=0;j<k-1;j++){
         	if(A.get(i)+A.get(j)==k){
         		A.remove(i);
         	    A.remove(j);
         	}
         	
         }
		}
		int r=0;
		
		for(int i=0;i<A.size();i++){
			r++;
			System.out.print(A.get(i));
			System.out.print("\t");
			 
		}
		System.out.println(r);
		
	}
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		int l=input.nextInt();
		while(l>0){
			int n=input.nextInt();
			int k=input.nextInt();
			Anti(n,k);
			System.out.println();
			l--;
		}
	}
}