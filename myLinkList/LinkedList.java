
/**
 * LinkedList data structure that stores elements in a list by utlizing nodes with pointers.
 *
 * @author (Nicholas Rapacciuolo)
 * @version (11/7/24)
 */
public class LinkedList<E> implements List<E>, Queue<E>
{
    class Node
    {
        E data; 
        Node next;
    }
    
    Node head;
    Node tail;
    int size;
    
    public LinkedList()
    {
        head = tail = null;
        size = 0;
    }
    
    public boolean add(E data)
    {
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = null;
        if (size > 0) 
        {
            tail.next = newNode;
            tail = newNode;
        }
        else
        {
            // empty linked list
            head = tail = newNode;
        }
        size++;
        return true;
    }
    
    private Node getNode(int index)
    {
        if (index < 0 || index >= size)
        {
            return null;
        }
        
        Node tmp = head;
        for (int i = 0; i < index; i++)
        {
            tmp = tmp.next;
        }
        return tmp;
    }
    
    public boolean add(int index, E data)
    {
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = null;
        if (index == size)
        {
            return add(data);
        } else if (index == 0) {
            // a new head
            newNode.next = head;
            head = newNode;
            if (tail == null)
            {
                // add the first node
                tail = newNode;
            }
        } else {
            Node preNode = getNode(index - 1);
            if (preNode == null)
            {
                return false;
            }
            // insert the data inside the list
            newNode.next = preNode.next;
            preNode.next = newNode;
        }
        size++;
        return true;
    }
    
     public boolean remove(int index)
     {
         if (index < 0 || index >= size)
        {
            return false;
        }
    
        if (index == 0)
        {
            // remove the first node
            head = head.next;
            if (head == null)
            {
                tail = null;
            }
        } 
        else if (index == size - 1)
        {
            // remove the last node
            Node preTail = getNode(index - 1);
            if (preTail != null)
            {
                preTail.next = null;
                tail = preTail;
            }
        }
        else
        {
            // remove some in the middle
            Node preNode = getNode(index - 1);
            if (preNode != null)
            {
                Node current = preNode.next;
                preNode.next = current.next;
                current.next = null;
            }
        }
        size--;
        return true;
     }
     
     /**
      * @param: index of the node that is being searched for
      * 
      * @post: returns the node at the index of it is present, else null is returned
      */
     
     public E get(int index)
     {
         Node current = getNode(index);
         
         if (current == null)
         {
             return null;
         }
         return current.data;
     }
     
     public boolean set(int index, E element)
     {
         Node current = getNode(index);
         if (current == null)
         {
             return false;
         }
         current.data = element;
         return true;
     }
     
     /**
      * @param: looks for the input element in the linked list
      * 
      * @post: returns true if the element is in the list and false otherwise
      */
     
     public boolean contains(E element)
     {
         Node current = head;
         while (current != null)
         {
             if (current.data == element)
             {
                 return true;
             }
             current = current.next;
         }
         return false;
     }
     
     /**
      * @param: N/A
      * 
      * @post: prints the contents of the LinkedList to the terminal
      */
     
     public String toString()
     {
         String out = "[";
         Node tmp = head;
         while (tmp != null)
         {
            out += tmp.data;
            tmp = tmp.next;
            if (tmp != null)
            {
                out += ", ";
            }
         }
         out += "]";
         return out;
     }
     
     /**
      * @param: N/A
      * 
      * @post: reverses the list
      */
     
     public boolean reverse()
     {
         Node prev = null;
         Node next = null;
         Node current = head;
         while (current != null)
         {
             next = current.next;
             current.next = prev;
             prev = current;
             current = next;
         }
         head = prev;
         return true;
     }
     
     public E peek()
     {
         return get(0);
     }
     
     public E poll()
     {
        E data = null;
        if (size != 0)
        {
            data = head.data;
            remove(0);
        }
        return data;
     }
     
     public static void main (String args[])
     {
         LinkedList<Integer> list = new LinkedList<Integer>();
         list.add(0);
         list.add(1);
         list.add(3);
         list.add(2, 2);
         list.add(0, -1);
         
         
         System.out.println("list: " + list);
         list.remove(4);
         list.remove(0);
         list.remove(1);
         System.out.println("list(after remove): " + list);
         System.out.println("contains(0), expected true, tested: " + list.contains(0));
         System.out.println("contains(3), expected false, tested: " + list.contains(3));
         System.out.println("get(2), expected null, tested: " + list.get(2));
         System.out.println("get(1), expected 2, tested: " + list.get(1));
         System.out.println("set(1, 1), expected true, tested: " + list.set(1, 1));
         System.out.println("set(-1, 1), expected false, tested: " + list.set(-1, 1));
         System.out.println("list(after all tests): " + list);
         
         // Testing reverse method
         LinkedList<Integer> List = new LinkedList<Integer>();
         List.add(1);
         List.add(2);
         List.add(3);
         List.add(4);
         List.add(5);
         System.out.println("--------------------------------------------------");
         System.out.println("List: " + List);
         List.reverse();
         System.out.println("Testing reverse() method, expected [5, 4, 3, 2, 1]; actual: " + List);
         List.reverse();
         System.out.println("Reversing the list back to its orginal state, expected [1, 2, 3, 4, 5]; actual: " + List);
     }
    
}
