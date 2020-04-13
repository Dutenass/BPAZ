import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.logging.Logger;
import java.util.logging.LoggingMXBean;


public class Solution {

  
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
    	
    	System.out.println("Main thread started...");
    	
        Thread t = new Thread(() ->{
        	
        	System.out.println("second thread started...");
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(scan.nextLine().trim());

       int[] grades = new int[n];
       
       MainCl Maincl = new MainCl();
       
        for (int gradesItr = 0; gradesItr < n; gradesItr++) {
            int gradesItem = Integer.parseInt(scan.nextLine().trim());
            grades[gradesItr] = gradesItem;
        }

        int[] result = Maincl.func(grades);

        for (int resultItr = 0; resultItr < result.length; resultItr++) {
            try {
				bw.write(String.valueOf(result[resultItr]));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            

            if (resultItr != result.length - 1) {
                try {
					bw.write("\n");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        }

        try {
			bw.newLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        try {
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        });
        t.start();
        System.out.println("second thread closed");
        System.out.println("Main thread closed");
    }
}