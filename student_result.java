import java.util.Scanner;
public class student_result {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name:");
        String name=sc.nextLine();
        System.out.println();
        System.out.println("Enter marks of subject 1:");
        int m1=sc.nextInt();
        System.out.println("Enter marks of subject 2:");
        int m2=sc.nextInt();
        System.out.println("Enter marks of subject 3:");
        int m3=sc.nextInt();
        System.out.println("Enter marks of subject 4:");
        int m4=sc.nextInt();
        System.out.println("Enter marks of subject 5:");
        int m5=sc.nextInt();
        int total=m1+m2+m3+m4+m5;
        double percentage=(total/500.0)*100;
        String grade;
        String result;
        if(percentage>=90){
           grade="A+";
           result="pass";
        }
        else if(percentage>=80){
            grade="A";
            result="pass";
        }
        else if(percentage>=70){
            grade="B";
            result="pass";
        }

        else if(percentage>=60){
            grade ="c";
            result="pass";
        }

        else if(percentage>=40){            
            grade="D";
            result="pass";
        } 
        else{
            grade="f";
            result="fail";
        }
        System.out.println("student name="+name);
        System.out.println("total marks="+total);
        System.out.println("Percentage="+percentage);
        System.out.println("Grade="+grade);
        System.out.println("Result="+result);
        sc.close();

    }
    
}
