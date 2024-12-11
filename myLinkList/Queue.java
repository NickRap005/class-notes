
/**
 * The queue interface is needed to create the methods needed to uses a LinkedList or any other data structure as a queue. 
 * Note that queues are in a "First In, First Out" order.
 *
 * @author (Nicholas Rapacciuolo)
 * @version (11/7/24)
 */
public interface Queue<E>
{
    public boolean add(E e);
    public E peek();
    public E poll();
}
