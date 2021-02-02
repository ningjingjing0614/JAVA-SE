public class test24 {
    //数组元素二分查找返回下标
    public static int binary(int[] array, int target) {
        int left = -1;
        int right = array.length;
        //前闭后开
        while(left < right - 1){
            int mid = (left + right)/2;
            if (array[mid] < target){
                left = mid;
            }
            else if(array[mid] > target){
                right = mid;
            }
            else{
                return mid;
            }
        }
        return -1;
    }



    //复制数组
    public static int[] copeOf(int[] array, int len) {
        int[] sArray = new int[len];
        if (array.length >= len) {//原数组长度大于目标数组长度
            for (int i = 0; i < array.length; i++) {
                sArray[i] = array[i];
            }

        }
        if (array.length < len) {//原数组长度小于目标数组长度
            for (int i = 0; i < len; i++) {
                sArray[i] = array[i];
            }
        }
        return sArray;
    }





































}
