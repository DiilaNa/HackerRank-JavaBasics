package lk.ijse.project.Level03;

import java.util.Scanner;

public class case06 {
    public static void main(String[] args) {
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
