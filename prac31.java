import java.util.Arrays;

public class prac31 {
    //冒泡排序法（从小到大排序）
    public static void bubble(int[] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                //比较相邻的两个元素，较大的数往后冒泡
                if (array[j] > array[j+1]){
                    int tmp = array[j];
                    array[j+1] = tmp;
                    array[j] = array[j+1];
                }
            }
        }
    }


    public static void main(String[] args) {
        int[] arr = new int[] {1,2,5,6,4,7,5};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }


}

