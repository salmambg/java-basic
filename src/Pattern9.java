import java.util.Scanner;

public class Pattern9 {
    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);
        int n;
        System.out.println(" Enter any integer: ");
        n = object.nextInt();

        for(int number= n; number >= 1; number--) {
            for(int num = 1; num <= number; num++) {
                if(num%2 == 0) {
                    System.out.print(0);
                }else{
                    System.out.print(1);
                }
            }
            System.out.println();
        }
    }
}
