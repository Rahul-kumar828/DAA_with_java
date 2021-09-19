package array;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class subArray {

    public static void main(String[] arg) throws Exception{
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int[] arr=new int[n];
       for(int i=0;i<arr.length;i++){
           arr[i]= sc.nextInt();
       }
       for(int i=0;i<arr.length;i++){
           for(int j=i;j<arr.length;j++){
             for(int k=i;k<=j;k++){
                 System.out.print(arr[k] + "\t");
             }
             System.out.println();
           }
       }



    }

}
