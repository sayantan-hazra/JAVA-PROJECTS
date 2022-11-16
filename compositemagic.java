import java.util.*;
class composite_magic{
    Scanner sc=new Scanner(System.in);
    int m,n,i,j,count=0,num,sum,d;
    void input(){
        System.out.println("ENTER STARTING RANGE IN M AND ENDING RANGE IN N");
        m=sc.nextInt();
        n=sc.nextInt();}
    void calculate(){
        if(m<1||n<1||m>n){
            System.out.println("INVALID INPUT");      return;}
        System.out.println("THE COMPOSITE MAGIC NO. ARE:");    count=0;
        for(i=m;i<=n;i++){
            boolean iscomposite=false;
            for(j=2;j<i;j++){
                if(i%j==0){
                    iscomposite=true;
                    break;}}
            if(iscomposite && i!=1){
                num=i;
                while(num>9){
                    sum=0;
                    while(num!=0){
                        d=num%10;
                        num=num/10;
                        sum+=d; }     num=sum;}
                if(num==1){     count ++;
                    System.out.println(i+" ");}}}
        System.out.println();
        System.out.println("FREQUENCY OF COMPOSITE MAGIC NUMBERS:"+count);}
    public static void main(String[] args){
        composite_magic ob=new composite_magic();
        ob.input();     
         ob.calculate();}}