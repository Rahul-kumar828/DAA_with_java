package array;/* package array;
import java.util.Scanner;
import java.util.*;
import java.io.*;

public class reverseArray {
    public static void display(int[] a){
        StringBuffer sb=new StringBuffer();
        for(int val:a){
            sb.append(val+" ");

        }
        System.out.println(sb);

    }
    public static void reverse(int[] a){
        int i=0;
        int j=a.length-1;
        while(i<j){
            int temp=a[i];
           a[i]=a[j];
           a[j]=temp;
           j++;
           i++;
        }
    }

    public static void main(String[] arg) throws Exception{
      InputStreamReader in=new InputStreamReader(System.in);
      BufferedReader br=new BufferedReader(in);
      System.out.print("Enter the size of array :");
      int n=Integer.parseInt(br.readLine());
      int[] a=new int[n];
      for(int i=0;i<n;i++){
          a[i]=Integer.parseInt(br.readLine());

      }
      reverse(a);
      display(a);
    }
}
*/
import java.io.*;
import java.util.*;

public class reverseArray {
    public static void display(int[] a){
        StringBuilder sb = new StringBuilder();

        for(int val: a){
            sb.append(val + " ");
        }
        System.out.println(sb);
    }

    public static void reverse(int[] a){
        int i=0;
        int j=a.length-1;
        while(i<j){
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            j++;
            i++;
        }
    }


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = Integer.parseInt(br.readLine());
        }

        reverse(a);
        display(a);
    }

}