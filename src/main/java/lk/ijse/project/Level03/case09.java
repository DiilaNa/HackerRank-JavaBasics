package lk.ijse.project.Level03;

import java.util.Scanner;

public class case09 {
    private static Scanner sc = new Scanner(System.in);
    private static int B = sc.nextInt();
    private static int H = sc.nextInt();
    private static boolean flag=true;

    static {
        try {
            if (B<=0 || H<=0) {
                flag=false;
                throw new Exception("Breadth and height must be positive");
            }
        } catch (Exception e) {
            System.out.println(e);
            sc.close();
        }
    }

    public static void main(String[] args) {
        if(flag){
            int area=B*H;
            System.out.print(area);
        }
    }
}
