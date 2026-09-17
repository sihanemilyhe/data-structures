import java.util.PriorityQueue;
import java.util.Queue;


/**
 * This program demonstrates a priority queue of to-do items. The
 * most important to-do items are removed first.
*/
public class PriorityQueueDemo
{
    public static void main(String[] args)
    {
        //Create a priority queue of strings
        //a prioirty queue MUST be composed of Comparable objects
        Queue<String> students = new PriorityQueue<>();
        students.add("Shiva");
        students.add("Claire");
        students.add("Ludovic");
        students.add("Manny");
        students.add("Don");
        students.add("Goof");

        //the next high priority object is moved to the front of the queue
        while (students.size()>0){
            System.out.println(students.remove());
        }
    }
}
