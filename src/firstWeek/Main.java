package firstWeek;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader StdIn = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.valueOf(StdIn.readLine()); // 객체 수 받음
        System.out.println(N);

        UF uf = new UF(N);

        while(!StdIn.readLine().equals("end"))
        {
            int p = Integer.valueOf(StdIn.readLine());
            System.out.println("p: " + p);
            int q = Integer.valueOf(StdIn.readLine());
            System.out.println("q: " + q );
            if(!uf.connected(p, q))
            {
                uf.union(p, q);
                System.out.println(p + "" + q);
            }
        }


    }
}
