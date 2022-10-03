import java.util.Scanner;

public class grossSalaryChecker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double basicSalary = sc.nextInt();
        double ta = 0.1*basicSalary;
        double da = 0.15*basicSalary;
        double hra = 0.2*basicSalary;
        double pf = 0.12*basicSalary;

        double bonus = 0.1*basicSalary;
        int grossSalary = (int) ((int) basicSalary+da+ta+hra+bonus-pf);
        System.out.println(grossSalary);


    }
}
