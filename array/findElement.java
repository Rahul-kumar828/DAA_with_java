package array;
import java.util.Scanner;
import java.util.*;
import java.io.*;

public class findElement {
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i< arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int data= sc.nextInt();
        int id= -1;
        for(int i=0;i< arr.length;i++){
            if(arr[i]==data){
             id=i;

            }
        }
        System.out.println(id);
    }
}
