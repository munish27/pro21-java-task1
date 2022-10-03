import java.util.Scanner;

public class vote {
    public static void ageCalc(int age){
        if(age>=18){
            System.out.println("Yes, he can vote");
        }else{
            System.out.println("NO, he cannot vote");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        ageCalc(age);
    }

}
