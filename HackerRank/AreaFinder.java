import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class AreaFinder {

// Write your code here
static{
    
    Scanner sc = new Scanner(System.in);
    
    int B = sc.nextInt();
    int H = sc.nextInt();
    
    if(B > 0 && H > 0 ){
        System.out.println(B * H);
    }
    
    else{
        System.out.println("java.lang.Exception: Breadth and height must be positive");
    }
    
}

public static void main(String[] args){
    
}
}