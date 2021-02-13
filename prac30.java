import java.util.Arrays;

public class prac30 {
    //冒泡排序
    //array是要排序的数组名，orde是排序规则是升序还是降序（0是降序，1是升序）
    public static int[] bubble(int[] array, int order) {
        int late = 0;
        int front = 1;
        while(front < array.length){
            //降序
            if(order == 0){
                while (array[front] > array[late]){
                    int tmp = array[front];
                    array[front] = array[late];
                    array[late] = tmp;
                    front++;
                    late++;
                }
            }
            if (order == 1) {
                if (array[front] < array[late]){
                    int tmp = array[front];
                    array[front] = array[late];
                    array[late] = tmp;
                }
            }

        }
        return array;
    }


    public static void main(String[] args) {
        int[] arr = new int[] {9,6,2,5,3,6,4,7};
        //System.out.println(Arrays.toString(bubble(arr, 1)));
        System.out.println(Arrays.toString(bubble(arr, 0)));
    }
}
