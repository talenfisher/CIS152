# Instructions
Implement a queue using an array in class. Make your queue size 5. 

An array will need to handle wrap around. 
Think about removing from the front of a full queue. 
The queue will not be empty, but the items will be in indices 1, 2, 3 and 4 and index 0 will be free and the queue is not longer full.
It would be inefficient to move all elements up in the array. However, the head is now at 1 and the tail is at 4, so you would add the 5th item in index 0.

- Queue() creates an empty queue, queue is new and empty.
- enqueue(item) adds a new item to the queue, queue is modified.
- dequeue() removes and returns an item, queue is modified.
- isEmpty() returns a boolean and tests for an empty queue, queue is not modified.
- size() returns the int size of the queue, queue is not modified
- print() prints the queue from front to rear, queue is not modified.
- peek() prints the front element, queue is not modified.

Driver should print the results of the following

- enqueue("dog")
- enqueue("cat")
- enqueue("mouse")
- enqueue("pig")
- enqueue("bird")
- size()
- enqueue("puppy")
- size()
- dequeue()
- dequeue()
- size()
- dequeue()
- peek()
- dequeue()
- dequeue()
- size()
- isEmpty()
