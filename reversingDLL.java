class Node{
    int data;
    Node next;
    Node back;
    Node(int data){
        this.data = data;
        this.next = null;
        this.back=null;
    }
    Node(int data,Node next,Node back){
        this.data = data;
        this.next=next;
        this.back=back;
    }
}
public class reversingDLL {
    private static Node convertArraytoDLL(int []arr){
        Node head = new Node(arr[0]);
        Node back = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i], null, back);
            back.next=temp;
            back = temp;
        }
        return head;
    }
    private static void print(Node head){
        while (head!=null) {
            System.out.print(head.data+" ");
            head = head.next;
        }
        System.out.println();
    }    
    private static Node reverseI(Node head){
        if (head == null || head.next==null) {
            return head;
        }
        Node cur = head;
        Node prev = null;
        while (cur!=null) {
            prev = cur.back;
            cur.back = cur.next;
            cur.next=prev;
            cur =cur.back;
        }
        return prev.back;
    }
    public static void main(String[] args) {
        int arr[]={12,34,56,78,90};
        Node head = convertArraytoDLL(arr);
        print(head);

        head = reverseI(head);
        print(head);
    }
}
