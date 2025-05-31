package lk.ijse.project;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
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

       /* *//*case-03*//*
        while (scanner.hasNextInt()) {
            int i = scanner.nextInt();
            double d = scanner.nextDouble();
            scanner.nextLine();
            String s = scanner.nextLine();

            System.out.println("String: " + s);
            System.out.println("Double: " + d);
            System.out.println("Int: " + i);
        }
        scanner.close();*/

     /*  *//* case-04*//*
        Scanner sc=new Scanner(System.in);

        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();
            System.out.printf("%-15s%03d\n", s1, x);
        }
        System.out.println("================================");
        */

     /*   *//*case - 05*//*
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        for (int i = 1; i <= 10; i++) {
            int r = N * i ;
            System.out.println(N +" x "+ i +" = " + r);
        }

        bufferedReader.close();*/

        /*case-06*/
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            for(int j=0;j<n;j++){
                a=a+b;
                System.out.println(a+" ");
                b=b*2;
            }
            System.out.println(" ");
        }
        in.close();
    }
}