import java.util.Arrays;

public class test16 {
    public static void main(String[] args) {
//        int[][] a = new int[5][3];
//        int[] e = a[1];
//        System.out.println(e[1]);
////        a[1][0] = 10;
//        e[0] = 10;
//        long[] a = {1,2,3,4};
//        long[] b = Arrays.copyOf(a, a.length);
//        b[2] = 10;
//        System.out.println(b[2]);
//        System.out.println(a[2]);
//        int[][] arr = new int[3][4] {{1,2,3}, {4,5,6}, {7,8,9}, {10,11,12}};
        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        myPrint(arr);

    }

    public static void myPrint(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print("    "+array[i][j]);
            }
            System.out.println();
            
        }
//        for (int i = 0; i < array[0].length; i++) {
//            System.out.print(array[0][i]+ "  ");
//        }
    }
}
