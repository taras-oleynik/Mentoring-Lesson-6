package culculator;


import java.util.Scanner;

public class Calculator {

    public void calculator() {


        Scanner sc = new Scanner(System.in);
// объявление переменных
        Double number1, number2, result = null;
        String operator;

        boolean enter = true;

        while (enter) {

            System.out.println("Enter number 1");
            number1 = sc.nextDouble();

            System.out.println("enter operator");
            operator = sc.next();
            operator.charAt(0);

            System.out.println("enter number 2");
            number2 = sc.nextDouble();

// используем switch для переопределения знака и дальнешего действия
            switch (operator) {

                case "+":
                    result = number1 + number2;
                    break;

                case "-":
                    result = number1 - number2;
                    break;

                case "*":
                    result = number1 * number2;
                    break;

                case "/":
                    result = number1 / number2;
                    break;

                default:
                    System.out.println("Please enter correct value");
            }

            System.out.println(result);
        }
    }
}
