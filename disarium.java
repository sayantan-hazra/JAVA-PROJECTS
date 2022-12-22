import java.util.*;
class disarium 
{
	int calc(int n)
	{
	        int num1,num2,c=0,r,disa_num=0;
	        num1=n;
	        num2=n;
		while(num1>0)
		{ 
		   num1/=10;
		   c++;
		}
		while(num2>0)
		{
			r=num2%10;
			disa_num+=Math.pow(r,c--);
			num2/=10;
		}
		return disa_num;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		disarium ob=new disarium();
		int a,disadium_num;
		System.out.println("ENTER NUMBER TO BE CHECKED");
		a=sc.nextInt();
		disadium_num=ob.calc(a);
		if(a==disadium_num)
			System.out.println(a+" IS AN DISADIUM NUMBER");
		else
		System.out.println(a+" IS NOT AN DISADIUM NUMBER");
	}
}