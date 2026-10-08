import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enetr the number");
        int n=sc.nextInt();
        int reverse=0;
        int remainder;
        while (n!=0) {
            remainder=n%10;
            reverse=reverse*10+remainder;
            n=n/10;
            
        }
        System.out.println("Reverse="+reverse);
        sc.close();
    }
    
}
