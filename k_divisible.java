import java.util.*;
public class k_divisible{
   public static int div(int n,int k){
   	 int min;
      if(n==1 || k==1)
         min=k;
      else{
        if(n<k){
          if(k%n==0)
            min=k/n;
          else{
            min=k/n+1;
         }
       }
       else{
         if(n%k==0)
            min=1;
         else{
            min=2;
          }
         
        }
      }
       return min;
   }

   	public static void main(String[]args){
   		Scanner input=new Scanner(System.in);
   		int p=input.nextInt();
   		int j=0;
   		while(j<p){
   			int n=input.nextInt();
   			int k=input.nextInt();
   			int z=div(n,k);
   			System.out.println(z);
   			j++;
   		}
   	 
    
   	  
   }


}