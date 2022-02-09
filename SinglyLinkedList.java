public class SinglyLinkedList {
    public Node head; // instance variable
    

    public SinglyLinkedList() {
        this.head = null; 
    }

     // add to the Head of a linked list

    public void addToHead(int data) {
        Node newHead = new Node(data); // the new head.
        Node currentHead = this.head; // the current head of the list / first Node in the list.
        this.head = newHead;         // the first Node in the list becomes the new head.
        if(currentHead != null) {   // if the first Node exists (the list isn't empty)
            this.head.setNextNode(currentHead); // Make the new head (stored in this.head ) next Node be the current node.
        }
    }

    // add to the tail of a linked list.

    public void addToTail(int data) {
        Node tail = this.head; // Keep track of the current Head in the list stored in a variable called tail.

        if (tail == null) {    // if the list is empty
            tail = this.head; //  the the tail becomes the head and the tail.
        } else {
            while (tail.getNextNode() != null) { // condition set to loop until we get to the end of the list.
                tail = tail.getNextNode();      // let's call this a stop condition.
            }
            tail.setNextNode(new Node(data));  // when we've reached the end of the list, we add the new node to be the next Node. 
        }
    }


    // return the value of the indexed position.

    public int getNth(int index) {
        Node currentHead = this.head; // keep track of the first node in the List.
        int count = 0;  // A count variable that will count the nodes. 

        while (currentHead != null) {
            if (count == index) {   // if count is 0 and index is 0 the first Node in the list will be returned.
                return currentHead.data; // return data.
            }
            count++; // increments count.
            currentHead = currentHead.getNextNode(); //update the looping condition.
        }

        System.out.println("Your input does Not Exist."); // if the code gets this far we passed in a wrong value.
        return 0;
    }

    public Node reverse() {
        Node prev = null; // we need a previous pointer
        Node current = this.head; // keeps track of the current Node. At the moment it is the first Node in the list.
        Node next = null; // we need a next pointer.
        while (current != null) { // if the first Node is not null / the list is not empty.
            next = current.getNextNode(); // first iteration: this will be the second Node in the list.
            current.next = prev; // first iteration it will point to null (pointing left).
            prev = current;     // We want this to come to the last node in the list so that we can set it equal to the Head and to point to the previous node every iteration.
            current = next;    // on the first iteration current is null, on the second iteration it points to the first Node in the list
        }
        this.head = prev; // Sets the head as the "last" Node after all iterations.

        return this.head;
    }

    public String printList() {
        Node currentHead = this.head; // current Head of the list / the first Node.
        String output = ""; // something to append the Data to. 
        while (currentHead != null) { // as long as the current Head is not Null
            output += currentHead.data + " ";  // add the data of the current Head to the string output.
            currentHead = currentHead.getNextNode(); // update the looping condition. 
        }
        System.out.println(output); // print out the output

        return output; // return the output.
        
    }

    public static void main(String[] args) {
        SinglyLinkedList names = new SinglyLinkedList();
        names.addToHead(3);
        names.addToHead(2);
        names.addToHead(1);
        names.addToTail(4);
        System.out.println(names.getNth(2)); // prints 3
        names.reverse(); // reverses the list 
        System.out.println(names.getNth(0)); // the "last" node is now the head because we reserved the List.. Can you tell what will be printed?
        names.printList();
      
        

    }
}
