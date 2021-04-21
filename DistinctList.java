import java.util.*;
import java.util.stream.Collectors;
public class DistinctList{
	public static int Mex(ArrayList<Integer> A){
		int mex=0;
		while(A.contains(mex)){
			mex++;
		}
		return mex;
		 
	}
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		 
	 
		  ArrayList<Integer> list =new ArrayList<Integer>();
		  int n=input.nextInt();
		  for(int i=0;i<n;i++){
		  	int r=input.nextInt();
		  	 list.add(r);
		  }
		  ArrayList B = (ArrayList) list.stream().distinct().collect(Collectors.toList());
		  System.out.println(Mex(list));
		  list.add(Mex(list));
		 for(int i=0;i<list.size();i++){
		  	 System.out.print (list.get(i));
		  }

		  System.out.println(B.size()); 

		 
	}
}