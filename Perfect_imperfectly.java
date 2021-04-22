import java.util.*;
public class Perfect_imperfectly {

     public static void perfect(ArrayList<Integer> A,int n){
        boolean flag=true;
        int i=0;
        while(i<n && flag){
           int x=(int)Math.sqrt(A.get(i));
           if(x*x!=A.get(i)){
               System.out.println("YES");
               flag=false;
           }
           i++;
             
       }
       if(flag){
            System.out.println("NO");
       }
      
      
     }
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int r=input.nextInt();
        while(r>0){
            ArrayList<Integer> A=new ArrayList<Integer>();
            int n=input.nextInt();
            for(int i=0;i<n;i++){
                int var=input.nextInt();
                A.add(var);
            }
            perfect(A,n) ;  
                
             

             
            r--;
        }
     }
}
