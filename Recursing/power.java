package Recursing;

import java.util.Scanner;

public class power {
    public static void main(String[] args) throws Exception{
        Scanner sc=new Scanner(System.in);
        int x= sc.nextInt();
        int n= sc.nextInt();
        int result=power(x,n);
        System.out.println(result);
    }
    public static int power(int x,int n){
        if(n==0){
            return 1;
        }
        int xnm1=power(x,n-1);
        int xn=x*xnm1;

       return xn;
    }
}
