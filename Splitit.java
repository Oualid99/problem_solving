import java.util.*;
public class Splitit{
     public static void split(String s,int n,int k){
     	 
     	if(k==0)
     		System.out.println("YES");
     	else{
           if(n<=2 || n%2==0)
           	System.out.println("NO");
           else{
           	int count=0;
           	  for(int i=0;i<k;i++){
           		 if(s.charAt(i)==s.charAt(n-1-i))
           		 	count++;
           	 }
           	 if(count==k)
           	 	System.out.println("YES");
           	 else 
           	 	System.out.println("NO");
           }
     	}
     }
      public static void main(String[] args) {
     	Scanner input =new Scanner(System.in);
     	int l=input.nextInt();
     	while(l>0){
     		int n=input.nextInt();
     		int k=input.nextInt();
     		input.nextLine();
     		String s=input.nextLine();
     		split(s,n,k);
     		l--;
     	}
     }
}