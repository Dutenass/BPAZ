import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.logging.Logger;
import java.util.logging.LoggingMXBean;


public class Solution {
    Thread thread = new MainCl();
    

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(scan.nextLine().trim());

       int[] grades = new int[n];

        for (int gradesItr = 0; gradesItr < n; gradesItr++) {
            int gradesItem = Integer.parseInt(scan.nextLine().trim());
            grades[gradesItr] = gradesItem;
        }

        int[] result = MainCl.func(grades);

        for (int resultItr = 0; resultItr < result.length; resultItr++) {
            bw.write(String.valueOf(result[resultItr]));
            

            if (resultItr != result.length - 1) {
                bw.write("\n");
            }
        }

        bw.newLine();

        bw.close();
    }
}