import java.util.*;
class unique
{
    int k,x,i,j,m,n,c=0,index=0;
    int arr[]=new int[1000];
    Scanner sc=new Scanner(System.in);
    void accept()
    {   //Declare accept as a method with return type void{
        while(true)
        {
            System.out.println("ENTER THE START RANGE AND END RANGE:");
            m=sc.nextInt();
            n=sc.nextInt();
            if(m<n)
            break;
        }
    }
    void display()  //Declare display as a method with return type void{
    {  
        System.out.println("THE UNIQUE DIGIT QUESTION ARE:");
        for(i=m;i<=n;i++){
            index=0;
            for(j=i;j>0;j=j/10)
            {
                x=j%10;
                for(k=0;k<index;k++)
                {  
                    if(arr[k]==x)
                    break;
                }
                if(k<index)
                break;
                else
                arr[index++]=x;
            }
            if(j==0)
            {
                c++;
                System.out.print(" "+i);
            }
        }
        System.out.print("\nFREQUENCY OF UNIQUE DIGITS INTEGER IS:"+c);
    }
    public static void main(String[] args){
        unique ob=new unique();
        ob.accept();
        ob.display();}
    }