import java.util.*;
public class Inflation{
     public static int increase_sum(int[] T,int n,int k){
     	 int min=0;
     	 
     	for(int i=1;i<n;i++){
     		int s=0;
     		int h;
     		for(int j=0;j<i;j++){
     		   
               s+=T[j];
     		}
     		if((T[i]/s)==(k/100) || k==100)
     			 return 0;
     		else if((T[i]/s)>(k/100)){
     		   h=(int)((T[i]*100-k*s)/k)+1;
     		   min+=h;
     		}
            
           
     	}
         
     	return min; 
     }
     public static void main(String[] args){
     	Scanner input =new Scanner(System.in);
     	int n=input.nextInt();
     	int k=input.nextInt();
     	int j=0;
      while(j<k){
         
      	 int[] tab =new int[n];
      	 for(int i=0;i<n;i++){
     	  tab[i]=input.nextInt();
     	}
         System.out.println(increase_sum(tab,n,k));
         j++;
      }
      	
    
     	
     }
}