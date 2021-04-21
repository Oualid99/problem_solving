import java.util.*;
public class Palidromme {
 
    public static String isPalindromme(String s){
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(s.length()-1-i))
              return "NO";
        }
        return "YES";
    }

    public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      int k=input.nextInt();
      input.nextLine();
      while(k>0){
        
          String str=input.nextLine();
          System.out.println(isPalindromme(str));
          k--;
      }
    
    }
}
