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


        // Dynamic Data Structures: are the Data Structures whose size is not fixed at compile time
        // and can be decided at runtime depending upon requirements are called Dynamic Data structures.


    }
}