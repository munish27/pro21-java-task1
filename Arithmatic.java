import java.util.Scanner;

public class Arithmatic { // + - * / %


//    public void add()
//    {
//        Scanner sc  = new Scanner(System.in);
//        System.out.println("Enter any two numbers");
//        int num1 = sc.nextInt();
//        int num2 = sc.nextInt();
//        int result = num1+num2;
//        System.out.println("Addition = " + result);
//    }

    public int sub(int a , int b)
    {
        return (a-b);
    }
    public int add1(int a , int b)
    {
        return (a+b);
    }
    public int divide(int a, int b){
        return (a/b);
    }
    public int mul(int a, int b)
    {
        return (a*b);
    }
    public int mod(int a, int b){
        return (a%b);
    }
    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);
        Arithmatic obj = new Arithmatic();
        // obj.add();

        System.out.println("Enter any two numbers");
        int a= sc.nextInt();
        int b= sc.nextInt();
        // int result = ;
        System.out.println("Subtraction = " + obj.sub(a,b));
        System.out.println("Add = " + obj.add1(a,b));
        System.out.println("Divide = " + obj.divide(a,b));
        System.out.println("Multiply = " + obj.mul(a,b));
        System.out.println("Mod = " + obj.mod(a,b));


    }
}
