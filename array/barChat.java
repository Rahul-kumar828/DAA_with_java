package array;
import java.util.Scanner;
import java.util.*;
import java.io.*;

public class barChat {
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i< arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        for(int i=1;i< arr.length;i++){
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        for(int floor=max; floor>=1;floor--){
            for(int i=0;i< arr.length;i++){
                if(arr[i]>=floor){
                  System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }

    }
}
