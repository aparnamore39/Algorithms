public class InsertionSort {


    static void Insertion(int[] arr)
    {
        int n = arr.length;

        for (int i = 1; i<n; i++)
        {
            int key = arr[i];
            int j = i-1;

            while (j>=0 && arr[j]>key)
            {
               arr[j+1] = arr[j];
               j=j-1;
            }
            arr[j+1] = key;
        }
    }

    public static void main(String[] args) {

        int[] arr = {8,2,4,9,3,6};

        Insertion(arr);

        for (int i = 0 ; i<arr.length; i++)
        {
            System.out.println(arr[i]);
        }

    }
}
