public class Bubblesortingtask {

    public static void bubbleSort(int[] num)
    {
        boolean swapped=true;
        int n=num.length;
        int temp=0;
        int count=0;//counter to counter the number of loops, for illustration purpose only not needed for the sorting itself.

        //the list is sorted if the last loop didn't do any swaps
        while(swapped)
        {
            swapped=false;

            //looping through the list and swap the current position and the next position as needed
            for(int i=0; i<n-1; i++)
            {
                //swap if the value of the current position is larger than the value of the next position
                //change > to < for descending order
                if(num[i]>num[i+1])
                {
                    temp=num[i];
                    num[i]=num[i+1];
                    num[i+1]=temp;
                    swapped=true;
                }

                //for illustration purpose only not needed for the sorting itself.
                System.out.print(count+" During Sorting: ");
                printArr(num);
                count++;
            }
            //After one whole iteration of the inner for loop, the last element should be in the correct position, thus we don't look at again in the next iteration.
            //Hence we decrease n by 1, so the number of inner for loop will decrease by 1 in the next iteration.
            n--;

        }
        System.out.println("count>>"+count);
    }

    public static void printArr(int[] arr)
    {
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String args[])
    {
        int [] intArr={56,1,64,3,22};
        System.out.print("Before: ");
        printArr(intArr);
        bubbleSort(intArr);
        System.out.print("After: ");
        printArr(intArr);
    }
}