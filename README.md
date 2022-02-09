# Practicing implementing different methods on a LinkedList and explaining them

## .addToHead(int data);

We need a currentNode to keep track of the first node in the list so we later can set it to be the next Node of the newHead Node.
The method takes a parameter "data" which needs to be passed into the newHead node. then we need to set head (this.head) to be equal the newHead.

## .addAddToTail(int data);

We need to create a Node, let's call it "tail" that is equal to the head (this.head). If the list is empty: make the tail equal to the head (this.head). We can check if the list is empty by making an if statement checking if tail is null. Else we loop with help the condition that gets the next node (see Node.java for the accessor method) until we get to the end of the list, we need to update the tail in the loop to get the next node. Outside the loop we set the next Node's data with help from the mutator method available from Node.java to be the next node. 

## .getNth(int index);

We need to store the current head in a variable. Let's call it currentHead. We need a count variable that will be used as a condition in an if statement inside a while loop. While the currentHead is not null, and we will update the looping condition by setting the current head to be equal the next Node. Inside the while loop we will make an if statement that returns currentHead's data if count is equal to index. Increment count. Outside the while loop we print the a message that the index passed as an argument does not exist, and that code will only execute if we don't satisy the if statements condition. 

## .reverse();

Refer to this page and especially the illustrative GIF before implementing this method: https://www.geeksforgeeks.org/reverse-a-linked-list/

## .printList();

we need to store the current head in a Node variable. We need an String output variable. And as long as the currentHead is not null we concatenate the current head's data to the ouput variable. We also update the current head to be equal the current head's next node.  Outside the while loop we print the output variable and then we return the output. 
