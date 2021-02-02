

public class test22 {
    //查找数组中第一次出现目标元素的下标
    public static int indexOf(long[] array, long target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }

    //找到数组中的最大值
    public static int maxVal(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    //找到数组中的最小值
    public static int minVal(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    //计算数组中所有元素之和
    public static int addSum(int[] array) {
        int sum = 0;
//        for (int i = 0; i < array.length; i++) {
//            sum += array[i];
//        }
        for (int val : array) {
            sum += val;
        }
        return sum;
    }




}
