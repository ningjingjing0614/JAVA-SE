import java.util.Arrays;


//    public static void main(String[] args) {
////        int[] num1 = {1,2,3,4};
////        int[] num2 = {1,2,3,4};
//////        int[] num1 = new int[]{1,2,3,4};
//////        int[] num2 = new int[]{1,2,3,4};
//////        System.out.println(num1 == num2);
//////        System.out.println(num1.equals(num2));
////        System.out.println(Arrays.equals(num1, num2));
//////        equals
//
//

    class yoException extends Exception{

}
public class prac43 {
    public static void mama() throws yoException{

//        throw new yoException();
        throw new RuntimeException("ffff");
    }
}
