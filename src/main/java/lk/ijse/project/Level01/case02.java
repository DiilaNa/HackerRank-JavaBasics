package lk.ijse.project.Level01;

import java.util.Scanner;

public class case02 {
    public static  final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
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
        } while (scanner.hasNextInt());
    }
}
