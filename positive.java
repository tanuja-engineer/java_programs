import java.util.Scanner;
public class positive {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=1;
        for(i=1;i<=10;i++){
            System.out.println("Enter the number:");
            int num=sc.nextInt();
            if (num>0){
                System.out.println("positive:"+num);
            }
        }
        sc.close();
    }

    
}
