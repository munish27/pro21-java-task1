import java.util.Scanner;

public class monthFinder {
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        int days = sc.nextInt();

        int months = (days%365)/30;
        int day = (days%365)%30;
        System.out.print("months= "+months);
        System.out.println("days= "+day);
    }
}
