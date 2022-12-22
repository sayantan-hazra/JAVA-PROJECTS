import java.util.*;
class mirror
{ 
	void calculate()
	{
        int M,N,i,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE SIZE (MXN) OF THE MATRIX");
		System.out.print("INPUT: M= ");
		M=sc.nextInt();
		System.out.print("       N= ");
		N=sc.nextInt();
		if(M<=2||N<=2||M>=10||N>=10)
		{
			System.out.println("SIZE OUT OF RANGE");
		}
		else
		{
			int A[][]=new int[M][N];
			int B[][]=new int[M][N];
		System.out.println("ENTER "+M+"x"+N+" ARRAY ELEMENTS");
        for(i=0;i<M;i++)
		{
			for(j=0;j<N;j++)
			{
				A[i][j]=sc.nextInt();
			}
		}
        for(i=0;i<M;i++)
		{
			int k=3;
			for(j=0;j<N;j++)
			{
				B[i][j]=A[i][k];
				k--;
			}
		}
		System.out.println("OUTPUT: ORIGINAL MATRIX");
		for(i=0;i<M;i++)
		{
			for(j=0;j<N;j++)
			{
				System.out.print(A[i][j]+" ");
			}
            System.out.println();
		}
		System.out.println("        MIRROR MATRIX");
		for(i=0;i<M;i++)
		{
			for(j=0;j<N;j++)
			{
				System.out.print(B[i][j]+" ");
			}
			System.out.println();
		}
		System.out.print("SUM OF CORNER ELEMENTS= ");
		System.out.println(B[0][0]+B[0][N-1]+B[M-1][0]+B[M-1][N-1]);
	}
}
public static void main(String[] args)
{
mirror ob=new mirror();
ob.calculate();
}
}