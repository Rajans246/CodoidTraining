import java.util.Scanner;

public class AnagramsSolution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        a = a.toLowerCase();
        b = b.toLowerCase();
        char[] al = a.toCharArray();
        char[] bl = b.toCharArray();
        //sorting them by alphabetic order
        java.util.Arrays.sort(al);
        java.util.Arrays.sort(bl);
        return java.util.Arrays.equals(al,bl);
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
