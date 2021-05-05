public class MergeSort {


    static void sort(int[] A, int start, int end)
    {
        if (start>=end)
            return;

        //calculate mid
        int mid = (start+end)/2;

        //recursively call sort to partition the array until only element is present in the list
        sort(A, start, mid);
        sort(A, mid+1, end);

        Merge(A, start, mid, end);

    }

    static void Merge(int[] A, int start, int mid, int end)
    {
        int i = start;
        int j = mid+1;

        int[] aux = new int[A.length];
        int k =start;

        while (i<=mid && j<=end)
        {
            if(A[i] <= A[j])
            {
                aux[k] = A[i];
                i++;
            }
            else
            {
                aux[k] = A[j];
                j++;
            }
            k++;
        }

        while (i<=mid)
        {
            aux[k] = A[i];
            i++;
            k++;
        }

        while (j<=end)
        {
            aux[k] = A[j];
            j++;
        }

        for (int x = start; x<=end; x++)
        {
            A[x] = aux[x];
        }
    }


    public static void main(String[] args) {

        int[] A = {6,4,3,8,1,5,2,7};

        sort(A,0,A.length-1);

        for (int x = 0; x<A.length; x++)
        {
            System.out.println(A[x]);
        }


    }

}
