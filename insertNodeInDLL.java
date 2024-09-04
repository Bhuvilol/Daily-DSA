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
public class insertNodeInDLL {
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
    private static Node insertBeforeHead(Node head,int val){
        Node newHead = new Node(val, head, null);
        head.back=newHead;
        return newHead;
    }
    private static Node insertBeforeTail(Node head, int val){
        if (head.next==null) {
            return insertBeforeHead(head, val);
        }
        Node temp = head;
        while (temp.next!=null) {
            temp = temp.next;
        }
        Node prev = temp.back;
        Node newtail =new Node(val, temp, prev);
        prev.next=newtail;
        temp.back=newtail;
        return head;
    }
    private static Node insertAtKthEl(Node head ,int val, int k){
        if (k==1) {
            return insertBeforeHead(head, val);
        }
        Node temp = head;
        int cnt = 0;
        while (temp!=null) {
            cnt++;
            if (cnt==k) {
                    Node prev = temp.back;
                    Node newNode = new Node(val, temp, prev);
                    prev.next=newNode;
                    temp.back=newNode;
                    return head;
                }
                temp = temp.next;
            }
            return head;
    }
    private static void inserBeforeNode(Node temp,int val){
        Node prev = temp.back;
        Node newNode = new Node(val, temp, prev);
        prev.next=newNode;
        temp.back=newNode;
    }
    public static void main(String[] args) {
        int[] arr = {12,34,56,78,90};
        Node head = convertArraytoDLL(arr);
        print(head);
        Math.ceil(60);

        // head = insertBeforeHead(head, 55);
        // print(head);

        // head = insertBeforeTail(head, 40);
        // print(head);

        // head = insertAtKthEl(head, 10,2);
        // print(head);

        inserBeforeNode(head.next, 33);
        print(head);
    }
}
