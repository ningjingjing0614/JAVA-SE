package pack5;

public class Link1 {
    public static void main(String[] args) {
        Node1 node1 = new Node1();
        Node1 node2 = new Node1();
        Node1 node3 = new Node1();
        Node1 node4 = new Node1();

        node1.val = 1;
        node1.next = node2;

        node2.val = 3;
        node2.next = node3;

        node3.val = 2;
        node3.next = node4;

        node4.val = 6;
        node4.next = null;

        Node1 head = node1;
//        System.out.println(head);
//        Node1 cur = head;
//        int count = 0;
//        while (cur.next != null){
//            System.out.println(cur.val);
//            count ++;
//            cur = cur.next;
//
//        }
//        System.out.println();
//        System.out.println(cur.val);
//        System.out.println(count);

        //通过遍历找到倒数第二个节点
//        while (cur.next.next != null){
//            cur = cur.next;
//        }
//        System.out.println(cur.val);

        //通过遍历找到链表的第n个节点
//        int n = 1;
//        for (int i = 1; i < n; i++) {
//            cur = cur.next;
//        }
//        System.out.println(cur.val);

        //通过遍历计算链表中的元素个数
//        int count = 0;
//        while(cur != null){
//            count++;
//            cur = cur.next;
//        }
//        System.out.println(count);

        //通过遍历，找到链表中是否包含某个元素
//        int num = 6;
//        int count = 0;
//        while (cur != null){
//            if(cur.val == num){
//                System.out.println("找到了");
////                break;
//            }
//            count++;
//            cur = cur.next;
////            System.out.println("ff");
//
//        }
//        System.out.println(count);
//        node2.next = node4;
////        System.out.println(node3.val);
//        Node1 cur = head;
//        while (cur != null){
//            System.out.println(cur.val);
//            cur = cur.next;
//        }
        Node1 node5 = new Node1();
        node5.val = 9;
        node5.next = null;

//        node2.next = node5;
//        node5.next = node3;
//        Node1 cur = head;
//        while (cur != null) {
//            System.out.println(cur.val);
//            cur = cur.next;
//        node5.next = node2.next;
//        node2.next = node5;
//        Node1 cur = head;
//        while (cur != null) {
//            System.out.println(cur.val);
//            cur = cur.next;
//        }





    }
}


