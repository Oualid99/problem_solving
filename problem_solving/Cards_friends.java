 import java.util.*;
 public class Cards_friends{
 	public static int nbr_friend(int w,int h){
		  int k=1;
		  while(w%2!=1 || h%2!=1){
			if(w%2==0 ){
				k*=2;
				w/=2;
			}
			if(h%2==0 ){
				k*=2;
				h/=2;
			}
	      
	      }
			return k;
		}
	public static void main(String[] args){
	
	  Scanner input=new Scanner(System.in);
	    int p;
            int j=1;
	    p=input.nextInt();
	   while(j<=p){

	    int w=input.nextInt();
	    int h=input.nextInt();
	    int n=input.nextInt();
	    int z=nbr_friend(w,h);
	    if(n<=z)
	 	System.out.println("YES");

	    else{
	 	System.out.println("NO");
	    }
	   j++; 
	 }
	 
	}
}