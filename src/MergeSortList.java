import java.util.ArrayList;
import java.util.List;

public class MergeSortList {

    static int  mergeCount = 0;

    static List<Integer> Sort(List<Integer> list)
    {
        if(list.size() <= 1) {
            return list;
        }

        int start = 0;
        int end = list.size();
        int mid = (start+end)/2;
        //System.out.println("Mid: "+mid);

        List<Integer> leftArray = new ArrayList<Integer>(list.subList(0,mid));
        List<Integer> rightArray = new ArrayList<Integer>(list.subList(mid,list.size()));


        Sort(leftArray);
        Sort(rightArray);
        Merge(leftArray, rightArray,list);

        return list;
    }


    static  void Merge (List<Integer> left, List<Integer> right, List<Integer> list)

    {
        int i = 0;
        int j = 0;
        int k =0;


        while (i<left.size() && j<right.size())
        {
            if (left.get(i) < right.get(j))
            {
                list.set(k,left.get(i));
                k++;
                i++;
            }
            else
            {
                list.set(k,right.get(j));
                j++;
                k++;
                mergeCount = mergeCount+ (k-i);
            }
        }

        while (i<left.size())
        {
            list.set(k,left.get(i));
            i++;
            k++;
        }

        while (j<right.size())
        {
            list.set(k,right.get(j));
            j++;
            k++;
        }
    }

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(7);
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(7);
        list.add(-2);
        list.add(-4);
        list.add(-6);
       // list.add(1);

      //  list.set(4,6);

        Sort(list);

      //  System.out.println(list.toString());

        System.out.println("-----Sorted Elements-----");
        for (int i = 0; i<list.size(); i++)
        {
            System.out.println(list.get(i));
        }
    }
}
