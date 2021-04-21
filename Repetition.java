import java.util.*;
public class Repetition{
	public static int nbr(String t ){
		int nbr=1;
		int max=1;
       for(int i=0;i<t.length()-1;i++){
       	 if(t.charAt(i)==t.charAt(i+1)){
       	 	nbr++;
           if(nbr>max)
          	max=nbr;
          
         }
         else
        	nbr=1;
        	
       }
       
        
       return max;
	}
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		 
		String tab=input.nextLine();
		
		System.out.println(nbr(tab));
		
	}
}