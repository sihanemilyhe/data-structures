import java.util.Stack;
import java.util.Scanner;

/**
 * Class for simulating a driveway and a street, using stacks
 * of cars with license plate numbers as representation.
*/
public class Driveway
{
    /**
      * Stack representing the cars in the driveway.
    */
    private Stack<Integer> driveway;
    /**
      * Stack representing the cars in the street.
    */
    private Stack<Integer> street;

    /**
      * Constructor.
    */
    public Driveway()
    {
        driveway = new Stack<Integer>();
        street = new Stack<Integer>();


    }

    /**
      * Add the given license plate to the driveway.
      *
      * @param licensePlate number of license plate.
    */
    public void add(int licensePlate)
    {
       if (driveway.contains(licensePlate))
        {
            System.out.println("Car " + licensePlate + " is already in the driveway.");
        }
        else
        {
            driveway.push(licensePlate);
        }
        print();
    }

    /**
      * Remove the given license plate from the driveway.
      *
      * @param licensePlate number of license plate.
    */
    public void remove(int licensePlate)
    {
        if (!driveway.contains(licensePlate))
        {
            System.out.println("Car " + licensePlate
                + " is not in the driveway.");
            print();
            return;
        }

        int car = driveway.pop();

        while (car != licensePlate)
        {
            street.push(car);
            car = driveway.pop();
        }

        while (!street.isEmpty())
        {
            driveway.push(street.pop());
        }

        print();
    }

    /**
      * Prints the driveway and street details to the screen.
    */
    public void print()
    {
        System.out.println("In Driveway, starting at first in (one license plate per line):");
        // Print the cars in the driveway here
        for (int licensePlate : driveway)
        {
            System.out.println(licensePlate);
        }

        System.out.println("In Street, starting at first in (one license plate per line):");
        // Print the cars in the street here
        for (int licensePlate : street)
        {
            System.out.println(licensePlate);
        }

    }
}
