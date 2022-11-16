import java.util.*;
class spynumber{
    int i,r1,r2,f=0;
    Scanner sc=new Scanner(System.in);
    void input(){
        System.out.println("Enter the starting and ending range:");
        r1=sc.nextInt();
        r2=sc.nextInt();
        System.out.println("Spp numbers in the between "+r1+" to "+r2+" are: ");}
    void calculate(){
        for(i=r1;i<=r2;i++){
            int num=i;
            int sum=0,multi=1,rem;
            while(num!=0){
                rem=num%10;
                sum+=rem;
                multi*=rem;
                num/=10;}
            if(sum==multi){
            System.out.print(i+" ");
            f++;}}
        System.out.println("\n Frequency of Spy Number: "+f);}
        public static void main(String[] args){
        spynumber ob=new spynumber();
        ob.input();
        ob.calculate();}}