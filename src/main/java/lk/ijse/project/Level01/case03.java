package lk.ijse.project.Level01;

import java.util.Scanner;

public class case03 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
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
