public class Tshirtcompany extends Userchoices{

    String size;
    int count;
    String color;
    static {
        int black = 50;
        System.out.println("black t shirt " + black);
    }


    Tshirtcompany(String size,int count,String color){
        this.size = size;
        this.count = count;
        this.color = color;


        System.out.println("started size " + size );
    }


public static void main(String args[]){
//    Tshirtcompany vm = new Tshirtcompany();

    Tshirtcompany ut = new Tshirtcompany("all", 100, "all");
    ut.neww();

}


}