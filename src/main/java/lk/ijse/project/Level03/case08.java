package lk.ijse.project.Level03;

import java.util.Scanner;

public class case08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 1;
        while (scanner.hasNextLine()) {
            System.out.println(count + " " + scanner.nextLine());
            count++;
        }
        scanner.close();
    }
}
