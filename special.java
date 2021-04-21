import java.util.*;
public class special{
	public static int nbr(int x,int y){
		int nbr=0;
		for(int i=1;i<=x;i++){
			for(int j=1;j<=y;j++){
                if(Math.floor(i/j)==i%j)
                	nbr++;
			}
		}
		return nbr;
	}
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int k=input.nextInt();
		while(k>0){
			int x=input.nextInt();
			int y=input.nextInt();
			System.out.println(nbr(x,y));
			k--;
		}
	}
}