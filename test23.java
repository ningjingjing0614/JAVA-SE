import java.util.Arrays;
public class test23 {
    public static void main(String[] args) {
//        int[] a = {1,2,3};
//        //int[] a;
//        //a = {1, 2, 3, 4};
//        //a = {1,2,34};
//        System.out.println(a);
//        int[] b = new int[] {1,2,3,4};
//        String c = Arrays.toString(b);
//        System.out.println(c);
//        long[] arr = {1,2,3,4,5,6};
//        long tar = 5;
//        System.out.println(indexOf(arr, tar));
//        System.out.println(indexOf(arr, 4));
////        int[] arr1 = {1,2,3,4,5,6};
////        System.out.println(indexOf(arr1, 2));
//        System.out.println(indexOf(arr, 9));
        int[] arr1 = {9,8,1,2,3,4};
        int[] arr2 = {0,1,2,3,4};
        int[] arr3 = {2,2,2,2};
        System.out.println(test22.maxVal(arr1));
        System.out.println(test22.maxVal(arr2));
        System.out.println(test22.maxVal(arr3));
        System.out.println("```````````````````````");
        System.out.println(test22.minVal(arr1));
        System.out.println(test22.minVal(arr2));
        System.out.println(test22.minVal(arr3));
        System.out.println("```````````````````````");
        System.out.println(test22.addSum(arr1));
        System.out.println(test22.addSum(arr2));
        System.out.println(test22.addSum(arr3));
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&");
//        System.out.println(Arrays.toString(test24.copeOf(arr1,3)));
//        System.out.println(Arrays.toString(test24.copeOf(arr1,4)));
//        System.out.println(Arrays.toString(test24.copeOf(arr1,5)));
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%");
        //System.out.println(test24.binary(arr2, 5));
        System.out.println(test24.binary(arr2, 4));
        System.out.println(test24.binary(arr2, 3));
        System.out.println(test24.binary(arr2, 2));
        System.out.println(test24.binary(arr2, 1));
        System.out.println(test24.binary(arr2, 0));


        System.out.println(Arrays.binarySearch(arr1,9));//由于arr1是无序的，所以二分查找返回任和值都是合理的。（条件是错误的，结果不可能正确）
    }
}
