import java.util.*;
class arrange_ascen_array
{
public static void main(String[] args)
{
    Scanner sc=new Scanner(System.in);
    int size,i,j,t,min=0;
    System.out.println("ENTER SIZE OF VARIABLES");
    size=sc.nextInt();
    int m[]=new int[size];
    System.out.println("ENTER "+size+" VARIABLES");
    for(i=0;i<=size-1;i++)
    {
        m[i]=sc.nextInt();
    }
    for(i=0;i<=size-1;i++)
    {
        min=i;
        for(j=i+1;j<=size-1;j++)
    {
        if (m[j]<m[min]) {
            min=j;
        }
    }
    t=m[i];
    m[i]=m[min];
    m[min]=t;
}
System.out.println("THE NUMBERS ARRANGED IN ASCENDING ORDER ARE: ");
for (i=0;i<size;i++) {
    System.out.println(m[i]);
}
}
}