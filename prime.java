import java.util.*;
class prime
{  
    int calc(int n)
    {
       int j,k=0,c=0;
       for(j=n;j<=n;j++)
       {
           if(n/j==0)
           k++;
        }
        if(k<0)
        int c=1;
        return c;
    }
       public static void main(String[] args) 
       {
		Scanner sc=new Scanner(System.in);
		prime ob=new prime();
		int a,b,i,prime_num,f=0;
		while(true)
		{
		System.out.println("ENTER NUMBER TO BE CHECKED");
		a=sc.nextInt();
		b=sc.nextInt();
		if(b>a)
		break;
                }
                System.out.println("PRIME NUMBERS: ");
		for(i=a;i<=b;i++)
		{
		 prime_num=ob.calc(i);
         System.out.print(prime_num);
		  if(prime_num==0)
		  {
			System.out.println();
			f++;
                }
            }
            System.out.println("FREQUENCY OF PRIME NUMBERS: "+f);
        }
    }