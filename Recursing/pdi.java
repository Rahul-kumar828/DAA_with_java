package Recursing;

import java.util.Scanner;

public class pdi {
    public static void main(String[] arg) throws Exception{
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        pdiN( n);

    }
    public static void pdiN(int n){
        if(n==0){
            return;
        }
       System.out.println(n);
       pdiN(n-1);
       System.out.println(n);

    }
}
