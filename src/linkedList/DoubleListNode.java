package linkedList;

public class DoubleListNode {
    public int value;

    public DoubleListNode next; //指向下一个结点

    public DoubleListNode pre;  //指向上一个结点

    public DoubleListNode() {
    }

    public DoubleListNode(int value) {
        this.value = value;
    }

    public DoubleListNode(int value, DoubleListNode next) {
        this.value = value;
        this.next = next;
    }

    public DoubleListNode(int value, DoubleListNode next, DoubleListNode pre) {
        this.value = value;
        this.next = next;
        this.pre = pre;
    }
}
