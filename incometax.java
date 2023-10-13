import java.util.Scanner;

public class incometax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your income");
        float income = sc.nextFloat();
        {
            if (income<=250000){
                System.out.println("u donnt have to pay any inncome tax");
            }
           else  if (income > 250000 && income < 500000) {
                System.out.println(0.05 * (income - 250000));
            } else if (income >= 50000 && income < 100000) {
                System.out.println(0.05 * (income - 250000) + 0.2 * (income - 500000));
            } else if (income > 100000) {
                System.out.println(0.05 * (income - 250000) + 0.2 * (income - 500000) + 0.3 * (income - 100000));
            }
            }


        }
    }

