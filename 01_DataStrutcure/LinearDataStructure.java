import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class LinearDataStructure {
    public static void main(String[] args) {


        /**
         * Linear Data Structure can be Classified as Static Data Structure and Dynamic Data Structure
         * Static Data Structure: are the Data structures whose size is declared and fixed at Compile Time
         * and cannot be changed later are called Static Data structures.
         */


        /**
         Array :
         An array is the simplest data structure where a collection of similar data elements takes place and
         each data element can be accessed directly by only using its index number.

         Array Advantages :
         Random access
         Easy sorting and iteration
         Replacement of multiple variables

         Array Disadvantages :
         Size is fixed
         Difficult to insert and delete
         If capacity is more and occupancy less, most of the array gets wasted
         Needs contiguous memory to get allocated

         Array Applications :
         For storing information in a linear fashion
         Suitable for applications that require frequent searching
         */

        String[] fruits = new String[3];
        fruits[0] = "Apple";
        fruits[1] = "Orange";
        fruits[2] = "KIWI";

        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
        }
        System.out.println("***********************");


        /**
         * Dynamic Data Structures: are the Data Structures whose size is not fixed at compile time
         * and can be decided at runtime depending upon requirements are called Dynamic Data structures.
         */

        /**
         * What is Linked List?
         * Linked list data structure helps the required objects to be arranged in a linear order.
         *
         * Linked List Advantages :
         * Dynamic in size
         * No wastage as capacity and size is always equal
         * Easy insertion and deletion as 1 link manipulation is required
         * Efficient memory allocation
         *
         * Linked List Disadvantages :
         * If head Node is lost, the linked list is lost
         * No random access is possible
         *
         * Linked List Applications :
         * Suitable where memory is limited
         * Suitable for applications that require frequent insertion and deletion
         */


        LinkedList<String> cars = new LinkedList<>();
        cars.add("Pride");
        cars.add("Samand");
        cars.add("BMW");
        for (int i = 0; i < cars.toArray().length; i++) {
            System.out.println(cars.get(i));
        }
        System.out.println("***********************");



        /**
         * What is a stack?
         * A stack is a representation of nodes. There are two components to each node: data and next (storing address of next node). Each node’s data portion contains the assigned value, and its next pointer directs the user to the node that has the stack’s subsequent item. The highest node in the stack is referred to as the top.
         *
         * Features of Stack :
         * Linear Data Structures using Java
         * Follows LIFO: Last In First Out
         * Only the top elements are available to be accessed
         * Insertion and deletion takes place from the top
         * Eg: a stack of plates, chairs, etc
         * 4 major operations:
         * push(ele) – used to insert element at top
         * pop() – removes the top element from stack
         * isEmpty() – returns true is stack is empty
         * peek() – to get the top element of the stack
         * All operation works in constant time i.e, O(1)
         *
         * Stack Advantages :
         * Maintains data in a LIFO manner
         * The last element is readily available for use
         * All operations are of O(1) complexity
         *
         * Stack Disadvantages :
         * Manipulation is restricted to the top of the stack
         * Not much flexible
         *
         * Stack Applications :
         * Recursion
         * Parsing
         * Browser
         * Editors
         */

        Stack<String> heroes = new Stack<>();
        heroes.push("Batman");
        heroes.push("Superman");
        System.out.println(heroes.peek());
        System.out.println(heroes.search("Batman"));
        System.out.println(heroes.search("Superman"));
        heroes.pop();
        System.out.println(heroes.peek());
        System.out.println("***********************");


        /**
         * Queue
         * What is Queue?
         *
         * The queue is called an abstract data structure. Data is always added to one end (enqueued),
         * and removed from the other (dequeue).
         * Queue uses the First-In-First-Out approach and data item that was stored initially will be accessed first in a queue.
         *
         * Features of Queue
         * Linear Data Structure
         * Follows FIFO: First In First Out
         * Insertion can take place from the rear end.
         * Deletion can take place from the front end.
         * Eg: queue at ticket counters, bus station
         *
         * 4 major operations:
         * enqueue(ele) – used to insert element at top
         * dequeue() – removes the top element from queue
         * peekfirst() – to get the first element of the queue
         * peeklast() – to get the last element of the queue
         * All operation works in constant time i.e, O(1)
         *
         * Queue Advantages :
         * Maintains data in FIFO manner
         * Insertion from beginning and deletion from end takes O(1) time
         *
         * Queue Applications :
         * Scheduling
         * Maintaining playlist
         * Interrupt handling
         */

        Queue<String> languages = new LinkedList<>();
        languages.add("javascript");
        languages.add("java");

        System.out.println(languages);
        languages.remove();
        System.out.println(languages);
        System.out.println("***********************");













    }
}