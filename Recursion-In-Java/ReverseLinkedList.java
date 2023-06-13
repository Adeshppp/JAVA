public class ReverseLinkedList {


    public static void main(String[] args) {
        LL list1 = new LL();
        LL list2 = new LL();
        list1.addFirst(10);
        list1.addFirst(20);
        list1.addFirst(30);
        list1.addFirst(40);
        list1.addLast(50);
        list1.addLast(60);
        list1.addLast(70);
        list1.addLast(80);
        list1.printList();
        list1.sizeOfList();

        System.out.println();
        list2.addFirst(1);
        list2.addFirst(2);
        list2.addFirst(3);
        list2.addFirst(4);
        list2.addLast(5);
        list2.addLast(6);
        list2.addLast(7);
        list2.addLast(8);
        list2.printList();
        list2.sizeOfList();
    }


}

public class LL {
    private static int count = 1;
    private final String name = "List " + (count++);

    private int size = 0;
    ListNode end = null;
    ListNode head = null;

    static class ListNode {
        ListNode next;
        int val;

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        ListNode() {
        }
    }

    public void addFirst(int val) {
        size++;
        if (head == null) {
            ListNode node = new ListNode(val, null);
            head = node;
            end = node;
            return;
        }
        head = new ListNode(val, head);
    }

    public void addLast(int val) {
        size++;
        if (head == null) {
            ListNode node = new ListNode(val, null);
            head = node;
            end = node;
            return;
        }
        ListNode node = new ListNode(val, null);
        end.next = node;
        end = node;
    }

    public void printList() {
        System.out.println(this.name);
        ListNode node = head;
        while (node != null) {
            System.out.print(node.val + " ==> ");
            node = node.next;
        }
        System.out.println("Null");
    }

    
    public void sizeOfList() {
        System.out.println("Size of LinkedList " + this.name + " is " + size + ".");
    }
}


