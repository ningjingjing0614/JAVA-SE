public class prac29 {
    //二分查找返回要查找目标元素的下标
//    array是查找有序数组的范围   target是目标元素
    public static int binary(int[] array, int target) {
        int left = -1;
        int right = array.length;
        while (left + 1 < right) {
            int mid = (left + right) / 2;//中间元素的地址
            if (array[mid] < target) {
                left = mid;
            } else if (array[mid] > target) {
                right = mid;
            } else {
                return mid;
            }
        }
        //如果没找到，返回-1
        return -1;
    }

    public static void main(String[] args) {
        int[] array = new int[] {1,2,3,4,5};
        System.out.println(binary(array,3));
    }
}
