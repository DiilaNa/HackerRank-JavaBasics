package lk.ijse.project.Level02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class case05 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        for (int i = 1; i <= 10; i++) {
            int r = N * i ;
            System.out.println(N +" x "+ i +" = " + r);
        }

        bufferedReader.close();
    }
}
