package lk.ijse.project.Level04;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class case12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        NumberFormat usFormat = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat cnFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat fracFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        NumberFormat intFormat = NumberFormat.getCurrencyInstance(new Locale("en","in"));

        String us = usFormat.format(payment);
        String india = intFormat.format(payment);
        String france = fracFormat.format(payment);
        String china = cnFormat.format(payment);


        // Write your code here.

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
