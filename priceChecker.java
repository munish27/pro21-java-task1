import java.util.Scanner;

public class priceChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double pricePerItem = sc.nextDouble();
        int quantity = sc.nextInt();
        if(quantity>=10){
            double totalAmount = 0.1*(pricePerItem*quantity);
            System.out.println(totalAmount);
        }else{
            System.out.println(pricePerItem*quantity);
        }
    }
}
