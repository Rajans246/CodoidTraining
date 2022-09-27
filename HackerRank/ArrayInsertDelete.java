import java.io.*;
import java.util.*;

public class ArrayInsertDelte {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
       Scanner scan = new Scanner(System.in);
       int num = scan.nextInt();
       int temp; 
       List<Integer> array = new ArrayList<>(); 
       for(int i=0 ; i<num;i++) {
           temp = scan.nextInt();
           array.add(temp);
       }
       int getnum = scan.nextInt();
       for (int i=0;i<getnum;i++) {
       if (getnum > 1) {
          
           String typeInsDel = scan.next();
           if (typeInsDel.equalsIgnoreCase("Insert")) {
               
               int new_index_insert = scan.nextInt();
               int new_value_insert = scan.nextInt();
               array.add(new_index_insert,new_value_insert);
           }
 
           if (typeInsDel.equalsIgnoreCase("Delete")) {
  
               int removeindex = scan.nextInt();
               array.remove(removeindex);
           }          
       }
       }

       array.forEach(x -> System.out.print(x+" "));  
        
        
        
    }
}
