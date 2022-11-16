import java.util.*;
class futuredate
{
    int dd,mm,yyyy,days,count=0;
    int month[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
    Scanner sc=new Scanner(System.in);
    void input(){
        System.out.println("INPUT A DAY,MONTH,YEAR IN A NUMBER");
        dd=sc.nextInt();
        mm=sc.nextInt();
        yyyy=sc.nextInt();
        System.out.println("ENTER NO. OF DAYS AFTER WHICH NEW DATE IS TO BE FOUND:");
        days=sc.nextInt();}
    void calculate(){
        if(yyyy%4==0)
        month[2]=29;
        else
        month[2]=28;while(count<days){
            dd++;
            count++;
            if(dd>month[mm]){
                dd=1;
                mm++;}{
                if(mm>12)
                mm=1;
                yyyy++;
                if(yyyy%4==0)
                month[2]=29;
                else
                month[2]=28;}}
        System.out.println("FUTURE DATE:"+dd+"/"+mm+"/"+yyyy);}
        public static void main(String[] args){
        futuredate ob=new futuredate();
        ob.input();
        ob.calculate();}}

