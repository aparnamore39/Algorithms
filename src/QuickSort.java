import java.util.*;

public class QuickSort {

    static List<Integer> quickSort(List<Integer> arr) {
        if (arr.size() <= 1)
            return arr;

        int start = 0;
        int end = arr.size() - 1;
        int count = 0;

        quickSortHelper(arr, start, end);

        return arr;
    }

    static List<Integer> quickSortHelper(List<Integer> arr, int start, int end)
    {
        if (start>=end)
            return arr;

        Random rand = new Random();
        int pivot = arr.get(rand.nextInt(end-start)+start);


        System.out.println("Pivot:"+pivot);



        int smaller = start;
        int bigger = start;

        Collections.swap(arr,smaller, arr.indexOf(pivot));
      //  System.out.println("After pivot swap: " + arr.toString());

        pivot =arr.get(start);

        for (bigger = start+1; bigger<=end; bigger++)
        {
            if (arr.get(bigger) < pivot)
            {
                smaller++;
                Collections.swap(arr, smaller,bigger);
            }
        }
        Collections.swap(arr,start,smaller);
      //  System.out.println(arr.toString());
        quickSortHelper(arr, start, smaller-1);
        quickSortHelper(arr, smaller+1,end);

        return arr;
    }

    public static void main(String[] args) {

        List<Integer> arr = new ArrayList<Integer>();
        arr.add(4);
        arr.add(2);
        arr.add(8);
        arr.add(7);
        arr.add(1);
        arr.add(3);
        arr.add(5);
        arr.add(6);

        System.out.println(arr.toString());

        quickSort(arr);

        System.out.println(arr.toString());

    }
}
