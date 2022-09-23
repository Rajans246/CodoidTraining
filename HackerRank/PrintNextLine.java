import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class PrintNextLine {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         Scanner scan = new Scanner(System.in);
        int lineCounter =0;
        while (true) {
            if (!scan.hasNext()) break;
            lineCounter++;
            System.out.printf("%d %s %n", lineCounter, scan.nextLine());

    }
}}