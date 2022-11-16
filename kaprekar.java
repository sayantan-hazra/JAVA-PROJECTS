import java.util.*;
class kaprekar{
    int p,q,i,len,sq,k,s,l,count=0;
    Scanner sc =new Scanner(System.in);
    void input(){
        System.out.println("ENTER THE LOWER AND UPPER RANGE:");
        p=sc.nextInt();
        q=sc.nextInt();
        if(p>=5000||q>=5000||p>=q)
        System.out.println("OUT OF RANGE");
        else{
            System.out.println("THE KAPREKAR NUMBER ARE=");
            for(i=p;i<=q;i++){
                if(check(i)==1){
                    if(count==0)
                    System.out.print(i);
                    else
                    System.out.print(","+i);
                    count++;}}
            System.out.println();
            System.out.println("FREQUENCY OF KAPREKAR NUMBER IS:"+count);}}
    int check(int n){
        len=(""+n).length();
        sq=n*n;
        k=sq%(int)(Math.pow(10,len));//finding right hand piece
        s=sq/(int)(Math.pow(10,len));//finding left hand piece
        l=k+s;
        if(l==n)
        return 1;
        else
        return 0;}
        public static void main(String[] args){
        kaprekar ob=new kaprekar();
        ob.input();}
    }
