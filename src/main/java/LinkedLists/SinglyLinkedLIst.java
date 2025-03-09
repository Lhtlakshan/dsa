package LinkedLists;

public class SinglyLinkedLIst {

    Node head;
    Node tail;

    int size;

    public SinglyLinkedLIst() {
        this.size = 0;
    }

    void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
        size++;

        if(tail == null){
            tail = head;
        }
    }

    void insertLast(int val){
        if(tail == null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    void insert(int val , int index){
        if(index == 0){
            insertFirst(val);
            return;
        }
        if(index == size){
            insertLast(val);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
            size++;
        }

        Node node = new Node(val,temp.next) ;
        temp.next = node;
        size++;

    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    void display(){
        Node temp = head;
        while(temp != null){
            System.out.println(temp + "->");
            temp = temp.next;
            size++;
        }
    }

    public int deleteFirst() {
        int val = head.val;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return val;
    }

    int deleteLast(){
        if(size <= 1){
            return deleteFirst();
        }

        Node secondLast = get(size - 2);
        int val = tail.val;
        tail = secondLast;
        tail.next = null;
        size--;
        return val;
    }

    int delete(int index){
        if(index == 0){
            return deleteFirst();
        }
        if(index == size -1){
            return deleteLast();
        }

        Node prev = get(index - 1);
        int val = prev.next.val;

        prev.next = prev.next.next;
        size--;
        return val;
    }

    Node find(int value){

        Node node = head;
        while(node !=null){
            if(node.val == value){
                return node;
            }
            node = node.next;
        }
        return null;
    }

    Node get(int index){
        Node node = head;

        for (int i = 0; i < index; i++) {
            node = node.next;
        }

        return node;
    }

    class Node{
        int val;
        Node next;

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }

        public Node(int val) {
            this.val = val;
        }

    }
}
