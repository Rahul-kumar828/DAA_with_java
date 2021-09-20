package Recursing;

import java.util.Scanner;

public class decreasing {
    public static void main(String[] arg) throws Exception{
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();;
        printDecreasing(n);
    }
    public static void printDecreasing(int n){
        if(n==0){
            return;
        }
        System.out.println(n);;
        printDecreasing(n-1);
    }
}
