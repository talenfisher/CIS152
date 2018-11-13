/**
 * This program tests my implementation of a queue which
 * demonstrates use of a circular array, and the FIFO methodology
 * 
 * @author Talen Fisher
 */
public class QueueDriver {

    /**
     * Program entry point
     * 
     * @param args command line args
     */
    public static void main(String[] args) {
        // create the queue
        Queue queue = new Queue(5);

        // run some tests
        printQueueAction("enqueue(dog)", queue.enqueue("dog"), queue);
        printQueueAction("enqueue(cat)", queue.enqueue("cat"), queue);
        printQueueAction("enqueue(mouse)", queue.enqueue("mouse"), queue);
        printQueueAction("enqueue(pig)", queue.enqueue("pig"), queue);
        printQueueAction("enqueue(bird)", queue.enqueue("bird"), queue);
        printQueueAction("size()", queue.size(), queue);
        printQueueAction("enqueue(puppy)", queue.enqueue("puppy"), queue);
        printQueueAction("size()", queue.size(), queue);
        printQueueAction("dequeue()", queue.dequeue(), queue);
        printQueueAction("dequeue()", queue.dequeue(), queue);
        printQueueAction("size()", queue.size(), queue);
        printQueueAction("dequeue()", queue.dequeue(), queue);
        printQueueAction("peek()", queue.peek(), queue);
        printQueueAction("dequeue()", queue.dequeue(), queue);
        printQueueAction("dequeue()", queue.dequeue(), queue);
        printQueueAction("size()", queue.size(), queue);
        printQueueAction("isEmpty()", queue.isEmpty(), queue);

        // add more elements to demonstrate use of the circular array
        printQueueAction("enqueue(rabbit)", queue.enqueue("rabbit"), queue);
        printQueueAction("enqueue(turtle)", queue.enqueue("turtle"), queue);
        printQueueAction("enqueue(fish)", queue.enqueue("fish"), queue);
        printQueueAction("enqueue(shark)", queue.enqueue("shark"), queue);
        printQueueAction("enqueue(spider)", queue.enqueue("spider"), queue);
        printQueueAction("enqueue(groundhog)", queue.enqueue("groundhog"), queue);
        printQueueAction("isFull()", queue.isFull(), queue);

    }

    /**
     * Function for printing out queue tests/actions in a uniform format.
     * Example output:
     * enqueue(test):                        test [test]
     *   
     * @param key the test key/name (string representation of the method call)
     * @param value the value returned from the method that was called (this can be anything)
     * @param queue the queue used for the test
     */
    public static <Value> void printQueueAction(String call, Value value, Queue queue) {
        System.out.printf("%-20s %20s ", call+":", value);
        queue.print(); // output stack contents
        System.out.println();
    }
}
