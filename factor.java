import java.util.*;
class factor
{
    public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int ask,i;
        System.out.print("ENTER ANY NUMBER GREATER THAN 0 TO KNOW ITS FACTOR OR FACTORS: ");
        ask=sc.nextInt();
        if(ask==0)
        {
            System.out.println("PLEASE ENTER NUMBER GREATER THAN 0");
        }
        else if(ask==1)
        {
            System.out.print("FACTORS OF 1= 1");
        }
        else
        {
            System.out.print("FACTORS OF "+ask+" ARE= ");
        for(i=1;i<=ask-1;i++)
        {
        if(ask%i==0)
        {
        System.out.print(i);
        System.out.print(",");
    }
        else
        {
        break;
    }
}
System.out.print(ask);
}
}
}