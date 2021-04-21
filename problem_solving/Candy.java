import java.util.*;
class Candy{
	public static int nbr_1(int n,int t[]){
		int k=0;
		for(int i=0;i<n;i++){
			if(t[i]==1)
				k++;
			

		}
		return k;
	}
	public static int nbr_2(int n,int t[]){
		int k=0;
		for(int i=0;i<n;i++){
			if(t[i]==2)
				k++;
			

		}
		return k;
	}
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		
        int p=input.nextInt();
         
	 for(int j=0;j<p;j++){
		 int n=input.nextInt();
		 int tab[]=new int[n];
		
		for(int i=0;i<n;i++){
		   int s=input.nextInt();
		   tab[i]=s;
		}
		int z=nbr_1(n,tab);
		int y=nbr_2(n,tab);
		if(z%2==1)
			System.out.println("NO");
		
		else{
			if(z==0 && y%2==1)
			  System.out.println("NO");
			else{
				System.out.println("YES");
			}
			
		}
     }
      
		 
		
    }
}