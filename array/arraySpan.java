package array;
import java.util.Scanner;

public class arraySpan {
    public static void main(String[] arg){
        //span of the number
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i< arr.length;i++){
            arr[i]= sc.nextInt();
        }
       int max=arr[0];
        int min=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
         if(arr[i]<min){
             min=arr[i];
         }
        }
        int span=max-min;
        System.out.println(span);
    }

}
