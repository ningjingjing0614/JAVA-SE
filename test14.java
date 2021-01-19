public class test14 {
    public static String myString(long[] array) {
        String beg = "[";
        for (int i = 0; i < array.length - 1; i++) {
            long tmp = array[i];
            beg = beg + tmp + ", ";
        }
        if (array.length != 0){
            long ret = array[array.length-1];
            beg += ret;
        }
        beg += "]";
        return beg;
    }

    public static long[] myCopyOf(long[] array, int len) {//数组的拷贝
        long[] ans = new long[len];
        int size = Integer.min(array.length, ans.length);
        for (int i = 0; i < size; i++) {
            ans[i] = array[i];
        }
        return ans;
    }

    public static long[] copyRange(long[] array, int from, int to) {
        long[] ans = new long[to - from];
        //i为新数组ans的下标
        //
//        int size = Integer.min()
        //i为新数组ans的下标
        for (int i = 0; i < ans.length; i++) {
            ans[i] = array[from + i];
        }
        return ans;
    }

}
