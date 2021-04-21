import java.util.*;
public class CancelTrain{
	public static int cancel(int[] A,int[] B){
		int k=0;
		for(int i=0;i<A.length;i++){
			for(int j=0;j<B.length;j++){
				if(A[i]==B[j])
					k++;
			}
		}
		return k;
	}
     public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int k=input.nextInt();
		while(k>0){
			int n=input.nextInt();
			int m=input.nextInt();
			int[] A=new int[n];
			for(int i=0;i<n;i++){
				A[i]=input.nextInt();

			}
			int[] B=new int[m];
			for(int i=0;i<m;i++){
				B[i]=input.nextInt();
				
			}
			System.out.println(cancel(A,B));

		}
	}
}