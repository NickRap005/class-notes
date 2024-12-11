import java.util.Random;
/**
 * The purpose of driver queue is to test the queue interface via implementing the "Hot Potato" game.
 *
 * @author (Nicholas Rapacciuolo)
 * @version (11/7/24)
 */
public class DriverQueue
{
    public static void hotPotato(LinkedList<Integer> q)
    {
        while (true)
        {
            // if the queue has one element left, return
            if (q.size < 2)
            {
                return;
            }
            
            // generate a random number, [1, 100)
            Random ran = new Random();
            int num = ran.nextInt(99) + 1;
            
            // use the random number to loop dequeue and enqueue
            
            
            
            // do dequeue
        }
    }
}
