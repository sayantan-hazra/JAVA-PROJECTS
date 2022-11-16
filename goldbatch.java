import java.util.*;
class goldbach{
    boolean isprime(int N){
        if(N<=1)
        return false;
        int i;
        for(i=2;i<N;i++){
            if(N%i==0)
            return false;}
        return true;}
    void print(int N){
        int i,j;
        for(i=2;i<=N;i++){
            for(j=i;j<=N;j++){
                if(isprime(i)&&isprime(j)&&i+j==N)
                System.out.println(i+","+j);}}}
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N;
        System.out.println("ENTER THE LIMIT:");
        N=sc.nextInt();
        if(N%2==1){
            System.out.println("INVALID INPUT,NUMBER IS ODD");
            System.exit(0);}
        if(N<=9||N>=50){
            System.out.println("INVALID INPUT,NUMBER OUT OF RANGE");
            System.exit(0);}
        goldbach ob=new goldbach();
        System.out.println("PRIME PAIRS ARE:");
        ob.print(N);}}