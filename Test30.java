import java.util.Arrays;

public class Test30 {
    public static void main(String[] args) {
//        Dog dog = new Dog();
//        dog.name = "小花";
//        dog.age = 5;
//        System.out.println(dog.name);
//        System.out.println(dog.age);
//        dog.show();
        int[] arr = {1,2,3,2,4,1,9,54,5};
        Arrays.sort(arr);
        System.out.println( Arrays.toString(arr));
        int val = 0;
        System.out.println(Arrays.binarySearch(arr, val));
    }
}
//        System.out.println(dog.name);
//                System.out.println(dog.age);
//                dog.bark();
//                dog.run();
//dog.name = "小花";
//dog.age = 3;
//        dog.bark();
//        WashingMachine wm1 = new WashingMachine();
//        wm1.wash();