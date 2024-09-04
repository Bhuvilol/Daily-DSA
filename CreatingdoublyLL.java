class Node{
    int data;
    Node next;
    Node prev;

    Node(int data,Node next,Node prev){
        this.data = data;
        this.next = next;
        this.prev = prev;
    }
    Node(int data){
        this.data=data;
        this.next=null;
        this.prev=null;
    }
}
public class CreatingdoublyLL {
    
    public static void main(String[] args) {
        int []arr = {1,2,3,4,5};
        Node head = new Node(arr[0]);
    }
}
