import java.util.Scanner;
public class Userchoices{

    public void neww() {
        int i = 50;

        System.out.println("T shirt counts" + i);
        while (i > 0) {
            Scanner st = new Scanner(System.in);

            String size = st.nextLine();
            String color = st.nextLine();
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
                System.out.println("please enter the count in between the " + i );
//                i = i - totalcount;
                System.out.println("remaing no of available shirt count  " + i);


            }


        }
    }

}

