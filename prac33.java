public class prac33 {
    //格式打印二维数组的函数
    public static void myPrint(int[][] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.print("[");
            for (int j = 0; j < array[i].length; j++) {

                if (j == array[i].length-1) {
                    System.out.printf("%-2d",array[i][j]);
                }else{
                    System.out.printf("%-2d,",array[i][j]);
                }
            }
            if(i == array.length - 1){
            System.out.println("]");
        }else {
                System.out.println("],");
            }
        }
    }


    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12}};
        myPrint(arr);
    }
}
