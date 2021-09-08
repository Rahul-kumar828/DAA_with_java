import java.util.Scanner;
public class factorial {
    public static void display(int n ,int r,int npr){
        System.out.println(n + "p" + r + "=" + npr);
    }
    public static int fact(int x){
     int rv=1;
     for(int i=1;i<=x;i++){
         rv *= i;


     }
     return rv;

    }

    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int r=sc.nextInt();


       int nFact= fact(n);
        int nmrFact=(n-r);

        int npr =nFact / nmrFact;
        display(n,r,npr);
    }
}
