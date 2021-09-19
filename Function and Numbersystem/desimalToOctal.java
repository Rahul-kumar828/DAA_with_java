import java.util.Scanner;
public class desimalToOctal {

    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int b=sc.nextInt();
        int octal=getValueInBase(n,b);
        System.out.println(octal);
    }
      public static int getValueInBase(int n,int b){
        int rv=0;
        int p=1;
        while (n>0){
            int dig=n%b;
            n=n/b;

           rv += dig*p;
           p=p*10;

        }
        return rv;

      }

}
