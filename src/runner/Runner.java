package runner;

import calculator.Calculator;
import sortArrayByString.SortArrayByString;

/**
 * Created by Taras_Oliinyk on 9/2/2015.
 */
public class Runner {
    public static void main(String[] args) {


        SortArrayByString mysort = new SortArrayByString();
        mysort.sortArrayByStringLength();

        for (int i = 0; i < mysort.arr.length; i++) {
            System.out.println(mysort.arr[i]);
        }

        Calculator myCalc = new Calculator();
        myCalc.calculator();

    }
}
