import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



//    If N is odd, print Weird
//    If N is even and in the inclusive range of  2 to 5 , print Not Weird
//    If N is even and in the inclusive range of  6 to 20 , print Weird
//    If N is even and greater than 20, print Not Weird

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();


        if(N%2 == 0)
        {
            //    If N is even and in the inclusive range of  2 to 5 , print Not Weird
            //    If N is even and greater than 20, print Not Weird

            if(N > 20 || N<5 && N >2){
                System.out.println("Not Weird");
            }


            //    If N is even and in the inclusive range of  6 to 20 , print Weird
            else if(N >= 6 && N <= 20)
            {
                System.out.println("Weird");
            }
        }
        else
        {
            //    If N is odd, print Weird
            System.out.println("Weird");
        }
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();
    }
}
