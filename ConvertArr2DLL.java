class Node{
    int data;
    Node next;
    Node back;

    Node(int data,Node next,Node back){
        this.data = data;
        this.next = next;
        this.back = back;
    }
    Node(int data){
        this.data=data;
        this.next=null;
        this.back=null;
    }
}
public class ConvertArr2DLL {
    private static void print(Node head){
        while (head!=null) {
            System.out.print(head.data+" ");
            head = head.next;
        }
    }
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
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        Node head = convertArraytoDLL(arr);
        print(head);
    }
}
