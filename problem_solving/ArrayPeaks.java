import java.util.*;
public class ArrayPeaks{
    public static void Peaks(int n,int k){
         
        if(k> (n-1)/2)
           System.out.println(-1);
        else{
            int i=1;
            int compteur=1;
            while(i<=n && compteur-1!=n){

             
                if(compteur%2==0 && k>0){
                    System.out.print(n-i+2+" ");
                    k--;
               }
                else{
                    System.out.print( i+" ");
                   i++;
                }
                compteur++;
               
            }
       } 
       System.out.println();
    }
    public static void main(String[] args){
       Scanner input=new Scanner(System.in);
       int r=input.nextInt();
       while(r>0){
           int n=input.nextInt();
           int k=input.nextInt();
           Peaks(n,k);
           r--;
       }
    }
}