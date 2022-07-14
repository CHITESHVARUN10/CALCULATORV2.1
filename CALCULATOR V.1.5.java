import java.util.*;

class HomeWork {

    public static void main(String srgs[]) {
        Scanner sc = new Scanner(System.in);
        int input;

        // you can do any kind of calculation of 10 digit number.
        do {
            System.out.println("HI I AM YOUR CALCULATOR ");
            System.out.println("");
            System.out.println(" made by chitesh varun");
            System.out.println(
                    "TO ADD ANY TWO NUMBERS PLEASE TYPE THE FIRST NUMBER () AND PRESS ENTER AND THEN TYPE 1 AND AGAIN PRESS  ENTER AND TYPE YOUR SECOND NUMBER  THEN PRESS ENTER YOU WILL GET YOUR ANSWER.");
            System.out.println("             ");
            System.out.println(
                    "TO SUBTRACT ANY TWO NUMBERS PLEASE TYPE THE FIRST NUMBER () AND PRESS ENTER AND THEN TYPE 2 AND AGAIN PRESS  ENTER AND TYPE YOUR SECOND NUMBER  THEN PRESS ENTER YOU WILL GET YOUR ANSWER.");
            System.out.println("");
            System.out.println(
                    " TO THE PRODUCT  ANY TWO NUMBERS PLEASE TYPE THE FIRST NUMBER () AND PRESS ENTER AND THEN TYPE 3 AND AGAIN PRESS  ENTER AND TYPE YOUR SECOND NUMBER  THEN PRESS ENTER YOU WILL GET YOUR ANSWER.");

            int a = sc.nextInt();
            int ans = sc.nextInt();
            int b = sc.nextInt();

            int sum = a + b;
            int sub = a - b;
            int multi = a * b;
            int divide = a / b;
            int remain = a % b;

            if (ans == 1) {
                System.out.print("the sum of ");
                System.out.print(a);
                System.out.print(" and ");
                System.out.print(b);
                System.out.println(" is ");
                System.out.println(sum);
            } else if (ans == 2) {

                System.out.print(" the subraction of  ");
                System.out.print(a);
                System.out.print(" and ");
                System.out.println(b);
                System.out.println(" is ");
                System.out.println(sub);

            } else if (ans == 3) {
                System.out.println("the product of");
                System.out.println(a);
                System.out.println(" and ");
                System.out.println(b);
                System.out.println(" is ");
                System.out.println(multi);
            } else if (ans == 4) {
                System.out.println("the division of a and b is");
                System.out.println(divide);
            } else if (ans == 5) {
                System.out.println("the remainder of a and b is");
                System.out.println(remain);
            } else {
                System.out.println(" invalid please input a valid number which is maximum 10 digit ");
            }
            System.out.println("want to continue ? press (1) for yes and 2 for no");
            System.out.println(" made by chitesh varun");
            input = sc.nextInt();

        } while (input == 1);
        if (input == 2) {
            System.out.println("thank you user");
            System.out.println(" made by chitesh varun");
            // System.out.println("this was the last calculation you made");

        }
    }
}
