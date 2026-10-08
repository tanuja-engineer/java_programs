import java.util.Scanner;
public class stop_number {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int i=1;
        for(i=1;i<=10;i++){
            System.out.println("Enter the number");
            int n=sc.nextInt();
            if (n==15){
                break;
            }
        }
            System.out.println("stop");
        sc.close();

    }

    
}
