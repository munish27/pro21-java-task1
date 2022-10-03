import java.util.Scanner;

public class greatest {

    public static void greater(int a, int b){
        if(a>b){
            System.out.println("a is greater"+a);
        }else{
            System.out.println("a is greater"+b);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        greater(a, b);
    }
}
