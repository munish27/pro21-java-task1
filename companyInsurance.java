import java.util.Scanner;

public class companyInsurance {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        String val = sc.nextLine();
        boolean insure = false;

        if(val.equals("married")){
            insure = true;
            System.out.println(insure);
        }else{
            if(val.equals("unmarried") && age>=30){
                insure =true;
                System.out.println(insure);
            } else if(val.equals("femaleMarried") && age >25) {
                insure = true;
                System.out.println(insure);
            }else{
                System.out.println(false);
            }
        }


    }
}
