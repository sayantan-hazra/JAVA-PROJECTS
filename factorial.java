import java.util.*;
class factorial
{
	public static void main (String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n,i,factorial_num=1;
		System.out.print("ENTER NUMBER TO FIND OUT ITS FACTORIAL: ");
		n=sc.nextInt();
		if(n>0)
		{
		for(i=1;i<=n;++i)
		{
            factorial_num*=i;
}
System.out.print("FACTORIAL OF "+n+" = "+factorial_num);
}
		else
		{
		System.out.println("ENTER NUMBER GREATER THAN 0");
		}
	}
}