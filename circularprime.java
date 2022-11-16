import java.util.*;
class circularprime{
    public static boolean isprime(int num){
        int c=0;
        int i=0;
        for(i=1;i<=num;i++){
            if(num%i==0){
                c++;}}
        return c==2;}
    public static int digitcount(int num){
        int c=0;
        while(num!=0){
            c++;
            num=num/10;}
        return c; }
    public static void check(){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER INTEGER TO CHECK:");
        int n=sc.nextInt();
        if(n<=0){
            System.out.println("INVALID INPUT");
            return;}
        boolean iscircularprime=true;
        if(isprime(n)){
            System.out.println(n);
            int dc=digitcount(n);
            int div=(int)(Math.pow(10,dc-1));
            int n2=n;
            int i,t1,t2=0;
            for(i=1;i<dc;i++){
                t1=n2/div;
                t2=n2%div;
                n2=t2*10+t1;
                System.out.println(n2);
                if(!isprime(n2)){
                    iscircularprime=false;
                    break;}}}
        else{
            iscircularprime=false;}
        if(iscircularprime){
            System.out.println(n+" IS A CIRCULAR PRIME");}
        else{
            System.out.println(n+" IS A NOT A CIRCULAR PRIME");}}
    public static void main(String[] args){
        circularprime ob=new circularprime();
        ob.check();}}
