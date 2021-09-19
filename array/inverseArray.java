package array;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class inverseArray {
    public static void display(int[]a){
        StringBuilder sc=new StringBuilder();
        for(int val:a){
            sc.append(val + " ");
        }
        System.out.println(sc);
    }
    public static int[] inverse(int[] a){
        int[] inv=new int[a.length];
        for(int i=0;i<a.length;i++){
            int v=a[i];
            inv[v]=i;
        }
        return inv;
    }


    public static void main(String[] arg) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int []a=new int[n];
        for(int i=0;i<n;i++){
            a[i]= Integer.parseInt(br.readLine());
        }


        int[] inv=inverse(a);
        display(inv);

    }
}
