import java.util.*;
class transpose{
    int i,j;
    Scanner sc=new Scanner(System.in);
    int arr[][]=new int[4][4];
    int trp[][]=new int[4][4];
    void trans(){
        System.out.println("ENTER THE NUMBER OF MATRIX 4*4:");
        for(i=0;i<4;i++){
            for(j=0;j<4;j++){
                arr[i][j]=sc.nextInt();}}
        System.out.println("THE NUMBER OF MATRIX ARE:");
        for(i=0;i<4;i++){
            for(j=0;j<4;j++){
                System.out.print(arr[i][j]+" ");}
            System.out.println();}
        for(i=0;i<4;i++){
            for(j=0;j<4;j++){
                trp[j][i]=arr[i][j];}}
        System.out.println("TRANSPOSE OF THE MATRIX IS:");
        for(i=0;i<4;i++){
            for(j=0;j<4;j++){
                System.out.print(trp[i][j]+" ");}
            System.out.println();}}
    public static void main(String[] args){
        transpose ob=new transpose();
        ob.trans();}}