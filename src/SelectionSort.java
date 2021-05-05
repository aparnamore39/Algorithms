


public class SelectionSort {

   /* static int minLocation(int[] arr, int loc) {

        for (int i = loc + 1; i < arr.length; i++) {
            if (arr[loc] > arr[i]) {
                loc = i;
            }

        }
        return loc;
    }

    static void sortNumbers(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int loc = minLocation(arr, i);

            if (loc != i) {
                int temp = arr[i];
                arr[i] = arr[loc];
                arr[loc] = temp;
            }
        }

    }*/


   static void sortNumbers(int[] arr)
   {
       for (int i = 0; i<arr.length; i++)
       {
           int min = i;
           for (int j =i+1; j<arr.length; j++)
           {
               if(arr[min]>arr[j])
               {
                   int temp = arr[min];
                   arr[min]=arr[j];
                   arr[j]=temp;
               }
           }
       }
   }


    public static void main(String[] args) {

        int[] arr = {5,4,3,2,1};

        sortNumbers(arr);

        for (int i =0; i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }

    }

}



