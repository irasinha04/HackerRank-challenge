package mathematics;

import java.io.*;
import java.util.*;

public class FindThePoint {

    /*
     * Complete the findPoint function below.
     */
    static int[] findPoint(int px, int py, int qx, int qy) {
        double x2 = qx;
        double d = Math.sqrt((Math.pow(px - x2, 2)) + (Math.pow(py - qy, 2)));
        double m = (qy - py) / (x2 - px);
        int r[] = new int[2];
        r[0] = (int) (Math.sqrt(Math.pow(d, 2) / (1 + Math.pow(m, 2))) + x2);
        r[1] = (int) (m * (r[0] - x2) + qy);
        return r;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int n = Integer.parseInt(scanner.nextLine().trim());

        for (int nItr = 0; nItr < n; nItr++) {
            String[] pxPyQxQy = scanner.nextLine().split(" ");

            int px = Integer.parseInt(pxPyQxQy[0].trim());

            int py = Integer.parseInt(pxPyQxQy[1].trim());

            int qx = Integer.parseInt(pxPyQxQy[2].trim());

            int qy = Integer.parseInt(pxPyQxQy[3].trim());

            int[] result = findPoint(px, py, qx, qy);

            for (int resultItr = 0; resultItr < result.length; resultItr++) {
               System.out.print((String.valueOf(result[resultItr]))  + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
