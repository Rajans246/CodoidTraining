import java.util.Scanner;
public class Userchoices{

    public void neww() {
        int i = 50;


        System.out.println("T shirt counts" + i);
        while (i > 0) {
            Scanner st = new Scanner(System.in);
            System.out.print("size ");
            String size = st.nextLine();

            if (str == null || str == "") {
                return false;
            }

            // Traverse the string from
            // start to end
            for (int i = 0; i < n; i++) {
                // Check if the specified
                // character is not a letter then
                // return false,
                // else return true
                if (!Character.isLetter(str.charAt(i))) {
                    return false;
                }

            if ((st < 'A' || st > 'Z') && (st < 'a' || st > 'z')) {




            System.out.print("color ");
            String color = st.nextLine();

            System.out.print("count ");
            int count = st.nextInt();
            if (count <= i) {
//                Userchoices ut = new Userchoices(size, count, color);
//                int i= count;
                int totalcount = 0;
                totalcount = totalcount + count;

                System.out.println("  shirt size " + size + "  color "+ color + "  count "+ count );
                System.out.println("already booked shirts  " + totalcount);
                i = i - totalcount;
                System.out.println("remaing no of available shirt count  " + i);
            }
            else {

//                Userchoices ut = new Userchoices(size, count, color);
//                int i= count;
//                totalcount = totalcount;

//                System.out.println(" shirt size " + size + "color "+ color + "count "+ count );
                System.out.println("please enter the count " + i + " or below" );
//                i = i - totalcount;
                System.out.println("remaing no of available shirt count  " + i);


            }
            }
            else{
                System.out.println("please enter the string only" );
            }


        }
    }

}

