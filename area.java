import java.util.Scanner;

public class area {
    public static void areaCircle(int input){
        int areaC =  (int) (3.14*(Math.pow(input,2)));
        System.out.println(areaC);
    }
    public static void areaSquare(int input){
        System.out.println(input*input);
    }
    public static void areaTriangle(int input, int input1){
        System.out.println((input*input1)/2);
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int input1 = sc.nextInt();

        areaCircle(input);
        areaSquare(input);
        areaTriangle(input, input1);
//        System.out.println("circle: ", );
//        System.out.println("square:", areaSquare(input));
//        System.out.println("triangle", areaTriangle(input, input1));
       }
}
