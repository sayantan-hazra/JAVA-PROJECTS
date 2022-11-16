import java.util.*;
class symmetric{
    int M,i,j,flag=0,ld=0,rd=0;
    Scanner sc=new Scanner(System.in);
    /**
     * 
     */
    void FindSymm(){
        System.out.println("ENTER THE SIZE OF MATRIX:");
        M=sc.nextInt();
        if((M>2)&&(M<10)){
            int A[][]=new int[M][M];
            for(i=0;i<M;i++){
                for(j=0;j<M;j++){
                    A[i][j]=sc.nextInt();}}
            System.out.println("ORIGINAL MATRIX:");
            for(i=0;i<M;i++){
                for(j=0;j<M;j++){
                    System.out.print(A[i][j]+"\t");}
                System.out.println();}
            for(i=0;i<M;i++){
                for(j=0;j<M;j++){
                    if(A[i][j]!=A[j][i]){
                        flag=1;
                        break;}}}
            if(flag==0)
            System.out.println("THE GIVEN MATRIX IS SYMMETRIC");
            else
            System.out.println("THE GIVEN MATRIX IS NOT SYMMETRIC");
            for(i=0;i<M;i++){
                ld=ld+A[i][i];
                rd=rd+A[i][M-1-i];}
            System.out.println("THE SUM OF THE LEFT DIAGONAL:"+ld);
            System.out.println("THE SUM OF THE RIGHT DIAGONAL:"+rd);
        }
        else
        {
        System.out.println("THE MATRIX IS OUT OF RANGE:");
    }
}
    public static void main(String[] args){
        symmetric ob=new symmetric();         
        ob.FindSymm();
    }
}
