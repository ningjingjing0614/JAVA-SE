import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class prac44 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
//        Collection<String> list1 = new ArrayList<>();
//        Iterable<String> list1 = new ArrayList<>();
        list1.add("ni");
        list1.add("wo");
        list1.add("ta");
//        Iterable<String> i1 = list1;

        Iterator<String> iter1 = list1.iterator();
        System.out.println(iter1.hasNext());
        System.out.println(iter1.next());
//        iter1.remove();
        System.out.println(iter1.hasNext());
        System.out.println(iter1.next());
        System.out.println(iter1.hasNext());
        System.out.println(iter1.next());
        System.out.println(iter1.hasNext());
//        System.out.println(iter1.next());
        while (iter1.hasNext()){
            System.out.println(iter1.next());
        }
        System.out.println(list1[1]);
    }
}
