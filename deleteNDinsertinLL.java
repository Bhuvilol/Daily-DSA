class myexception extends Exception{
    myexception(String msg){
        System.out.println(msg);
    }

}
class Node{
    int data;
    Node next;

    Node(int data1, Node next1){
        this.data=data1;
        this.next=next1;
    }
    Node(int data1){
        this.data = data1;
        this.next=null;
    }
}
public class deleteNDinsertinLL {
    private static Node convertArr2LL(int [] arr){
        Node head = new Node(arr[0]);
        Node mover = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next=temp;
            mover = temp;
        }
        return head;
    }
    private static Node removeHead(Node head){
        if (head == null) {
            return head;
        }
        head = head.next;
        return head;
    }
    private static Node removeLast(Node head){
        Node temp = head;
        if (head == null || head.next==null ) {
            return null;
        }
        while (temp.next.next!=null) {
            temp=temp.next;
        }
        temp.next=null;
        return head;
    }
    private static Node removek(Node head, int k){
        Node temp = head;
        int count = 0;
        Node prev = null;;
        if (head==null ) {
            return head;
        }
        if (k==1) {
            return head;
        }
        while (temp!=null) {
            count++;
            if (count == k) {
                prev.next=prev.next.next;
            }
            prev=temp;
            temp=temp.next;
        }
        return head;
    }
    private static Node removeElement(Node head, int k){
        Node temp = head;
        Node prev = null;;
        if (head==null ) {
            return head;
        }
        if (head.data==k) {
            head = head.next;
            return head;
        }
        while (temp!=null) {
            if (temp.data == k) {
                prev.next=prev.next.next;
            }
            prev=temp;
            temp=temp.next;
        }
        return head;
    }
    private static Node insertAtBegin(Node head, int a){
        return new Node(a, head);
    }
    private static Node insertAtEnd(Node head, int b){
        if (head == null ) {
            return new Node(b);
        }
        Node temp = head;
        while (temp.next!=null) {
            temp = temp.next;
        }
        Node newNode = new Node(b);
        temp.next = newNode;
        return head;
    }
    private static Node insertatK(Node head, int pos, int data) throws myexception{
        Node temp = head;
        int count =0;
        if (head == null && pos ==1) {
            return new Node(data);
        }
        if (pos == 1) {
            return new Node(data, temp);
        }
        while (temp!=null) {
            count++;
            if (count == (pos-1)) {
                Node newNode = new Node(data);
                newNode.next=temp.next;
                temp.next=newNode;
                break;
            }
            temp = temp.next;
        }
        if (pos-1>count) {
           throw new myexception("Out of bound"); 
        }
        return head;
    }
    private static Node insertBeforeValue(Node head, int el, int val){
        if (head==null) {
            return null;
        }
        if (head.data==val) {
            return new Node(el, head);
        }
        Node temp = head;
        while (temp.next!=null) {
            if (temp.next.data==val) {
                Node newNode = new Node(el, temp.next);
                temp.next=newNode;
                break;
            }
            temp = temp.next;
        }
        return head;
    }
    private static void print(Node head){
        while (head!= null) {
            System.out.print(head.data+" ");
            head = head.next;
        }
        System.out.println();
    }
    public static void main(String[] args) throws myexception {
        int arr[] = {2,3,4,5};
        Node head = convertArr2LL(arr);
        System.out.println("Original ll :");
        print(head);

        // head = removeHead(head);
        // System.out.println("After removing head:"); 
        // print(head);

        // head = removeLast(head);
        // System.out.println("After deleting the tail");
        // print(head);

        // System.out.println("Removing kth elemrnt from the node :");
        // head = removek(head, 3);
        // print(head);

        // head = removeElement(head, 3);
        // System.out.println("Removing following element from the node :");
        // print(head);

        System.out.println("Inserting a value in node :");
        head = insertAtBegin(head, 100);
        //or
        head = new Node(300, head);
        print(head);

        System.out.println("Inserting a node at the end of the node :");
        head = insertAtEnd(head, 200);
        print(head);

        System.out.println("Inserting at various postion of node :");
        head = insertatK(head, 1, 1000);
        print(head);
        head = insertatK(head, 2, 400);
        print(head);
        // head = insertatK(head, 11, 700);
        // print(head);
        
        head = insertBeforeValue(head, 55, 3);
        System.out.println("Imserting a value after a element :");
        print(head);
    }
}
