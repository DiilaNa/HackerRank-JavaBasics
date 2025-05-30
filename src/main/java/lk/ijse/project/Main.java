package lk.ijse.project;

import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        /*  *//*case-01*//*

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        System.out.println(a);

        int b = scanner.nextInt();
        System.out.println(b);

        int c = scanner.nextInt();
        System.out.println(c);*/

        /*  *//*case-02*//*

        do {
            int N = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            if (N % 2 == 1) {
                System.out.println("Weird");
            } else {
                if ((N > 2 && N < 5)) {
                    System.out.println("Not Weird");
                } else if (N > 6 && N <= 20) {
                    System.out.println("Weird");
                } else if (N > 20) {
                    System.out.println("Not Weird");
                }
            }
        } while (scanner.hasNextInt());*/

        /*case-03*/
        while (scanner.hasNextInt()) {
            int i = scanner.nextInt();
            double d = scanner.nextDouble();
            scanner.nextLine();
            String s = scanner.nextLine();

            System.out.println("String: " + s);
            System.out.println("Double: " + d);
            System.out.println("Int: " + i);
        }
        scanner.close();
    }
}