package calculator;


import java.util.Scanner;

public class Calculator {

    public void calculator() {


        Scanner sc = new Scanner(System.in);
// declare the variables
        Double number1, number2;
        String operator;
        char exit;

        boolean enter = true;

        while (enter) {

            System.out.println("Enter number 1");
            number1 = sc.nextDouble();

            System.out.println("enter operator");
            operator = sc.next();
            operator.charAt(0);

            System.out.println("enter number 2");
            number2 = sc.nextDouble();

// use switch to select an operator
            switch (operator) {

                case "+":
                    System.out.println(number1 + number2);
                    break;

                case "-":
                    System.out.println(number1 - number2);
                    break;

                case "*":
                    System.out.println(number1 * number2);
                    break;

                case "/":
                    // in case of dividing by 0
                    if (number2 == 0){
                        System.out.println("Please enter correct value");
                        break;
                    }

                    System.out.println(number1 / number2);

                    break;

                default:
                    System.out.println("Please enter correct value");
            }

            System.out.println("If you want to continue - press any key, otherwise - press N");
            exit = sc.next().toUpperCase().charAt(0);
            if(exit == 'N'){
                enter = false;
            }
        }
    }
}
