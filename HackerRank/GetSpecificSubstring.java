import java.util.Scanner;

public class GetSpecificSubstring {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        int comp;
        int upto = s.length() - k;


        for(int i = 1; i <= upto; i++) {

            String sub = s.substring(i, i + k);

            comp = sub.compareTo(smallest);
            if(comp < 0) smallest = sub;


            comp = sub.compareTo(largest);
            if (comp > 0) largest = sub;

        }

        return smallest + "\n" + largest;



    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));

//   Inputs:
//        welcometojava
//        3

    }
}