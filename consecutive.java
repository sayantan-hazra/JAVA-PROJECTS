
import java.util.*;
class consecutive{
    int N,i,j,k,sum=0,c=0;
    Scanner sc=new Scanner(System.in);
    void consecu(){
        System.out.println("ENTER THE NUMBER:");
        N=sc.nextInt();
        for(i=1;i<(N/2)+1;i++){
            sum=0;
            for(j=i;j<=(N/2)+1;j++){
                sum=sum+j;
                if(sum==N)
                break;}
            if(j<=N/2+1){
                for(k=i;k<=j;k++)
                System.out.print(" + "+k);
                System.out.println();
                c++;}}
        System.out.println("FREQUENCY:"+c);}
        public static void main(String[] args){
        consecutive ob= new consecutive();
        ob.consecu();}}
