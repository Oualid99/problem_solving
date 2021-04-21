import java.util.*;
public class FavoriteSequence{
	public static void Sequence(int[] T){
		ArrayList<Integer> A = new ArrayList<Integer>();
		int n=T.length;
		if(n%2==0){
		 for(int i=0;i<n/2;i++){
		 	A.add(T[i]);
		 	A.add(T[n-1-i]);
	   	 
	     }
	    }
	    else{
	     for(int i=0;i<=n/2;i++){
	     	if(i==n/2){
	     		A.add(T[i]);
	     		 
	     	}
	     	else{
	     		A.add(T[i]);
		 	    A.add(T[n-1-i]);
	     	}
		 	
	   	 
	     }
	    }

       for(int i=0;i<A.size();i++){
       	System.out.print(A.get(i));
       	System.out.print("\t");
       	
       }
 
		
	   
	}
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int k=input.nextInt();
        while(k>0){
        	int n=input.nextInt();
        	int[] tab=new int[n];
        	for(int i=0;i<n;i++){
        		tab[i]=input.nextInt();
        	}
        	Sequence(tab);
        	System.out.println("\n");
        	k--;
        }

	}
}