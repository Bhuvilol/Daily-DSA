for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next=temp;
            mover = temp;
        }