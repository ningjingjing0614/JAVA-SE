package pack5;

public class Link2 {
    public static Node2 pushFront(Node2 head, int val){//头插

        Node2 node = new Node2(val);

        if (head == null){
//            return node;
            head = node;
            return head;
        }
        node.next = head;
        return node;
    }

    public static Node2 popFront(Node2 head){//头删
        if (head == null){
            throw new RuntimeException("链表为空");
        }
        head = head.next;
        return head;
    }

    public static Node2 pushBack(Node2 head, int val){//尾插

        Node2 node = new Node2(val);

        if(head == null){
            return node;
        }
        Node2 cur = head;
        while (cur.next != null){
            cur = cur.next;
        }
        cur.next = node;
        return head;
    }

    public static Node2 popBack(Node2 head, int val){//尾删
        if (head == null){
            throw new RuntimeException("链表为空");
        }
        if (head.next != null){//2个以上
            Node2 cur = head;
            while (cur.next.next != null){
                cur = cur.next;
            }
            cur.next = null;
            return head;
        }
        //链表中只有一个节点
        head = null;
        return head;
    }

    public static void myPrint(Node2 head){
        for (Node2 node = head; node!= null; node = node.next) {
            System.out.println("链表为："+node.val);
        }
    }

    public static void main(String[] args) {
        Node2 head = null;

        head = pushFront(head, 1);
        head = pushFront(head, 2);
        head = pushFront(head, 3);
        head = pushFront(head, 4);
        head = pushFront(head, 5);
        head = pushFront(head, 4);
        myPrint(head);
        System.out.println();


        myPrint(reverseLink(head));

//        head = popFront(head);
//        myPrint(head);

//        myPrint(removeElements2(head, 4));

        myPrint(back(head, 4));
    }

//    public static Node2 reverseLink(Node2 head) {
//        Node2 prev = null;
//        Node2 cur = head;
//
//        while (cur != null){
//            Node2 next = cur.next;
//            cur.next = prev;
//
//            prev = cur;
//            cur = next;
//        }
//        return prev;
//    }

//    public static Node2 removeElements2(Node2 head, int val) {
//        // 头插一个哨兵结点
//        Node2 newHead = new Node2(-1);
//        newHead.next = head;
//
//        Node2 prev = newHead;
//        while (prev.next != null) {
//            if (prev.next.val == val) {
//                prev.next = prev.next.next;
//            } else {
//                prev = prev.next;
//            }
//        }
//
//        return newHead.next;
//    }
    public static Node2 back(Node2 head, int k){
//        int count = 0;
//        for (Node2 cur = head; cur != null; cur = cur.next){
//            count++;
//        }




        Node2 first = head;

        for (int i = 0; i < k; i++) {
            first = first.next;
        }
        Node2 last = head;

        while (first != null){
            first = first.next;
            last = last.next;
        }
        return last;
    }

    public static Node2 newLink(Node2 node, int x) {

        Node2 last1 = new Node2(-1);
        Node2 last2 = new Node2(-2);
        Node2 fHead = last1;
        Node2 tHead = last2;

        for (Node2 cur = node; cur != null; cur = cur.next) {
            if (cur.val < x) {
                last1.next = cur;
                last1 = cur;
            } else {
                last2.next = cur;
                last2 = cur;
            }
        }
        last2.next = null;//防止出现死循环
        last1 = tHead.next;
        return fHead.next;
    }
    public static Node2 reverseLink(Node2 head) {
        Node2 cur = head;
        Node2 prev = null;

        while(cur != null){
            Node2 next = cur.next;
            cur.next = prev;

            prev = cur;
            cur = next;
        }
        return cur;
    }


}
