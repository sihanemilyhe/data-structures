import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * This program simulates a print queue. Note that documents are printed
 * in the same order as they are submitted.
*/
public class QueueDemo
{
    public static void main(String[] args)
    {
        // Create a print queue of strings (using a linked list)
        Queue<String> jobs = new LinkedList<>();

        //Add some print jobs
        jobs.add("Jason: Quarter 2 Expense REport");
        jobs.add("Evan: Recipe for Banana Bread");
        jobs.add("Emily: Top Secret Document");

        System.out.println("Printing:"+jobs.remove()); //removes Jason's expense stuff

        //Add some more print jobs
        jobs.add("Noah: Grcery List");
        jobs.add("Emily: Really Top Secret Document");
        jobs.add("Emily: Can i get fired for this?");
        System.out.println("Printing: "+jobs.remove()); //prints Evan's recipe
        System.out.println("Printing:"+jobs.remove()); //prints Emily's top secreet document

        System.out.println("Boss: Emily's Termination Letter");
        //using a for loop
        for (int i = 0; i<jobs.size();i++){
            System.out.println(jobs.remove());
        }
        //using a while loop
        while (jobs.size()>0){
            System.out.println(jobs.remove());
        }

        // Create a to do list
        //the workorder class has an int priotity of a string descripption
        Queue<WorkOrder> toDo = new PriorityQueue<>();

        //lower priority is considered more important
        toDo.add(new WorkOrder(3,"Water Plants"));
        toDo.add(new WorkOrder(2, "Make Dinner"));
        toDo.add(new WorkOrder(1, "Conquer World"));
        toDo.add(new WorkOrder(9, "Play video games"));
        toDo.add(new WorkOrder(1, "Study for chapter 15 test"));
        // Objects are NOT stored in priority order
        System.out.println(toDo);

        //Objects will be removed in priority order
        while (toDo.size()>0){
            System.out.println(toDo.remove());
        }

    }
}
