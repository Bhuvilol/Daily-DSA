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
public class traversingLL {
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
    // private static void print(Node head){
    //     while (head!= null) {
    //         System.out.print(head.data+" ");
    //         head = head.next;
    //     }
    //     System.out.println();
    // }
    public static void main(String[] args) {
        int arr[] = {2,3,4,5};
        Node head = convertArr2LL(arr);
        int length = 0;

        //traversing a linkedList
        while (head!=null) {
            System.out.print(head.data+" ");
            head = head.next;
            length++;
        }
        System.out.println("\nThe length of the linked list is "+length);
    }
}
