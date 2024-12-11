
/**
 * This a stack that implements an LinkedList to achieve O(1) efficiency when inserting/deleting elemnts in a "First In, Last Out" order
 *
 * @author (Nicholas Rapacciuolo)
 * @version (11/7/24)
 */
public class Stack<E> extends LinkedList<E>
{
    public boolean empty()
    {
        return size == 0;
    }
    
    public E peek()
    {
        if (!empty())
        {
            return head.data;
        }
        return null;
    }
    
    public E pop()
    {
        E data = null;
        if (!empty())
        {
            data = head.data;
            remove(0);
        }
        return data;
    }
    
    public E push(E data)
    {
        add(0, data);
        return data;
    }
    
    public int search(Object obj)
    {
        int index = 0;
        Node current = head;
         while (current != null)
         {
             if (current.data.equals((E) obj))
             {
                 return index;
             }
             current = current.next;
             index++;
            }
        return -1;
    }
    
    
    
}
