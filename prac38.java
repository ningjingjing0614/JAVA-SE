
import java.util.ArrayList;

public class prac38 {
    public static void main(String[] args) {
        ArrayList<String> arrl1 = new ArrayList<>();
        ArrayList<String> arrl2 = new ArrayList<>();
        arrl1.add("jij");
        arrl1.add(1, "erwr");
        System.out.println(arrl1);
        arrl1.add("jwwee");
        arrl1.add(1, "qeqeer");
        arrl1.add("jij");
        arrl1.add(1, "vvxxvwr");
        System.out.println(arrl1);
        System.out.println(arrl1.remove("jij"));
        System.out.println(arrl1);
        System.out.println(arrl1.remove(1));
        System.out.println(arrl1);
        System.out.println(arrl1.get(2));
        System.out.println(arrl1.set(2, "fds"));
        System.out.println(arrl1);
        System.out.println(arrl1.contains("fds"));
        System.out.println(arrl1.indexOf("fds"));
        System.out.println(arrl1.contains("fggg"));
        System.out.println(arrl1.indexOf("fdgs"));
        int[] arr1 = new int[]{1, 2, 3, 4, 5, 6};
        int[] arr2 = new int[]{3, 6, 9, 8};
        int[] arr3 = new int[]{3, 6, 9, 8, 1, 3, 5};
        System.out.println(threeConsecutiveOdds(arr1));
        System.out.println(threeConsecutiveOdds(arr2));
        System.out.println(threeConsecutiveOdds(arr3));
    }

    public static boolean threeConsecutiveOdds(int[] arr) {
        if (arr.length < 3) {
            return false;
        }
        int i = 0;
        int j = 1;
        int k = 2;
        while (k < arr.length) {
            if (arr[i] % 2 == 0 && arr[j] % 2 == 0 && arr[k] % 2 == 0) {
                return false;
            }
            i++;
            k++;
            j++;
        }
//        for (int i = 0; i < arr.length-2; i++) {
//            for (int j = 1; j < arr.length-1; j++){
//                for (int k = 2; k < arr.length; k++) {
//                    if (arr[i]%2 == 0 && arr[j]%2 == 0 &&arr[k]%2 == 0){
//                        return false;
//                    }
//                }
//            }
//        }
        return true;
    }
}
