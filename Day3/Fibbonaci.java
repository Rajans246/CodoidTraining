import java.util.Scanner;
class Fibbonaci{
    public static void main(String args[])
    {

        Scanner st = new Scanner(System.in);
        System.out.println(" Enter count of fib series you want");
        int count = st.nextInt();
        System.out.println(" The fibbonaci series are ");
        int n1=0,n2=1,n3,i;
        System.out.print(n1+" "+n2);//printing 0 and 1

        for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed
        {
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }

    }

}