public class twoSumBruteForce {

    public static void main(String[] args) {

        int[] a = new int[]{2,5,9,1,3};
        int target = 11;
        int sum =0;

        for (int i = 0; i < a.length; i++) {
            for (int j=i+1; j<a.length;j++){
                sum = a[i]+a[j];

                if (sum == target)
                {
                    System.out.println(true);
                    break;
                }
            }
        }
        if(sum!=target)
        {
            System.out.println(false);
        }
    }
}
