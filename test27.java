public class test27 {
    public static void main(String[] args) {
        int[] arr1 = new int[] {1,2,3,4,5};
        System.out.println(prac26.myToString(arr1));
        int[] arr2 ={};
        System.out.println(prac26.myToString(arr2));
        int[] arr3 = new int[5];
        System.out.println(prac26.myToString(arr3));
        System.out.println("!!!!!!!!!!!!!!!!!!!!!");
        System.out.println(prac26.myToString(prac26.myCopyOf(arr1, 3)));
        System.out.println(prac26.myToString(prac26.myCopyOf(arr1, 7)));
        System.out.println(prac26.myToString(prac26.myCopyOf(arr1, 5)));
        System.out.println(prac26.myToString(prac26.myCopyOf(arr2, 3)));
        System.out.println(prac26.myToString(prac26.myCopyOf(arr3, 3)));
//        System.out.println(prac26.myToString(prac26.myCopyOf(arr1, -1)));
        System.out.println("@@@@@@@@@@@@@@@@@@@@@");
        System.out.println(prac26.myToString(prac26.myCopyRange(arr1, 1, 4)));
        System.out.println(prac26.myToString(prac26.myCopyRange(arr1, 1, 3)));
    }
}
