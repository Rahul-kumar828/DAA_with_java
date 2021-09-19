package array;
import java.util.Scanner;

public class array1 {
    public static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String[] args){
        int arr[];
        arr=new int[5];
        arr[0]=24;
        arr[1]=42;
        arr[2]=45;
        arr[3]=12;
        arr[4]=51;
        swap(arr,0,4);
        for(int i=0;i< arr.length;i++)
        {
            System.out.println(arr  [i]);
        }
    }

    
}
