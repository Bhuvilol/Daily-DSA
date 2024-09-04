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
public class deleteNodeDLL {
    private static void print(Node head){
        while (head!=null) {
            System.out.print(head.data+" ");
            head = head.next;
        }
        System.out.println();
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
    private static Node deletehead(Node head){
        if (head==null||head.next==null) {
            return null;
        }
        Node prev = head;
        head = head.next;
        head.back=null;
        prev.next=null;

        return head;
    }
    private static Node deleteTail(Node head){
        if (head==null || head.next==null) {
            return null;
        }
        Node cur = head;
        while (cur.next!=null) {
           cur = cur.next;
        }
        Node prev = cur.back;
        prev.next = null;
        cur.back = null; 
        return head;
    }
    private static Node deleteKthEl(Node head,int k){
        
        int cnt = 0;
        Node temp = head;
        while (temp!=null) {
            cnt++;
            if (cnt==k) {
                Node prev = temp.back;
                Node front = temp.next;
                if (prev==null && front==null) {
                    return null;
                }
                else if (prev == null){
                    return deletehead(head);
                }
                else if (front == null) {
                    return deleteTail(head);
                }
                else{
                    prev.next=front;
                    front.back=prev;

                    temp.next=null;
                    temp.back=null;
                    return head;
                }
            }
            temp=temp.next;
        }
        return head;
    }
    private static void deleteNode(Node temp){
        //head node is not asked to delete because this leads to non-existance of entire node
        Node prev = temp.back;
        Node front = temp.next;
        if (temp.next==null) {
            prev.next=null;
            return;
        }
        prev.next=front;
        front.back=prev;

        temp.next= temp.back=null;
    }
    public static void main(String[] args) {
        int[] arr = {12,34,56,78,90};
        Node head = convertArraytoDLL(arr);
        print(head);

        // head = deletehead(head);
        // print(head);

        // head = deleteTail(head);
        // print(head);

        // head = deleteKthEl(head, 6);
        // print(head);

        deleteNode(head.next.next);
        print(head);
    }
}
