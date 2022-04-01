package No1;

/**
 * 希尔排序
 */
public class Test16 {
    private static void shellSort(int[] a){
        for(int interval = a.length>>1;interval>0;interval = interval>>1){
            for(int i =interval;i<a.length;i++){
                int target = a[i];
                int j=i-interval;
                while (j>-1&&target<a[j]){
                    a[j+interval] =a[j];
                    j-=interval;
                }
                a[j+interval] =target;
            }

        }
    }

    public static void main(String[] args) {
              int[ ] a =new int[]{1,1,3,3,4,8,6,4,7,8,1,5,6};
              shellSort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }
}
