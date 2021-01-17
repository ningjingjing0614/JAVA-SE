import java.util.Arrays;

public class test10 {
    //    public static void main(String[] args) {
//        //long[] a = new long[] { 1,2,3,4,5 };
//        long[] a = {1,2,2,3,4,5};
//        long b = 7;
//        int c = indexOf(a, b);
//        System.out.println(c);
//    }
//
//    public static int indexOf(long[] array, long target){
//        int tmp = 0;
//        for (long i : array) {
//            if (i == target){
//                return tmp;//返回下标
//            }
//            tmp ++;
//        }
//        return -1;//数组中无目标元素
//    }
    private static void testBinarySearch() {
        int[] arr = {1, 2, 3, 3, 4, 5, 6};//顺序排列
        System.out.println(Arrays.binarySearch(arr, 1));//返回下标
        System.out.println(Arrays.binarySearch(arr, 6));
        System.out.println(Arrays.binarySearch(arr, 3));

    }

    public static void main(String[] args) {
        testBinarySearch();
    }
}
