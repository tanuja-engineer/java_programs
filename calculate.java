import java.util.Scanner;
public class calculate{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int i=1;
        int sum=0;
        for(i=1;i<=n;i++){
        sum=sum+i;
        }
        System.out.println("Sum="+sum);
        sc.close();
    }
}