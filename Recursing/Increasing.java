package Recursing;

import java.util.Scanner;

public class Increasing {
    public static void main(String[] arg) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        printIncreasing(n);

    }
      public static void printIncreasing(int n ){
        if(n==0){
            return;
        }
        printIncreasing(n-1);
        System.out.println(n);
      }

}
