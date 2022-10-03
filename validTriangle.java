import java.sql.SQLOutput;
import java.util.Scanner;

public class validTriangle {
    public static void vTrianlge(int a, int b, int c){
        if(a+b >c || a+c >b || b+c>a){
            System.out.println("Valid Triangle");
        }else{
            System.out.println("Not valid Triangle");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        vTrianlge(a,b,c);

    }
}
